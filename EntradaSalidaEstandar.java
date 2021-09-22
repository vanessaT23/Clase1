
import java.util.Scanner;
public class EntradaSalidaEstandar
{
    public static void main(String[] args){
        // elemeto para leer por consola
        Scanner entrada =new Scanner(System.in);
        System.out.println("Ingrese su nombre:");
        String nombre=entrada.nextLine();//leer un dato String por consola

        System.out.println("Ingrese su edad:");
        int edad=entrada.nextInt();

        System.out.println("Ingrese su altura:");
        float altura=entrada.nextFloat();
        System.out.println("Nombre:"+nombre+"\nEdad:"+edad+"\nAltura:"+altura);

    }
}
