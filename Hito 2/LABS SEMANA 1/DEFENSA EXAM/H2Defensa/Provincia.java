package H2Defensa;

public class Provincia {
    private String nombre;

    public Provincia(){

    }
    public Provincia(String nombre){
        this.nombre=nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void MostrarProvincia(){

        System.out.println("las provincias son: "+getNombre());
    }
}
