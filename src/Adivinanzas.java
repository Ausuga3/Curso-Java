import java.util.Random;
import java.util.Scanner;

public class Adivinanzas {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numRandom = new Random().nextInt(100);
//        System.out.println(numRandom);

        int numIntentos = 1;


        while (numIntentos <= 5) {

            System.out.println("Adivina el numero. Intento Numero: " + numIntentos);
            int intentoUser = teclado.nextInt();
            int intentosRestantes = 5 - numIntentos;

            numIntentos++;

            if (numIntentos < 5) {

                if (intentoUser > numRandom) {
                    System.out.println(intentoUser + " Es Mayor que el numero a adivinar");
                    System.out.println("Te quedan " + intentosRestantes + " Intentos");
                } else if (intentoUser < numRandom) {
                    System.out.println(intentoUser + " Es Menor que el numero a adivinar");
                    System.out.println("Te quedan " + intentosRestantes + " Intentos");
                } else {
                    System.out.println("Felicidades, Ganaste, " + numRandom + " Era el numero secreto y Solo Te tomo " + numIntentos + " Intentos!!");
                    break;
                }
            }else{
                System.out.println("Se te acabaron los intentos! La Respuesta Era " + numRandom);
                break;
            }
        }
    }
}
