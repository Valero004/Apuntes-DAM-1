import java.util.ArrayList;
import java.util.Scanner;

public class Amigo_Invisible {
    public static void main(String[] args) {
        //variables
        Scanner teclado = new Scanner(System.in);
        ArrayList<String> amigos = new ArrayList<>();
        ArrayList<String> amigosFinal = new ArrayList<>();
        String buscar, nombre;
        int opcion, numero, numero1;
        boolean seguir = false, esta, valido;
        char seguro;

        //primer menú
        System.out.println("*** AMIGO INVISIBLE ***");
        do {
            System.out.println("MENÚ");
            System.out.println("1. AÑADIR PARTICIPANTE");
            System.out.println("2. ELIMINAR PARTICIPANTE");
            System.out.println("3. LISTAR PARTICIPANTES");
            System.out.println("4. ELIMIAR TODO");
            System.out.println("5. REALIZAR SORTEO");
            System.out.println("6. SALIR");
            System.out.println();
            System.out.print("Opción: ");
            opcion = teclado.nextInt();
            System.out.println();

            switch (opcion) {
                case 1:
                    esta = false;
                    System.out.println("***********************************");
                    System.out.println("Añadir participante");
                    System.out.println("----------------------");
                    System.out.print("Introduzca el nombre del participante: ");
                    nombre = teclado.next();

                    for (String item : amigos) {
                        if (nombre.toLowerCase().equals(item.toLowerCase())) {
                            esta = true;
                            break;
                        }
                    }
                    if (esta == false) {
                        amigos.add(nombre);
                    } else {
                        System.out.println("Ya hay un participante con ese nombre");
                    }
                    System.out.println("***********************************");
                    break;
                case 2:
                    esta = false;
                    System.out.println("***********************************");
                    System.out.println("Eliminar participante");
                    System.out.println("----------------------");
                    System.out.print("Introduzca el nombre del participante que desea eliminar: ");
                    buscar = teclado.next();
                    for (int i = 0; i < amigos.size(); i++) {
                        if (buscar.toLowerCase().equals(amigos.get(i).toLowerCase())) {
                            System.out.printf("¿Seguro que quieres eliminar a %s? s/n ", buscar);
                            seguro = teclado.next().charAt(0);
                            if (seguro == 's') {
                                amigos.remove(i);
                                System.out.println("Se ha eliminado correctamente");
                                esta = true;
                            }
                        }
                    }
                    if (esta == false) {
                        System.out.println("No hay ninguna persona con su nombre en la lista");
                    }
                    System.out.println("***********************************");
                    break;
                case 3:
                    System.out.println("***********************************");
                    System.out.println("Listar participantes");
                    System.out.println("----------------------");
                    if (amigos.size() == 0) {
                        System.out.println("La lista esta vacía");
                    } else {
                        for (String item : amigos) {
                            System.out.print(item + "  ");
                        }
                        System.out.println();
                    }
                    System.out.println("***********************************");
                    break;
                case 4:
                    System.out.println("***********************************");
                    System.out.println("Eliminar todo");
                    System.out.println("----------------------");
                    System.out.print("¿Seguro que quieres borrar todo? s/n");
                    seguro = teclado.next().charAt(0);
                    if (seguro == 's') {
                        amigos.clear();
                        System.out.println("Se ha eliminado todo");
                    }
                    System.out.println("***********************************");
                    break;
                case 5:
                    System.out.println("***********************************");
                    System.out.println("Realizar sorteo");
                    System.out.println("----------------------");
                    opcion = 6;
                    seguir = true;
                    System.out.println("***********************************");
                    break;
                case 6:
                    System.out.println("***********************************");
                    System.out.println("Salir");
                    System.out.println("----------------------");
                    System.out.print("¿Seguro que quieres salir? s/n");
                    seguro = teclado.next().charAt(0);
                    if (seguro != 's') {
                        opcion = 0;
                    }
                    System.out.println("***********************************");
                    break;
                default:
                    System.out.print("Opcion incorrecta, ¿Quiere salir? s/n");
                    seguro = teclado.next().charAt(0);
                    if (seguro == 's') {
                        opcion = 6;
                    }
                    break;
            }
        } while (opcion != 6);
        //sorteo
        if (seguir == true) {
            amigosFinal.clear();
            String[] participantes = new String[amigos.size()];
            String[] regalados = new String[amigos.size()];
            String[] participantes1 = new String[participantes.length];
            String[] regalados1 = new String[regalados.length];
            for (int i = 0; i < amigos.size(); i++) {
                participantes[i] = amigos.get(i);
                regalados[i] = amigos.get(i);
            }
            for (int i = 0; i < participantes.length; i++) {
                valido = false;
                do {
                    numero = (int) (Math.random() * participantes.length);
                    if (participantes1[numero] == null) {
                        valido = true;
                        participantes1[numero] = participantes[numero];
                        amigosFinal.add(participantes[numero]);
                    }
                } while (valido == false);
                valido = false;
                do {
                    numero1 = (int) (Math.random() * regalados.length);
                    if (numero1 != numero) {
                        if (regalados1[numero1] == null) {
                            valido = true;
                            regalados1[numero1] = regalados[numero1];
                            amigosFinal.add(regalados[numero1]);
                        }
                    }
                } while (valido == false);
            }
            // último menú
            do {
                System.out.println("MENÚ");
                System.out.println("1. HACER CONSULTA");
                System.out.println("2. MOSTRAR TODO");
                System.out.println("3. SALIR");
                System.out.println();
                System.out.print("Opción: ");
                opcion = teclado.nextInt();
                switch (opcion){
                    case 1:
                        System.out.println("***********************************");
                        System.out.println("Hacer consulta");
                        System.out.println("----------------------");
                        System.out.print("Introduce tu nombre: ");
                        buscar = teclado.next();
                        seguir = false;
                        for (int i = 0; i < amigos.size(); i++) {
                            if (buscar.toLowerCase().equals(amigosFinal.get(i).toLowerCase())) {
                                System.out.printf(amigosFinal.get(i)+" regala a "+amigosFinal.get(i+1));
                                seguir = true;
                            }
                        }
                        if (seguir == false){
                            System.out.println("No se ha encontrado el nombre");
                        }
                        System.out.println("***********************************");
                    break;
                    case 2:
                        System.out.println("***********************************");
                        System.out.println("Mostrar todo");
                        System.out.println("----------------------");
                        System.out.print("¿Seguro que quiere mostrar todo? s/n");
                        seguro = teclado.next().charAt(0);
                        if (seguro == 's') {
                            for (int i = 0; i < amigosFinal.size(); i++) {
                                if (i % 2 == 0) {
                                    System.out.println(amigosFinal.get(i) + " regala a " + amigosFinal.get(i + 1));
                                }
                            }
                        }
                        System.out.println("***********************************");
                        break;
                    default:
                        System.out.print("Opcion incorrecta, ¿Quiere salir? s/n");
                        seguro = teclado.next().charAt(0);
                        if (seguro == 's') {
                            opcion = 3;
                        }
                        break;
                }
            }while(opcion != 3);
        }
        System.out.println("Saliendo...");
    }
}
