//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Bienvenido a Screen Match");
        System.out.println("Pelicula: Matrix");

        int fechaDeLanzamiento = 1999;
        boolean incluidoEnElPlan = true;
        double notaDeLaPelicula = 8.2;

        double media = (8.2 + 6.0 + 9.0 ) / 3;
        System.out.println(media);

        String sinopsis = """
                Matrix es una paradoja
                la mejor pelicula del fin del milenio
                fue lanzada en:
                """ + fechaDeLanzamiento;

        System.out.println(sinopsis);

        int clasificacion = (int) (media / 2);
        System.out.println(clasificacion);

       int temperatura = 10;
       double frh = (temperatura*1.8)+32;
       System.out.printf("%d grados centigrados son %.1f grados fahrenheit", temperatura,frh);



    }
}