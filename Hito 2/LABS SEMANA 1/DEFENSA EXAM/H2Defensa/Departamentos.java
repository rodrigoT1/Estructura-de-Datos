package H2Defensa;

public class Departamentos {

    private String nombre;
    private int nroDeProvincias;
    private Provincia[] provincia;

    //CONSTRUCTORES
    public Departamentos(String nombre, int nroDeProvincias, Provincia[] provincias){
        this.nombre=nombre;
        this.nroDeProvincias=nroDeProvincias;
        this.provincia=provincias;
    }
    public Departamentos(){

    }
    //GETS Y SETS DE LAS VARIABLES


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNroDeProvincias() {
        return nroDeProvincias;
    }

    public void setNroDeProvincias(int nroDeProvincias) {
        this.nroDeProvincias = nroDeProvincias;
    }

    public Provincia[] getProvincia() {
        return provincia;
    }

    public void setProvincia(Provincia[] provincia) {
        this.provincia = provincia;
    }

    ///////////////////////////////////////////////////////////////////
    public void MuestraDepartamento(){
        System.out.println(getNombre()+" "+" el numero de provincias es: "+getNroDeProvincias()+" las provincias son: ");

        for(int i=0; i< this.getProvincia().length ; i++)
        {
            this.provincia[i].MostrarProvincia();
        }
    }
    public void agregaNuevaProvincia (String dep,Provincia prov){

        if(dep == this.nombre)
        {
            Provincia[] provi = new Provincia[provincia.length + 1];
            for (int i = 0; i < provincia.length; i++) {
                provi[i] = this.provincia[i];
            }
            provi[this.provincia.length] = prov;
            setProvincia(provi);
            setNroDeProvincias(getNroDeProvincias() + 1);
        }else System.out.println("no hay nuevos registros");
    }
}
