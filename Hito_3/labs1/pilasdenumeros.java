package PILAS2;

public class pilasdenumeros {

    private int max;
    private int[] numeros;
    private int tope;

    ///max sera la cantidad maxima
    ///tope sera la cantidad de pilas
    ///nuermos sera de tipo int[] para valores numericos

    public pilasdenumeros(){
        this.max = 10;
        this.tope = 0;
        this.numeros =new int[this.max+1];
    }
    ////METODOS//////

    /////// para ver si esta vacio///////////////////////////
    public boolean esVacio(){

        if (this.tope==0){
            return true;
        }else{
            return false;
        }
    }

    //////para ver si este llena////////////////////////////////
    public boolean esLlena(){
        if(tope==max){
            return true;
        }else{
            return false;
        }
    }

    //////para ver los numeros del elmento////////////////////////
    public int nroElemento(){
        return tope;
    }

    //////PARA adicioanr un numero nuevo/////////////////////////
    ////////// los amarillos son para simplificar pero seguira siendo lo mismo/////////////////////////
    public void adicionar(int nuevoNumero){
        if(esLlena()== true){
            System.out.println("PILA LLENA");
        }else{
            tope = tope + 1;
            numeros [tope] = nuevoNumero;
        }
    }
    ////// para eliminar el nuermos de pilas///////////////////
    public int eliminar(){

        int itemEliminado=0;

        if(esVacio()==true){
            System.out.println("PILA VACIA");
        }else{
            itemEliminado=numeros[this.tope];
            tope = tope - 1;
        }
        return itemEliminado;
    }
    /////// para vaciar los nuemros //////////////
    public void vaciar(pilasdenumeros pila){
        while (!pila.esVacio()==false){
            adicionar(pila.eliminar());;
        }
    }
    //////////////// para mostra los numeros////////////////////
    public void mostrar(){
        int item;
        if (esVacio()==true){
            System.out.println("NO HAY ITEM PARA MOSTRAR: ");
        }else{
            System.out.println("MOSTRANDO PILAS DE NUMEROS: ");
            pilasdenumeros aux = new pilasdenumeros();
            while(esVacio()==false){
                item=eliminar();
                System.out.println("NUMERO= " + item);
                aux.adicionar(item);
            }
            vaciar(aux);
        }
    }
}