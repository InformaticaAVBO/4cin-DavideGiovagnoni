public class Main{
        public static void main(String[] args) throws Exception {
        System.out.println("\nArrayList: ");
        
        Lista lista = new Lista();
        
        lista.addTail(new Nodo("Ciao"));
        lista.addTail(new Nodo("Hello"));
        lista.addTail(new Nodo("Hola"));
        
        lista.addHead(new Nodo("Prova"));
        
        lista.add("Prova 2");
        lista.add("Prova");

        lista.exists("Hello");
        lista.exists("Prova 2 ");

        lista.remove("Prova ");
        lista.remove("Prova 2 ");

        lista.exists("Prova 2 ");
        lista.exists("Ciao");

        System.out.println(lista);
    }
}