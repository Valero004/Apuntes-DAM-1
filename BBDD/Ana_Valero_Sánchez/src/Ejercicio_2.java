import java.util.Scanner;

public class Ejercicio_2 {

    public static void main(String[] args) {

        Scanner teclado =new Scanner(System.in);
        double articuloUno, articuloDos, ahorrado;
        double IVA = 0.21;
        String Nombre;

        System.out.println("Introduzca el valor del artículo uno: ");
        articuloUno = teclado.nextDouble();
        System.out.println("Introduzca el valor del artículo dos: ");
        articuloDos = teclado.nextDouble();
        System.out.println("Introduzca su nombre: ");
        Nombre = teclado.next();
        System.out.println("Introduzca el dinero ahorrado: ");
        ahorrado = teclado.nextDouble();

        System.out.printf("Artículo PlayStation 5: %.2f%n" +
                "Articulo Iphone 12: %.2f%n" +
                        "IVa aplicado: %.2f",
                articuloUno,articuloDos, IVA);

        double facturaIVA,factura;
        factura = articuloUno + articuloDos;
        facturaIVA = factura+(factura*IVA);
        System.out.printf("%nTotal de la factura con IVA: %.2f%nTotal de la factura sin IVA: %.2f%n",
                facturaIVA, factura);
        System.out.printf("Ahorros disponibles: %.2f%n", ahorrado);
        boolean compraTotal = factura <= ahorrado;
        boolean compra = articuloUno<= ahorrado || articuloDos<=ahorrado;
        System.out.printf("¿Puedo comprar los dos artículos?: %b%n" +
                "¿Puedo comprar uno de los artículos?: %b%n",
                compraTotal,compra);

    }

}
