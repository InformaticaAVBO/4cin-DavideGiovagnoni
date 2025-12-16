package cartella;
public class Main{
        public static void main(String[] args) throws Exception {
        System.out.println("\nArrayList: ");
        
        Lista lista = new Lista();
        
        lista.addTail(new Nodo("IT: Ciao"));
        lista.addTail(new Nodo("EN: Hello"));
        lista.addTail(new Nodo("ES: Hola"));
        
        lista.addHead(new Nodo("Prova"));
        
        lista.add("Prova 2");
        lista.add("yolo");

        lista.exists("EN: Hello");
        lista.exists("Prova 2 ");

        lista.remove("Prova ");
        lista.remove("Prova 2 ");

        lista.exists("Prova 2 ");
        lista.exists("IT: Ciao");

        System.out.println(lista);
    }
}