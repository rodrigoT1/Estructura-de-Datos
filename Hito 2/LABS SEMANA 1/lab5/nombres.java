package PILAS;

public class nombres {
    private String paralelo;
    private String[] nombres;

    public nombres(String paralelo, String[] nombres) {
        this.paralelo = paralelo;
        this.nombres = nombres;
    }

    public String getParalelo() {
        return paralelo;
    }

    public void setParalelo(String paralelo) {
        this.paralelo = paralelo;
    }

    public String[] getNombres() {
        return nombres;
    }

    public void setNombres(String[] nombres) {
        this.nombres = nombres;
    }
    public void mostrarNombres(){
        for (int i=0;i<this.nombres.length;i++){
            System.out.print(nombres[i] + " ");
        }
        System.out.println();
    }
    public void aagregarNombrePrincipio(){

    }
}
