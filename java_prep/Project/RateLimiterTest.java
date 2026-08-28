package java_prep.Project;

public class RateLimiterTest {
    public static void main(String[] args)  throws InterruptedException {

        TokenBucketRateLimiter limiter = new TokenBucketRateLimiter(5, 1);
        String clientIp = "192.168.1.10";
        System.out.println("=== 1. Sending 7 rapid requests (burst limit = 5) ===");
        for (int i = 1; i <= 7; i++) {
            boolean allowed = limiter.tryAcquire(clientIp);
            System.out.printf("Request %d: %s%n", i, allowed ? "ALLOWED (200)" : "BLOCKED (429)");
        }
        System.out.println("\n=== 2. Sleeping for 2 seconds to refill 2 tokens ===");
        Thread.sleep(2000);

        System.out.println("=== 3. Sending 3 more requests ===");
        for (int i = 1; i <= 3; i++) {
            boolean allowed = limiter.tryAcquire(clientIp);
            System.out.printf("Request %d: %s%n", i, allowed ? "ALLOWED (200)" : "BLOCKED (429)");
        }
    }
}
