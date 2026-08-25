package java_prep.Project;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class TokenBucketRateLimiter {
    private final long maxCapacity;
    private final long refillTokensPerSecond;
    private final Map<String, TokenBucket> buckets = new ConcurrentHashMap<>();

    public TokenBucketRateLimiter(long maxCapacity, long refillTokensPerSecond) {
        this.maxCapacity = maxCapacity;
        this.refillTokensPerSecond = refillTokensPerSecond;
    }

    public boolean tryAcquire(String clientId) {
        TokenBucket bucket = buckets.computeIfAbsent(clientId,
                k -> new TokenBucket(maxCapacity, refillTokensPerSecond));
        return bucket.tryConsume(1);
    }


    private static class TokenBucket {


        private final long capacity;
        private final double refillRatePerNano;
        private double availableTokens;
        private long lastRefillTimestamp;

        public TokenBucket(long capacity, long refillTokensPerSecond) {
            this.capacity = capacity;
            this.refillRatePerNano = refillTokensPerSecond / 1_000_000_000.0;
            this.availableTokens = capacity;
            this.lastRefillTimestamp = System.nanoTime();
        }

        public synchronized boolean tryConsume(int tokensToConsume) {
            refill();

            if (availableTokens >= tokensToConsume) {
                availableTokens -= tokensToConsume;
                return true;
            }
            return false;
        }

        private void refill() {
            long now = System.nanoTime();
            long elapsedTime = now - lastRefillTimestamp;

            double tokensToAdd = elapsedTime * refillRatePerNano;
            if (tokensToAdd > 0) {
                availableTokens = Math.min(capacity, availableTokens + tokensToAdd);
                lastRefillTimestamp = now;
            }
        }
    }
}
