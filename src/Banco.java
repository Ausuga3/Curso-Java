import java.util.Scanner;

public class Banco {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String cliente = "Andres Usuga";
        String tipoCuenta = "Corriente";
        double saldo = 00.00;
        boolean interruptor = true;



        System.out.println("*********************************");
        System.out.println("Nombre del cliente: "+ cliente);
        System.out.println("Tipo De Cuenta: " + tipoCuenta);
        System.out.println("Saldo Disponible: "+ saldo);


        while (interruptor){
            System.out.println("""
                    ************************************
                    Elige Una Opcion:
                    1. Ver Saldo
                    2. Retirar Saldo
                    3. Depositar Dinero
                    9. Salir
                    """);

            int opc = scanner.nextInt();
            switch (opc) {
                case 1:
                    System.out.println("Su saldo es "+ saldo + " USD");
                    break;
                case 2:
                    System.out.println("Cuanto deseas retirar?: ");
                    double retiro = scanner.nextDouble();
                    if (retiro <= saldo) {
                        saldo -= retiro;
                        System.out.println("Nuevo saldo: " + saldo + " USD");
                        break;
                    }else{
                        System.out.println("No tienes suficiente dinero");
                        break;
                    }

                case 3:
                    System.out.println("Cuanto deseas depositar?: ");
                    double deposito = scanner.nextDouble();
                    saldo += deposito;
                    System.out.println("Nuevo saldo: " + saldo + " USD");
                    break;
                case 9:
                    System.out.println("Gracias por Elegirnos");
                    interruptor = false;
                    break;
                default:
                    System.out.println("Opcion No Valida!!");
            }



        }


    }
}
