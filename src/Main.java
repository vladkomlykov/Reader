import java.io.File;
import java.io.PrintWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
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


        } catch (IOException e) {
            System.out.println("Error: " + e);
        }
    }
}