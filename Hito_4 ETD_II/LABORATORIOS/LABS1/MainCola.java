package COLAS;

public class MainCola {
    public static void main(String[] args){
        ColaDeNumeros cola1 = new ColaDeNumeros();
        cola1.adicionar(4);
        cola1.adicionar(6);
        cola1.adicionar(8);
        cola1.adicionar(3);
        cola1.adicionar(3);
        cola1.adicionar(100);

        ////////////////////////////////////////////////////////////////////////////////////////////////////
        //cola1.mostrar();
        //determinaMultiplosDe3(cola1,3);

    }
    public static void determinaMultiplosDe3(ColaDeNumeros cola, int mutiplos3){
        int cont =0;
        int item=0;
        ColaDeNumeros aux = new ColaDeNumeros();

        while(!cola.esVacia()){
            item =cola.eliminar();
            if(item % mutiplos3==0){
                cont = cont +1;
            }
            aux.adicionar(item);
        }
        cola.vaciar(aux);
        System.out.println("multiplo3= " + cont);
    }
    ////COLA DE OBJETOS
}
