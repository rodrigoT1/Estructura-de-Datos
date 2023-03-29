package EJERCICIOS;

public class DEPARTAMENTO {

    private String NombresDep;
    private String[] numeroProvi;

    public DEPARTAMENTO(String NombresDep, String[] numeroProvi) {
        NombresDep = NombresDep;
        this.numeroProvi = numeroProvi;
    }

    public String getNombresDep() {
        return NombresDep;
    }

    public void setNombresDep(String NombresDep) {
        this.NombresDep = NombresDep;
    }

    public String[] getnumeroProvi() {
        return numeroProvi;
    }

    public void setnumeroProvi(String[] numeroProvi) {
        this.numeroProvi = numeroProvi;
    }

    public void mostrarNombres(){
        for (int i=0;i<this.numeroProvi.length;i++){
            System.out.print(numeroProvi[i] + " ");
        }
        System.out.println();
    }
}
