import java.util.Scanner;

public class ValidacionUsuario {
    public static void main(String[] args) {
        System.out.print("Ingresa tu usuario: ");
        Scanner consola = new Scanner(System.in);
        var usuarioIngresado = consola.nextLine();

        System.out.println("Ingresa tu password: ");
        var passwordIngresada = consola.nextLine();

        //DAMOS LA REGLA DE USUARIO Y PASSWORD
        var usuarioValido = "admin";
        var passwordValido = "123";
        if(usuarioIngresado.equals(usuarioValido) && passwordIngresada.equals(passwordValido)){
            System.out.println("Sesion iniciada");
        }
        else if(!usuarioIngresado.equals(usuarioValido) && passwordIngresada.equals(passwordValido)){
            System.out.println("Usuario invalido");
        }
        else if(usuarioIngresado.equals(usuarioValido) && !passwordIngresada.equals(passwordValido)){
            System.out.println("Password incorrecta");
        }
        else{
            System.out.println("Datos incorrectos");
        }
    }

}
