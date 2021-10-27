import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio_B {
    public static void main(String[] args) {
        //variables
        Scanner teclado = new Scanner(System.in);
        int repeticiones, total, horas, encendidos;
        ArrayList<String> solucion = new ArrayList<>();
        repeticiones = teclado.nextInt();
        for (int i = 0; i < repeticiones; i++) {
            total = teclado.nextInt();
            horas = teclado.nextInt();
            encendidos = teclado.nextInt();
            if (encendidos * horas < total) {
                solucion.add("ENCENDIDOS");
            } else if (encendidos * horas > total) {
                solucion.add("HORAS");
            } else if (encendidos * horas == total) {
                solucion.add("AMBAS");
            }
        }
        for (String item:solucion) {
            System.out.println(item);
        }
    }
}
