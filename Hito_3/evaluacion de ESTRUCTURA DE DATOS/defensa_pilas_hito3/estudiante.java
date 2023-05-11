package defensa_pilas_hito3;

public class estudiante {
    private String Nombre;
    private String Apellido;
    private int edad;
    private String Sede;
    private int notaFinal;
    private String CI;

    public estudiante(String nombre, String apellido, int edad, String sede, int notaFinal, String CI) {
        Nombre = nombre;
        Apellido = apellido;
        this.edad = edad;
        Sede = sede;
        this.notaFinal = notaFinal;
        this.CI = CI;
    }

    //////////////////////////////GETTER//////////////////////////////////


    public String getNombre() {
        return Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public int getEdad() {
        return edad;
    }

    public String getSede() {
        return Sede;
    }

    public int getNotaFinal() {
        return notaFinal;
    }

    public String getCI() {
        return CI;
    }

    //////////////////////SETTER///////////////////////////////////


    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public void setApellido(String apellido) {
        Apellido = apellido;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setSede(String sede) {
        Sede = sede;
    }

    public void setNotaFinal(int notaFinal) {
        this.notaFinal = notaFinal;
    }

    public void setCI(String CI) {
        this.CI = CI;
    }

    public void mostrarEstudiante(){
        System.out.println("mostrando libro");
        System.out.println("Nombre:" + Nombre);
        System.out.println("Apellido:" + Apellido);
        System.out.println("Edad:" + edad);
        System.out.println("Sede:" + Sede);
        System.out.println("notaFinal:" + notaFinal);
        System.out.println("CI:" + CI);
        System.out.println();
    }
}
