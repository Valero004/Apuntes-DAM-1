public final class Actor {

    //propiedades
    private String nombre;
    private Boolean premiado;

    //constructores

    public Actor(String nombre, Boolean premiado) {
        this.nombre = nombre;
        this.premiado = premiado;
    }

    //metodos
    public void mostrarDatos (){
        System.out.println("Nombre: "+nombre);
        if (premiado == true){
            System.out.println("Premiado: SI");
        }else{
            System.out.println("Premiado: NO");
        }
    }

    //getters && Setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Boolean getPremiado() {
        return premiado;
    }

    public void setPremiado(Boolean premiado) {
        this.premiado = premiado;
    }
}