import java.io.File;
import java.io.PrintWriter;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileReader;

public class Main {
    public static void main(String[] args) {
        BufferedReader br = null;
        try {
            File file = new File("newFail.txt");
            if (!file.exists())
            file.createNewFile();

            PrintWriter pw= new PrintWriter(file);
            pw.println("Кто раскрасил белой краской");
            pw.println("Все дороги и дома,");
            pw.println("Словно мы попали в сказку?");
            pw.println("Это к нам пришла  зима!");
            pw.close();

br = new BufferedReader(new FileReader("newFail.txt"));
String line;
while ((line = br.readLine()) != null){
    System.out.println(line);
}
        } catch (IOException e) {
            System.out.println("Error: " + e);
        }
    }
}