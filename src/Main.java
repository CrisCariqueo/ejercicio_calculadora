import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int opcion = 0;
        int a = 0;
        int b = 0;

        // Base para el ejercicio: este switch debe ser trabajado en varias feature/*.
        // El conflicto intencional se genera cuando dos o mas features editan las
        // mismas lineas.
        while (true) {
            switch (opcion) {
                case 1:
                    opcion = 0;
                    System.out.println("= " + suma(a, b));
                    break;
                case 2:
                    opcion = 0;
                    System.out.println("= " + resta(a, b));
                    break;
                case 3:
                    opcion = 0;
                    System.out.println("= "+ a * b);
                    break;
                case 4:
                    opcion = 0;
                    System.out.println("= "+ (float) a / b);
                    break;
                default:
                    System.out.println("1:+  2:-  3:*  4:/");
                    System.out.print("Elige una opcion: ");
                    opcion = sc.nextInt();
                    System.out.print("valor de a: ");
                    a =  sc.nextInt();
                    System.out.print("valor de b: ");
                    b = sc.nextInt();

                    if (opcion < 1 || opcion > 4) {
                        System.out.println("Opcion invalida");
                        opcion = 0;
                        a = 0;
                        b = 0;
                    }
                    if (opcion == 4 && b == 0) {
                        System.out.println("No se puede dividir por 0");
                        opcion = 0;
                        a = 0;
                        b = 0;
                    }
            }
        }
    }

    public static int suma(int a, int b) {
        return a + b;
    }

    public static int resta(int a, int b) {
        return a - b;
    }
}
