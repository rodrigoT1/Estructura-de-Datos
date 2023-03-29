package EJERCICIOS;

public class PROVINCIA {


    private String[] nombres;

    public PROVINCIA(String[] nombres) {
        this.nombres = nombres;
    }

    public void setNombres(String[] nombres){
        this.nombres=nombres;
    }
    public String[] getNombres() {
        return nombres;
    }

    public void MostrarProvincia()
    {
        System.out.println("MOSTRANDO provincias");
        System.out.println("sector:"+this.getNombres());
        System.out.println("Nombre: ");
        for(int i=0; i<this.getNombres().length ; i++)
        {
            System.out.print(this.nombres[i]+ ",");
        }
        System.out.println();
    }

    public void aagregarNombrePrincipio(){

    }
}
