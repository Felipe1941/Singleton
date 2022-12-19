public class Singleton {
    private static Singleton singleton;
    int contador;

    private Singleton(){

    }

    public static Singleton getInstance(){
        if(singleton == null) {
            System.out.println("iniciando");
            singleton = new Singleton();
        }

        return singleton;
    }

    public int getContador() {
        return contador;
    }

    public void setContador(int contador) {
        this.contador = contador;
    }
}
