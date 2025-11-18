import java.io.File;
import java.util.Scanner;
import java.io.FileWriter;

public class App {

    public void copyFile(String fileIn, String fileOut) {

        File f = new File(fileIn);
        Scanner leggiFile = new Scanner(f);
        FileWriter scrivi = new FileWriter(fileOut);
        while (leggi.hasNextLine()) {
            String s = leggi.nextLine();
            scrivi.write(s);
        }
        scrivi.close();
        leggi.close();
        
    }


    public static void main(String[] args) throws Exception {
        
        Scanner leggiDaTastiera = new Scanner(System.in);
        System.out.print("Dammi il nome del file sorgente:");
        String inputFilename = leggiDaTastiera.nextLine();
        System.out.print("Dammi il nome del file di destinazione:");
        String outputFilename = leggiDaTastiera.nextLine();
        leggiDaTastiera.close();

        App.copyFile(inputFilename, outputFilename);

    }
}
