package COLA.OBJETOS;

public class ColaDeLibros {

    private int max;
    private int ini;
    private int fin;
    private Libro[] Libros;


    public ColaDeLibros(){
        this.max=100;
        this.ini=0;
        this.fin=0;
        this.Libros = new Libro[this.max + 1];
    }

    public boolean esVacia(){
        if(ini == 0 && fin ==0){
            return true;
        }else{
            return false;
        }
    }

    public boolean esLlena(){
        if(fin == max){
            return true;
        }else{
            return false;
        }
    }

    public void adicionar(Libro nuevoLibro) {
        if (esLlena()) {
            System.out.println("LA COLA ESTA LLENA PAPU");
        } else {
            fin = fin + 1;
            Libros[fin - 1] = nuevoLibro;
        }
    }

    public Libro eliminar() {
        Libro elemento = null;

        if (esVacia()) {
            System.out.println("LA COLA ESTÁ VACÍA");
        } else {
            elemento = Libros[ini];
            ini = ini + 1;}
        if(ini == fin){
            ini = fin = 0;

        }
        return elemento;
    }

    public int nroElemento(){
        return fin-ini;
    }

    public void vaciar(ColaDeLibros cola){
        while (!cola.esVacia()){
            adicionar(cola.eliminar());;
        }
    }

    public void mostrar(){
        if (esVacia()){
            System.out.println("COLA VACIA, NO HAY ITEMS: ");
        }else{
            Libro elemEliminado;
            System.out.println("mostrando los datos de la cola");
            ColaDeLibros aux = new ColaDeLibros();
            while(!esVacia()){
                elemEliminado = eliminar();
                elemEliminado.mostrar();
                aux.adicionar(elemEliminado);
            }
            vaciar(aux);
        }
    }
}
