package DEFENSA_HITO4_2023;

public class Cliente {
    private int id;
    private String nombres;
    private String apellidos;
    private int edad;
    private String pais;
    private String genero;
    private String tipo;

    public Cliente(int id,String nombres, String apellidos, int edad, String pais, String genero, String tipo) {
        this.id = id;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.edad = edad;
        this.pais = pais;
        this.genero = genero;
        this.tipo = tipo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    /// getter
    public String getNombres() {
        return nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public String getPais() {
        return pais;
    }

    public String getGenero() {
        return genero;
    }

    public String getTipo() {
        return tipo;
    }

    // setters
    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void mustrarCliente(){
        System.out.println("Mostrando datos del Cliente");
        System.out.println("Nombre: " + this.nombres);
        System.out.println("Apellido: " + this.apellidos);
        System.out.println("Edad: " + this.edad);
        System.out.println("Pais: " + this.pais);
        System.out.println("Genero: " + this.genero);
        System.out.println("Tipo: " + this.tipo);
        System.out.println("\n");
    }
}

