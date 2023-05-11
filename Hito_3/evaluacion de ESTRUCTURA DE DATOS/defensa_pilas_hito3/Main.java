package defensa_pilas_hito3;

public class Main {

    public static void main(String [] args){

        estudiante est1 = new estudiante("rodrigo", "mendoza", 21, "scr", 75,"18302045scr");
        estudiante est2 = new estudiante("maria", "choque", 23, "el alto", 49,"1984541lp");
        estudiante est3 = new estudiante("george", "Mcfly",20, "oruro", 90,"16724617oru");
        estudiante est4 = new estudiante("emmeth", "braund", 21, "oruro", 75,"3412748cbba");
        estudiante est5 = new estudiante("marty", "mcfly", 23, "oruro", 83,"19427490orur");
        pilaEstudiantes pila = new pilaEstudiantes();

        pila.adicionar(est1);
        pila.adicionar(est2);
        pila.adicionar(est3);
        pila.adicionar(est4);
        pila.adicionar(est5);


        pila.mostrar();
        //EstudiantesAprovados(pila,50);
        //kEsimoPosicion(pila,5);
    }
    public static void EstudiantesAprovados(pilaEstudiantes pila, int estudiantesaprov) {
        int cantidadesrudiantes = 0;

        while (!pila.esVacio()) {
            estudiante cliente = pila.eliminar();

            if (cliente.getNotaFinal() >= estudiantesaprov) {
                cantidadesrudiantes++;
            }
        }
        if (cantidadesrudiantes == 0) {
            System.out.println("No hay estudiantes " + estudiantesaprov + " que no aprovaron");
        } else {
            System.out.println("Hay " + cantidadesrudiantes + " estudiantes que aprovaron");
        }
    }

    public static void kEsimoPosicion(pilaEstudiantes pila, int valorTope){
        pilaEstudiantes aux = new pilaEstudiantes();
        estudiante clienteseliminado = null;
        estudiante alamacenador = null;

        while(!pila.esVacio()){
            clienteseliminado = pila.eliminar();

            if(pila.nroElem() + 1 == valorTope ){
                alamacenador = clienteseliminado;
            }else{
                aux.adicionar(clienteseliminado);
            }
        }
        pila.vaciar(aux);
        pila.adicionar(alamacenador);
    }
    public static void menorNota(pilaEstudiantes pila, int notabaja){
        pilaEstudiantes aux = new pilaEstudiantes();
        estudiante clienteeliminado = null;
        estudiante almacen = null;

        while(!pila.esVacio()){
            clienteeliminado = pila.eliminar();
            if(pila.nroElem() + 1 == notabaja){
                almacen = clienteeliminado;
            }else{
                aux.adicionar(clienteeliminado);
            }
        }
        pila.vaciar(aux);
        pila.adicionar(almacen);
    }

    public static void intercambiaVALORESs(pilaEstudiantes pila){
        pilaEstudiantes aux = new pilaEstudiantes();
        String pila1 = pila.eliminar(); //Ilia
        aux.vaciar(pila);
        String pila2 = pila.eliminar(); //william
        pila.adicionar(pila2);
        pila.vaciar(aux);
        pila.adicionar(pila2);
    }
}
