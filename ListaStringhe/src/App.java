public class App {
    public static void main(String[] args){
        Lista l = new Lista();
        l.addCoda(new Nodo("Mario"));
        l.addCoda(new Nodo("Giulio"));
        l.addTesta(new Nodo("Francesco"));
        l.add("Bologna magica Bologna");
        System.out.println(l);

        boolean esiste = l.exists("Marco");
        System.out.println("Esiste 'Marco'? " + esiste);

        l.remove("Mario");
        System.out.println("Dopo remove 'Mario': " + l);
    }
}
