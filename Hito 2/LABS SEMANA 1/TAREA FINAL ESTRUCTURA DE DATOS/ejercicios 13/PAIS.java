package EJERCICIOS;

public class PAIS {

    private String nombre;
    private int nroDepartamentos;
    private String[] departamentos;

    public PAIS(String nombre, int nroDepartamentos, String[] departamentos) {
        this.nombre = nombre;
        this.nroDepartamentos = nroDepartamentos;
        this.departamentos = departamentos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNroDepartamentos() {
        return nroDepartamentos;
    }

    public int setNroDepartamentos() {
        return nroDepartamentos;
    }

    public String[] getDepartamentos() {
        return departamentos;
    }

    public void setDepartamentos(String[] departamentos) {
        this.departamentos = departamentos;
    }

    public void mostrarNPais(){
        for (int i=0;i<this.departamentos.length;i++){
            System.out.print(departamentos[i] + " ");
        }
        System.out.println();
    }
}
