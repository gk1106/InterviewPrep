package java_prep.Alten2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BUfferExample {
    public static void main(String[] args) {

        String filePath="C:\\Users\\gk110\\OneDrive\\Desktop\\learn\\java\\javaPro.txt.txt";

                try(BufferedReader br=new BufferedReader(new FileReader((filePath)))


                        ){

                    String line;
                    while((line=br.readLine())!= null){
                        System.out.println(line);
                    }

                }catch (IOException e){
                    e.printStackTrace();
                }
    }
}
