public class Cliente {

    //propiedades
    private String nombre, dni;
    private double carrito;

    //constructores
    public Cliente (String nombre, String dni){
        this.nombre = nombre;
        this.dni = dni;
    }

    //metodos
    public void pagarCarrito(){
        carrito = 0;
    }
}
