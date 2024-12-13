import java.util.Scanner;

public class Evaluaciones {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double note = 0;
        double mediaEvaluaciones = 0;
        double cont = 0;
        while (note != -1){
            System.out.println("Escrible la nota que le dariaas a la pelicula Matrix");
            note = teclado.nextDouble();
            if (note != -1){
                mediaEvaluaciones += note;
                cont++;
            }

        }
        System.out.println("la media de evaluaciones para matrix es: " + mediaEvaluaciones / cont);
    }
}
