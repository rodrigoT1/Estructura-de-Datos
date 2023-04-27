package Pila_de_clase;

public class PilaDeLibros {

    private int max;
    private int tope;
    private Libro[] libros;

    public PilaDeLibros(){
        this.tope = 0;
        this.max = 10;
        this.libros = new Libro[this.max+1];

    }
    public boolean esVacio(){
        if (tope==0){
            return true;
        }
        else{
            return false;
        }
    }

    public boolean esllena(){
        if (tope == max){
            return true;
        }
        else{
            return false;
        }

    }
    public int nroElem(){
        return tope;
    }

    public void adicionar(Libro nuevoLibro){
        if(esllena()==true){
            System.out.println("Pila de libros llena:");

        }else{
            tope=this.tope + 1;
            libros[tope]=nuevoLibro;
        }
    }
    public Libro eliminar(){
        Libro LibroEliminado = null;

        if(!this.esVacio()){
            LibroEliminado = libros[tope];
            tope = tope - 1;
        }
        else{
            System.out.println("Pila de libros vacia:");
        }

        return LibroEliminado;
    }

    public void vaciar(PilaDeLibros pila){

        while (pila.esVacio()){
            adicionar(pila.eliminar());
        }
    }
    public void mostrar(){

        Libro libro = null;
        if(esVacio()){
            System.out.println("Pila vacia no hay items que mostrar");
        }
        else
        {
            System.out.println("\nmostrando la Pila de Libros");
            PilaDeLibros aux = new PilaDeLibros();
            while(!esVacio())
            {
                libro = eliminar();
                aux.adicionar(libro);
                libro.mostrarLibro();
            }
            vaciar(aux);
        }
    }
}
