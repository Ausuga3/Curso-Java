public class Decisiones {
    public static void main(String[] args) {
        int fechaDeLanzamiento = 1999;
        boolean incluidoEnElPlan = true;
        double notaDeLaPelicula = 8.2;
        String tipoDePlan = "plus";
// COdigo que prueba los operadores relacionales
        if (fechaDeLanzamiento >= 2022) {
            System.out.println("Peliculas populares recientes");
        }else{
            System.out.println("Peliculas Retro que aun vale la pena ver!");
        }

        if (incluidoEnElPlan && tipoDePlan.equals("plus")){
            System.out.println("Disfrute de su pelicula");
        } else {
            System.out.println("Pelicula no disponible para tu plan actual");
        }
    }
}
