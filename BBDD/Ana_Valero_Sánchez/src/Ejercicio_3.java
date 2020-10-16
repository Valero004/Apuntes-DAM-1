import java.util.Scanner;

public class Ejercicio_3 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double notaUno, notaDeseada,notaNecesaria;
        System.out.println("Introduce la nota del primer examen: ");
        notaUno = teclado.nextDouble();
        System.out.println("¿que nota quieres sacar en el trimestre? ");
        notaDeseada=teclado.nextDouble();

        notaNecesaria = (notaDeseada-(notaUno*0.4))/0.6;
        System.out.printf("Para tener un %.1f en el trimestre es necesario sacar un %.1f",
                notaDeseada, notaNecesaria);
    }
}
