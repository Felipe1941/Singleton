public class Main {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
        singleton.setContador(100);

        Singleton singleton2 = Singleton.getInstance();
        singleton2.setContador(10);

        System.out.println(singleton + " en memoria: "+ singleton2);
    }
}