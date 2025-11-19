import java.text.DecimalFormat;
import java.util.Random;
import java.util.Scanner;

public class Proyecto {

    public static void main(String[] args) {
        generadorIdUnico();
    }

    static void generadorIdUnico(){
        System.out.println("**** Generador ID unico **** ");
        var teclado = new Scanner(System.in);
        System.out.print("Cual es tu nombre? ");
        var nombre = teclado.nextLine().substring(0,2).toUpperCase();
        System.out.print("Cual es tu apellido? ");
        var apellido = teclado.nextLine().substring(0,2).toUpperCase();
        System.out.println("Cual es tu anio de nacimiento? (YYYY) ");
        var anio = teclado.nextLine().substring(2,4);
        var aleatorio = new Random().nextInt(0,9999);
        var valorAleatorio = new DecimalFormat("####").format(aleatorio);
        var idUnico = nombre + apellido + anio + valorAleatorio;
        System.out.println("Felicidades! TU nuevo numero de ID unico es: " + idUnico);
    }
}
