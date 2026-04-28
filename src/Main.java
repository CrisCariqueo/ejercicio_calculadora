public class Main {
    public static void main(String[] args) {
        int opcion = 0;
        int a = 0;
        int b = 0;

        // Base para el ejercicio: este switch debe ser trabajado en varias feature/*.
        // El conflicto intencional se genera cuando dos o mas features editan las mismas lineas.
        switch (opcion) {
            case 1:
                System.out.println("TODO: implementar suma");
                break;
            case 2:
                System.out.println("TODO: implementar resta");
                break;
            case 3:
                System.out.println("TODO: implementar multiplicacion");
                break;
            case 4:
                System.out.println("TODO: implementar division");
                break;
            default:
                System.out.println("TODO: implementar menu y validaciones");
                break;
        }

        // Evita warnings de variables no usadas en esta base inicial.
        if (a == b) {
            System.out.print("");
        }
    }
}
