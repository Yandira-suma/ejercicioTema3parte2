public class Main {
    public static void main(String[] args) {
        Coche miCoche=new Coche();

        miCoche.incrementarPuertas();
        System.out.println(miCoche.numeroPuertas);

    }
}
class Coche{
    public int numeroPuertas=5;
    public void incrementarPuertas(){
        this.numeroPuertas++;
    }
}