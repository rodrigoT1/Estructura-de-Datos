package EJERCICIOS;

import PILAS.nombres;

public class MainPais {

    public static void main(String[] args) {
        String[] paisEDD = new String[7];
        paisEDD[0] = "RUSSIA";
        paisEDD[1] = "BRASIL";
        paisEDD[2] = "ARGENTINA";
        paisEDD[3] = "BOLIVIA";
        paisEDD[4] = "MEXICO";
        paisEDD[5] = "CHILE";
        paisEDD[6] = "PERU";


        nombres edd = new nombres("EDD", paisEDD);

///finalizar un nombre///
        edd.mostrarNombres();
        agregarNombreProvincial(edd,"ARABIA SAUDITA");
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
