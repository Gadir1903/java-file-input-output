import java.io.*;
import java.util.Scanner;


public class Main {
        public static void main(String[] args) {
           try {
               File file = new File("text.txt");
               FileWriter fw = new FileWriter(file);
               fw.write("test");
               fw.close();
           } catch (IOException e) {
               throw new RuntimeException(e);
           }
           try {
               File file = new File("text.txt");
               FileReader fr = new FileReader(file);
               BufferedReader bf = new BufferedReader(fr);
               String firstLine = bf.readLine();
               System.out.println(firstLine);
               fr.close();
               bf.close();
           }catch (IOException e){
               e.printStackTrace();
           }
        }
}