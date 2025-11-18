import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Campionato c = new Campionato("data/serieA.csv");
        Scanner in = new Scanner(System.in);

        while(true){
            System.out.println("1 = classifica | 2 = cerca | 0 = esci");
            int s = in.nextInt(); in.nextLine();

            if(s==1) c.stampaClassifica();
            if(s==2){
                System.out.print("nome squadra: ");
                String n = in.nextLine();
                Squadra x = c.cerca(n);
                System.out.println(x);
            }
            if(s==0) break;
        }
    }
}
