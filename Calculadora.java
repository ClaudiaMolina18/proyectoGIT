package calculadora;
import java.util.Scanner;

/**
 *
 * @author Claudia Molina
 */
public class Calculadora {
    
    public static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
        Calculadora programa = new Calculadora();
        programa.inicio();
    }
    
    public void inicio(){
        int num1 = leerEntero();
        int num2 = leerEntero();
        menu(num1, num2);
    }
    
    public int leerEntero(){
        boolean esEntero = false;
        int numero = 0;
        while (esEntero == false){
            System.out.print("Dame un entero:");
            if (sc.hasNextInt()){
                numero = sc.nextInt();
                esEntero = true;
            }else {
                System.out.println("No es un entero");
                sc.next();
            }
        }
        return numero;
    }
    
    public void menu(int num1, int num2){
        boolean salir = false;
        System.out.println("1 -> Suma\n2 -> Resta\n3 -> Multiplicacion\n4 -> Division");
        while (salir == false){
            System.out.print("\nDame una opcion: ");
            switch (sc.nextInt()){
                case 1:
                    suma(num1, num2);
                    break;
                case 2:
                    resta(num1, num2);
                    break;
                case 3:
                    mult(num1, num2);
                    break;
                case 4:
                    div(num1, num2);
                    break;
                case 5:
                    return;
                default:
                    System.out.println("Operacion no valida");
                    break;
            }
        }
    }

    public void suma(int num1, int num2) {
    int suma = num1 + num2;
    System.out.println("El resultado es " + suma);
    }

    public void resta(int num1, int num2) {
        int resta = num1 - num2;
    System.out.println("El resultado es " + resta);
    }

    public void mult(int num1, int num2) {
    int mult = num1 * num2;
    System.out.println("El resultado es " + mult);
    }

    public void div(int num1, int num2) {
    int div = num1 / num2;
    System.out.println("El resultado es " + div);
    }
}
