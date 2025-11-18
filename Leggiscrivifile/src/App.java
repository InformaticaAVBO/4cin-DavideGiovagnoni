import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner input = new Scanner(System.in);

        System.out.print("Inserisci il nome del file di input: ");
        String nomeInput = input.nextLine();

        System.out.print("Inserisci il nome del file di output: ");
        String nomeOutput = input.nextLine();

        FileWriter myWriter = new FileWriter(nomeInput);

        for(int i = 0; i < 10; i++) {
            myWriter.write("Questa è una prima frase scritta in un file. \n");
        }
        myWriter.close();

        File fileInput = new File(nomeInput);
        Scanner leggi = new Scanner(fileInput);

        FileWriter fileOutput = new FileWriter(nomeOutput);

        while (leggi.hasNextLine()) {
            String s = leggi.nextLine();
            fileOutput.write(s + "\n");
        }
        fileOutput.close();

        System.out.println("Ok, ho scritto sul file!");

        leggi.close();
        input.close();

    }
}
