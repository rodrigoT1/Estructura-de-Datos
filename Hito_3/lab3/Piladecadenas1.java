package PILAS2_cadenas;

import java.util.Scanner;
public class Piladecadenas1 {

    private int max;    //Siempre // Deternima el maximo de la pila
    private int tope;    //Siempre // Es la cantidad que tenemos la pila
    private String[] cadenas;

    //Constructor
    public Piladecadenas1() {
        this.max = 10;
        this.tope = 0;
        this.cadenas = new String[this.max + 1];
    }

    public boolean esVacio() {
        if (this.tope == 0) {
            return true;
        } else {
            return false;
        }
    }

    private boolean esLleno() {
        if (tope == max) {
            return true;
        } else {
            return false;
        }
    }

    public int nroElementos() {
        return this.tope;
    }

    public String adiciona(String nuevoCadena) {
        if (esLleno() == true) {
            System.out.printf("PILA LLENA");
        } else {
            tope = tope + 1;
            cadenas[tope] = nuevoCadena;
        }
        return nuevoCadena;
    }

    public String elimina() {
        String itemEliminado = " ";
        if (esLleno() == true) {
            System.out.printf("PILA VACIA");
        } else {
            itemEliminado = cadenas[this.tope];
            tope = tope - 1;
        }
        return itemEliminado;
    }

    public void vacia(Piladecadenas1 pila) {
        while (pila.esVacio() == false) {
            adiciona(pila.elimina());
        }
    }

    public void mostrar() {
        String item = " ";

        if (esVacio() == true) {
            System.out.printf("No hay items que mostrar");
        } else {
            System.out.println("Mostrando la pila de Cadenas");
            Piladecadenas1 aux = new Piladecadenas1();
            while (esVacio() == false) {
                item = elimina();
                System.out.println( "Cadena = " +item );
                aux.adiciona(item);
            }
            vacia(aux);
        }
    }
    public void llenar(int nroItems){
        Scanner leer = new Scanner(System.in);
        String nombre = "";
        System.out.println("llenado la pila de nombres(cadenas)");
        for(int i=0; i<nroItems; i++){
            System.out.println("ingrese el nombre:" +(i+1) + ": ");
            nombre = leer.nextLine();
            adiciona(nombre);
            System.out.println();
        }
    }
}
