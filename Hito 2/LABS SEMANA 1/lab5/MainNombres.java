package PILAS;

public class MainNombres {
    public static void main(String[] args) {
        String[] nombresEDD = new String[5];
        nombresEDD[0] = "Ana";
        nombresEDD[1] = "Juan";
        nombresEDD[2] = "Pepito";
        nombresEDD[3] = "Carla";
        nombresEDD[4] = "Freddy";

        nombres edd = new nombres("EDD", nombresEDD);

        edd.mostrarNombres();
        agregarNombrePrincipio(edd,"delia");
        edd.mostrarNombres();

        edd.mostrarNombres();
        agregarNombreFinal(edd,"will");
        edd.mostrarNombres();

        //Crear un metodo estatico que determine cuantas personas
        //del paralelo EDD tienen el nombre Pepito
        int c = cuentaNombres(edd, "Pepito");
        System.out.println("Pepito se repite: " + c);
    }
    public static void agregarNombreFinal(nombres edd, String nuevoNombre){
        String[]nombresOri=edd.getNombres();
        String[] nuevosNom = new String [nombresOri.length + 1];

        for(int i=0; i < nombresOri.length;i++){
            nuevosNom[i] = nombresOri[i];
        }

        nuevosNom[nombresOri.length ] = nuevoNombre;
        edd.setNombres(nuevosNom);
    }
    public static void agregarNombrePrincipio(nombres edd, String nombreAgregar) {
        String[] nombreOri = edd.getNombres();
        String[] nuevosNombres = new String[nombreOri.length + 1];
        nuevosNombres[0] = nombreAgregar;

        for (int i = 0; i < nombreOri.length; i++) {
            nuevosNombres[i + 1] = nombreOri[i];
        }
        edd.setNombres(nuevosNombres);
    }
    public static void aumentarNombre(nombres edd, String nombreAgregar){

        String[] nomOri = edd.getNombres();
        String[] nUevoNOmbres=new String[nomOri.length+1] ;

        nUevoNOmbres[0]=nombreAgregar;

        for (int i=0;i<nomOri.length;i++){

            nUevoNOmbres[i+1]=nomOri[i];
        }
        edd.setNombres(nUevoNOmbres);
    }

    public static int cuentaNombres(nombres edd, String nombreBuscar)
    {
        String[] nombres = edd.getNombres();
        int i = 0;
        int contador = 0;

        for (i = 0; i < nombres.length; i++) {
            if (nombres[i] == nombreBuscar) {
                contador = contador + 1;
            }
        }
        return contador;
    }

}
