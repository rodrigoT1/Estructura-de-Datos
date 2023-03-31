package H2Defensa;

public class Pais {

    private String nombre;
    private Departamentos[] departamentos;
    private int nroDeDeps;


    //CONTRUCTORES
    public Pais(){

    }
    public Pais(String pais,int nroDeDeps, Departamentos[] departamentos){
        this.nombre= pais;
        this.nroDeDeps=nroDeDeps;
        this.departamentos=departamentos;
    }
    //SETS Y GETS DE PAIS


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Departamentos[] getDepartamentos() {
        return departamentos;
    }

    public void setDepartamentos(Departamentos[] departamentos) {
        this.departamentos = departamentos;
    }

    public int getNroDeDeps() {
        return nroDeDeps;
    }

    public void setNroDeDeps(int nroDeDeps) {
        this.nroDeDeps = nroDeDeps;
    }

    /////////////////////
    public void MuestraPais(){
        System.out.println("el pais es: "+getNombre()+", "+"el numero de departamentos es: "+getNroDeDeps()+", "
                +"los departamentos son: ");
        for(int i=0; i < this.getDepartamentos().length; i++)
        {
            this.departamentos[i].MuestraDepartamento();
        }
    }

    public void agregaDepartamento(Departamentos cbba){

        Departamentos[] nuevosDep = new Departamentos[departamentos.length+1];
        for(int i=0; i< departamentos.length ; i++)
        {
            nuevosDep[i]=departamentos[i];
        }
        nuevosDep[this.departamentos.length]=cbba;
        setDepartamentos(nuevosDep);
        setNroDeDeps(getNroDeDeps()+1);
    }
}
