import java.util.Scanner;
public class Lectura {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Escribe el nombre de tu pelicula");
        String pelicula = teclado.nextLine();
        System.out.println("Ahora escribe la fecha de lanzamiento");
        int fechaDeLanzamiento = teclado.nextInt();
        System.out.println("Por ultimo ponle una nota a esta pelicula");
        double nota = teclado.nextDouble();

        System.out.println(pelicula);
        System.out.println(fechaDeLanzamiento);
        System.out.println(nota);
    }
}