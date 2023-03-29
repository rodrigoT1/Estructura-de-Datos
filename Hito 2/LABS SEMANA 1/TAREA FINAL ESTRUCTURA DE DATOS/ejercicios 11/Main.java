package EJERCICIOS;

import PILAS.nombres;

public class Main {
    public static void main(String[] args) {
        String[] NomProvinEDD = new String[7];
        NomProvinEDD[0] = "Chiquitos";
        NomProvinEDD[1] = "Cordillera";
        NomProvinEDD[2] = "larecaja";
        NomProvinEDD[3] = "desaguadero";
        NomProvinEDD[4] = "Arani";
        NomProvinEDD[5] = "Arque";

        nombres edd = new nombres("EDD", NomProvinEDD);
/// añadir un nombre///
        edd.mostrarNombres();
        agregarNombrePrincipio(edd," ");
        edd.mostrarNombres();
///finalizar un nombre///
        edd.mostrarNombres();
        agregarNombreFinal(edd,"  ");
        edd.mostrarNombres();

    }
/////agregar un nombre
    public static void agregarNombrePrincipio(nombres edd, String nombreAgregar) {
        String[] nombreOri = edd.getNombres();
        String[] nuevosNombres = new String[nombreOri.length + 1];
        nuevosNombres[0] = nombreAgregar;

        for (int i = 0; i < nombreOri.length; i++) {
            nuevosNombres[i + 1] = nombreOri[i];
        }
        edd.setNombres(nuevosNombres);
    }
///agregar al final
    public static void agregarNombreFinal(nombres edd, String nuevoNombre){
        String[]nombresOri=edd.getNombres();
        String[] nuevosNom = new String [nombresOri.length + 1];

        for(int i=0; i < nombresOri.length;i++){
            nuevosNom[i] = nombresOri[i];
        }

        nuevosNom[nombresOri.length ] = nuevoNombre;
        edd.setNombres(nuevosNom);
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
//aumentar un nombre
    public static void aumentarNombre(nombres edd, String nombreAgregar){

        String[] nomOri = edd.getNombres();
        String[] nUevoNOmbres=new String[nomOri.length+1] ;

        nUevoNOmbres[0]=nombreAgregar;

        for (int i=0;i<nomOri.length;i++){

            nUevoNOmbres[i+1]=nomOri[i];
        }
        edd.setNombres(nUevoNOmbres);
    }
}
