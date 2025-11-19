import java.text.DecimalFormat;
import java.util.Random;
import java.util.Scanner;

public class RFC {

    public static void main(String[] args) {
        generadorIdUnico();
    }

    static void generadorIdUnico(){
        System.out.println("**** Generador de RFC **** ");
        var teclado = new Scanner(System.in);
        System.out.print("Cual es tu apellido paterno? ");
        var apellidoPat = teclado.nextLine().substring(0,2).toUpperCase();
        System.out.print("Cual es tu apellido materno? ");
        var apellidoMat = teclado.nextLine().substring(0,1).toUpperCase();
        System.out.print("Cual es tu nombre? ");
        var nombre = teclado.nextLine().substring(0,1).toUpperCase();
        System.out.println("Cual es tu dia de nacimiento? (DD) ");
        var dia = teclado.nextLine();
        System.out.println("Cual es tu mes de nacimiento? (MM) ");
        var mes = teclado.nextLine();
        System.out.println("Cual es tu anio de nacimiento? (YYYY) ");
        var anio = teclado.nextLine().substring(2,4);
        var aleatorio = new Random().nextInt(0,9999);
        var valorAleatorio = new DecimalFormat("###").format(aleatorio);
        var rfc = apellidoPat + apellidoMat + nombre + anio + mes + dia + valorAleatorio;
        System.out.println(rfc);
    }
}