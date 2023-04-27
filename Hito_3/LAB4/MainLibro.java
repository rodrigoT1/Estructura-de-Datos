package Pila_de_clase;

import PILAS.nombres;
import PILAS2.Pilasdenumeros;
import PILAS2_cadenas.Piladecadenas1;

public class MainLibro {
    public static void main(String [] args){
        Libro libro1A = new Libro("Homero", 500, 30.00, "La Odisea", "Hostoria");
        Libro libro2A = new Libro("Homero", 300, 20.00, "La Iliada", "Hostoria");
        PilaDeLibros pilaA = new PilaDeLibros();
        pilaA.adicionar(libro1A);
        pilaA.adicionar(libro2A);
        //pila.mostrar();
        //determinarPrecioMayorA25(pila, 25);
        ///descuento();
        ///////////////////////////////////////////////////////////////////////////////////////////////////////////////
        Libro libro1B = new Libro("Juan", 500, 6.00, "La Odisea", "Hostoria");
        Libro libro2B = new Libro("Juna", 300, 100.00, "La Iliada", "Hostoria");
        PilaDeLibros pilaB = new PilaDeLibros();
        pilaB.adicionar(libro1A);
        pilaB.adicionar(libro2A);



    }
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    //ejercicio1
    //1 determinar cuantos libro tiene un costo mayor a 25
    //1 A)crear un metodo satatico en la calse main
    //1 B)el metodo debera mostrar el mensaje
    //1 libros con precio mayor a 25bs =1

    public static void determinarPrecioMayorA25(PilaDeLibros pila, double precio){
        PilaDeLibros aux = new PilaDeLibros();
        Libro item = null;
        int cont = 0;

        while(!pila.esVacio()){
            item =pila.eliminar();

            if(item.getPrecio() > precio){
                cont = cont  + 1;
            }
            aux.adicionar(item);
        }
        pila.vaciar(aux);
        System.out.println("Libros con precio mayor a " + precio + " bs = " + cont);
    }
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    //ejercicio2
    //a todos los libros de categoria historia agregar
    //descuento al precio de 10%
    //A) crear un mrtodo estatico en clase main
    //B) el metodo debera cambiar los nuevos precios en base al descuento
    public static void descuento(PilaDeLibros pila ,String categoria ){
        PilaDeLibros aux = new PilaDeLibros();
        Libro itemeliminado=null;
        double descuento=0;
        double cont=0;
        while(!pila.esVacio()){
            itemeliminado=pila.eliminar();
            if(itemeliminado.getCategoria()==categoria){
                cont=(itemeliminado.getPrecio()*0.1);
                descuento= (itemeliminado.getPrecio()-cont);
            }
            System.out.println("el descuento es de: "+ descuento);
            aux.vaciar(aux);
        }
    }
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    //ejercicio3



    ////////verificar el code
    public static void obtenerpreciomayor(PilaDeLibros pila){
       PilaDeLibros aux = new PilaDeLibros();
       Libro libro = null;
       double max = Integer.MIN_VALUE;

       while(!pila.esVacio()){
           libro = pila.eliminar();
           if(libro.getPrecio() > max){
               max = libro.getPrecio();
           }
           aux.adicionar(libro);
       }
       pila.vaciar(aux);
       return ;
    }
}
