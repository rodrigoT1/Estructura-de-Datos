package EJERCICIO;

public class COLAS {

    private int max;
    private int ini;

    private int fin;
    private int[] numeros;
    public COLAS(){
        this.max=100;
        this.ini=0;
        this.fin=0;
        this.numeros = new int[this.max + 1];
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

    public void adicionar(int nuevoNumero) {
        if (esLlena()) {
            System.out.println("LA COLA ESTA LLENA PAPU");
        } else {
            fin = fin + 1;
            numeros[fin - 1] = nuevoNumero;
        }
    }

    public int eliminar() {
        int elemento = 0;

        if (esVacia()) {
            System.out.println("LA COLA ESTÁ VACÍA");
        } else {
            elemento = numeros[ini];
            ini = ini + 1;
        }
        if(ini == fin){
            ini = 0;
            fin = 0;
        }
        return elemento;
    }

    public int nroElemento(){
        return fin-ini;
    }

    public void vaciar(COLAS Cola){
        while (!Cola.esVacia()){
            adicionar(Cola.eliminar());;
        }
    }

    public void mostrar(){
        if (esVacia()){
            System.out.println("COLA VACIA, NO HAY ITEMS: ");
        }else{
            int elemEliminado;
            System.out.println("mostrando los datos de la cola");
            COLAS aux = new COLAS();
            while(!esVacia()){
                elemEliminado = eliminar();
                System.out.println("VALOR: " + elemEliminado);
                aux.adicionar(elemEliminado);
            }
            vaciar(aux);
        }
    }


}
