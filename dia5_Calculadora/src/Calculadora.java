import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        boolean continuar = true;

        while(continuar) {
            System.out.println("---------¡Bienvenido! Elija el cálculo que quiere realizar---------");
            System.out.println("1 - Suma");
            System.out.println("2 - Resta");
            System.out.println("3 - Multiplicación");
            System.out.println("4 - División");
            System.out.println("5 - Potencia");
            System.out.println("6 - Raíz cuadrada");
            System.out.println("7 - Salir");

            if (teclado.hasNextInt()) {
                int opcion = teclado.nextInt();
                teclado.nextLine();

                switch (opcion){
                    case 1:
                        operarDosNumeros(teclado, "+");
                        System.out.println("Pulse 'Enter' para continuar...");
                        teclado.nextLine();
                        break;

                    case 2:
                        operarDosNumeros(teclado, "-");
                        System.out.println("Pulse 'Enter' para continuar...");
                        teclado.nextLine();
                        break;

                    case 3:
                        operarDosNumeros(teclado, "*");
                        System.out.println("Pulse 'Enter' para continuar...");
                        teclado.nextLine();
                        break;

                    case 4:
                        operarDosNumeros(teclado, "/");
                        System.out.println("Pulse 'Enter' para continuar...");
                        teclado.nextLine();
                        break;

                    case 5:
                        operarDosNumeros(teclado, "^");
                        System.out.println("Pulse 'Enter' para continuar...");
                        teclado.nextLine();
                        break;

                    case 6:
                        operarUnNumero(teclado, "sqrt");
                        System.out.println("Pulse 'Enter' para continuar...");
                        teclado.nextLine();
                        break;

                    case 7:
                        continuar = false;
                        System.out.println("Pulse 'Enter' para salir...");
                        teclado.nextLine();
                        System.out.println("Saliendo...");
                        break;

                    default:
                        System.out.println("Opción no válida. Introduzca una de las opciones posibles. Pulse 'Enter' para continuar...");
                        teclado.nextLine();
                }
            } else {
                System.out.println();
            }
        }
        teclado.close();
    }

    //Metodos para las operaciones

    public static void operarDosNumeros(Scanner teclado, String operacion) {
        System.out.println("Introduce el primer número: ");
        double n1 = teclado.nextDouble();
        System.out.println("Introduce el segundo número: ");
        double n2 = teclado.nextDouble();

        double resultado = 0;
        switch (operacion) {
            case "+": resultado = n1 + n2;
            teclado.nextLine();
            break;

            case "-": resultado = n1 - n2;
            teclado.nextLine();
            break;

            case "*": resultado = n1 * n2;
            teclado.nextLine();
            break;

            case "/":
                if (n2 != 0) {
                    resultado = n1 /n2;
                    teclado.nextLine();
                } else {
                    System.out.println("¡Error! No se puede dividir un numero entre 0.");
                    teclado.nextLine();
                    return;
                }
                break;

            case "^": resultado = Math.pow(n1, n2);
            teclado.nextLine();
            break;

        }

        System.out.println("El resultado es: " + resultado);
    }

    public static void operarUnNumero(Scanner teclado, String operacion) {
        System.out.println("Introduce el número: ");
        double n1 = teclado.nextDouble();
        teclado.nextLine();

        if (operacion.equals("sqrt")) {
            if (n1 >= 0) {
                System.out.println("El resultado es: " + Math.sqrt(n1));
            } else {
                System.out.println("Error: No se puede calcular la raiz cuadrada de " + n1);
            }
        }
    }
}