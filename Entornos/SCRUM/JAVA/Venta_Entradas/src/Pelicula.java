import java.util.ArrayList;

public class Pelicula {
    private String titulo, genero1, genero2, genero3;
    private int id, num_Entradas;
    private double precio_Entrada;
    private ArrayList<Actor> lista_Actores;

    // constructores
    public Pelicula (){}

    public Pelicula(String titulo, String genero1, String genero2, String genero3, int id, int num_Entradas, double precio_Entrada) {
        this.titulo = titulo;
        this.genero1 = genero1;
        this.genero2 = genero2;
        this.genero3 = genero3;
        this.id = id;
        this.num_Entradas = num_Entradas;
        this.precio_Entrada = precio_Entrada;
    }

    //metodo
    public void addActor (Actor actor){
        lista_Actores.add(actor);
    }
    public void cambiarPrecio (double nuevoPrecio){
        precio_Entrada = nuevoPrecio;
    }
    public void entradaComprada (){
        num_Entradas --;
    }
    public void mostrarDatos (){
        System.out.println("Titulo:"+titulo);
        System.out.println("Género 1:"+genero1);
        System.out.println("Género 2:"+genero2);
        System.out.println("Género 3:"+genero3);
        System.out.println("ID:"+id);
        System.out.println("Precio entrada:"+precio_Entrada);
        System.out.println("Número de entradas:"+num_Entradas);
        System.out.println("Actores:");
        for (Actor actor:lista_Actores) {
            actor.mostrarDatos();
        }
    }

    //getters && Setters

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero1() {
        return genero1;
    }

    public void setGenero1(String genero1) {
        this.genero1 = genero1;
    }

    public String getGenero2() {
        return genero2;
    }

    public void setGenero2(String genero2) {
        this.genero2 = genero2;
    }

    public String getGenero3() {
        return genero3;
    }

    public void setGenero3(String genero3) {
        this.genero3 = genero3;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNum_Entradas() {
        return num_Entradas;
    }

    public void setNum_Entradas(int num_Entradas) {
        this.num_Entradas = num_Entradas;
    }

    public double getPrecio_Entrada() {
        return precio_Entrada;
    }

    public void setPrecio_Entrada(double precio_Entrada) {
        this.precio_Entrada = precio_Entrada;
    }
}
