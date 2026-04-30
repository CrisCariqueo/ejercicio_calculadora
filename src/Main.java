public class Main {
    public static void main(String[] args) {
        int opcion = 0;
        int a = 0;
        int b = 0;

        // Base para el ejercicio: este switch debe ser trabajado en varias feature/*.
        // El conflicto intencional se genera cuando dos o mas features editan las
        // mismas lineas.
        switch (opcion) {
            case 1:
                System.out.println("=" + suma(a, b));
            case 2:
                System.out.println("=" + resta(a, b));
            case 3:
                System.out.println("=" + multiplicacion(a, b));
                break;
            case 4:
                System.out.println("=" + division(a, b));
                break;
            default:
                System.out.println("TODO: implementar menu y validaciones");
                break;
        }

    }

    public static int suma(int a, int b) {
        return a + b;
    }

    public static int resta(int a, int b) {
        return a - b;
    }

    public static int multiplicacion(int a, int b) {
        return a * b;
    }

    public static float division(int a, int b) {
        return (float) a / b;
    }
}
