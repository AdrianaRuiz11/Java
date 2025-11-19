import java.util.Random;

public class Funciones {
    public static void main(String[] args) {

        var aleatoria = new Random();
        int valorAleatorio = aleatoria.nextInt(0,100+1);
        System.out.println("Valor aleatorio (0 y 100): "+ valorAleatorio);
        int min=100, max=200;
        int valorAL = aleatoria.nextInt(min,max+1);
        System.out.println("Valor entre (100 y 200): "+valorAL);

    }
}