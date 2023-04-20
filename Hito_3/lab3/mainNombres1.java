package PILAS2_cadenas;

public class mainNombres1 {
    public static void main(String[] argv) {

        Piladecadenas1 nombresEDD = new Piladecadenas1();
        nombresEDD.adiciona("William");
        nombresEDD.adiciona("Andres");
        nombresEDD.adiciona("Josias");
        nombresEDD.adiciona("Iris");
        nombresEDD.adiciona("Jonathan");
        nombresEDD.adiciona("Ilia");


        nombresEDD.mostrar();
        KESIMOPOCISION(nombresEDD,2);
        //intercambiaVALORESs(nombresEDD);
        //nombresEDD.llenar(12);
        //cuantaNombres(nombresEDD,"Andres");
        //agregar_nombre(nombresEDD,'ana');
    }
    //cresar un metodo en la clase main que me permita contar
    // cuantos personas se llaman "Andres"

    public static void cuantaNombres(Piladecadenas1 pila, String nombres){
        Piladecadenas1 aux =  new Piladecadenas1();
        String itemEliminado = "";
        int cont = 0;
        while (!pila.esVacio()){
            itemEliminado = pila.elimina();

            if(itemEliminado.equals(nombres)){
                cont = cont + 1;
            }
            aux. adiciona(itemEliminado);
        }
        pila.vacia(aux);
        System.out.println("el nombre " + nombres + " se repite: " + cont + "  veces");
    }
    public static void agregar_nombre(Piladecadenas1 pila ,String nombres, String nuevonombre){

        Piladecadenas1 aux =  new Piladecadenas1();
        String itemEliminado = "";


        while (!pila.esVacio()){
            itemEliminado = pila.elimina();

            if(itemEliminado.equals(nombres)){
                aux. adiciona(nuevonombre);
            }
            aux. adiciona(itemEliminado);
        }
    }
    public static void intercambiaVALORESs(Piladecadenas1 pila){
        Piladecadenas1 aux = new Piladecadenas1();
        String item1 = pila.elimina(); //Ilia     ///////   ////////  ///////   ///////
        aux.vacia(pila);                          //   //   //    //  //    //  //
        String item2 = pila.elimina(); //william  //   //   //    //  //    //  /////
        pila.adiciona(item1);                     ///////   //////    //////    //
        pila.vacia(aux);                          //   //   //   //   //   //   ///////
        pila.adiciona(item2);
    }
    public static void KESIMOPOCISION(Piladecadenas1 pila, int kesimo){
        Piladecadenas1 aux = new Piladecadenas1();
        String nombreKesimo = "";
        String itemEliminado = "";

        while(!pila.esVacio()){
            itemEliminado= pila.elimina();
            if(pila.nroElementos() == kesimo){
                nombreKesimo=itemEliminado;
            }else{
                aux.adiciona(itemEliminado);
            }
        }
        pila.vacia(aux);
        pila.adiciona(nombreKesimo);
    }
}

