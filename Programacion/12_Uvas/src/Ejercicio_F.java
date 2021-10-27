import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio_F {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        ArrayList<Integer> velas = new ArrayList<>();
        int numero;
        do {
            numero = teclado.nextInt();
            if (numero != 0) {
                velas.add(numero);
            }
        } while (numero != 0);
        for (int item : velas) {
            if (item % 2 == 0) {
                System.out.println("SI");
            } else {
                System.out.println("NO");
            }
        }
    }
}
