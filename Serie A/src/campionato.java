import java.io.File;
import java.util.Scanner;

public class Campionato {
    Squadra[] squadre = new Squadra[20];
    
    public Campionato(String file) throws Exception {
        Scanner sc = new Scanner(new File(file));
        sc.useDelimiter("\n");
        int i = 0;
        while(sc.hasNext()){
            String r = sc.next().trim();
            String[] a = r.split(";");
            squadre[i] = new Squadra(a[0],
                    Integer.parseInt(a[1]),
                    Integer.parseInt(a[2]),
                    Integer.parseInt(a[3]),
                    Integer.parseInt(a[4]),
                    Integer.parseInt(a[5]));
            i++;
        }
        sc.close();
    }

    public void stampaClassifica(){
        for(int i=0;i<20;i++) System.out.println(squadre[i]);
    }

    public Squadra cerca(String nome){
        for(int i=0;i<20;i++)
            if(squadre[i].nome.equalsIgnoreCase(nome)) return squadre[i];
        return null;
    }
}
