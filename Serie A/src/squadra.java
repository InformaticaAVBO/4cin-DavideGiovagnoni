public class Squadra {
    String nome;
    int giocate, vinte, pareggi, perse, punti;

    public Squadra(String n, int g, int v, int p, int pe, int pt){
        nome = n;
        giocate = g;
        vinte = v;
        pareggi = p;
        perse = pe;
        punti = pt;
    }

    public String toString(){
        return nome + "  G:" + giocate + " V:" + vinte + " P:" + pareggi + " S:" + perse + " PT:" + punti;
    }
}

