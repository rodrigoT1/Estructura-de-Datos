package EJERCICIOS;

import PILAS.nombres;

public class MainDepartamento {

    public static void main(String[] args) {
        String[] NomDepEDD = new String[3];
        NomDepEDD[0] = "Santa Cruz";
        NomDepEDD[1] = "La Paz";
        NomDepEDD[2] = "Cochabamba";

        nombres edd = new nombres("EDD", NomDepEDD);

///finalizar un nombre///
        edd.mostrarNombres();
        agregarNombreProvincial(edd,"Pando");
        edd.mostrarNombres();

    }

    public static void agregarNombreProvincial(nombres edd, String nuevoNombre){
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
}
