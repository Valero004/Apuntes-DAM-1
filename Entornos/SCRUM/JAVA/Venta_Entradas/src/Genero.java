import java.util.ArrayList;

public abstract class Genero {

    //propiedades
    protected ArrayList<Pelicula> lista_peliculas;
    protected int id;

    //constructor
    public Genero (){
        lista_peliculas = new ArrayList<>();
    }

    public Genero(int id) {
        this.id = id;
        lista_peliculas = new ArrayList<>();
    }

    //métodos

    public void imprimirPeliculas (){
        for (Pelicula pelicula:lista_peliculas) {
            pelicula.mostrarDatos();
        }
    }
}