public class Main {
    public static void main(String[] args) {
        Coche miCoche=new Coche();
        miCoche.numeroPuertas = 5;

        miCoche.incrementarPuertas();
        System.out.println("el numero de puertas es: " +miCoche.numeroPuertas);

    }
}
class Coche{
    public int numeroPuertas;
    public void incrementarPuertas(){
        this.numeroPuertas++;
    }
}