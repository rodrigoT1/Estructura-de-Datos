package COLAS;

public class MainCola {
    public static void main(String[] args){
        ColaDeNumeros cola1 = new ColaDeNumeros();
        cola1.adicionar(4);
        cola1.adicionar(8);
        cola1.adicionar(7);
        cola1.adicionar(4);
        cola1.adicionar(6);
        cola1.adicionar(100);

        ////////////////////////////////////////////////////////////////////////////////////////////////////
//        cola1.mostrar();
//        determinaMultiplosDe3(cola1,3);
        eliminarNumerosRepetidos(cola1);
//        System.out.println(verifica_Si_Existe_Uno_Mas(cola1, 4));
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
    //////////////////////////////////////////////////////////LABS2///////////////////////////////////////////////////////////////////////////////
    ////COLA DE OBJETOS

    ///crear un metodo que si un numero que son repetidos se elimine uno de ellos

    public static void eliminarNumerosRepetidos(ColaDeNumeros cola){
        int nroElem = cola.nroElemento();
        int item;

        for (int i = 1 ; i <= nroElem; i++){
            item = cola.eliminar();

            if (!verifica_Si_Existe_Uno_Mas(cola, item)) {
                cola.adicionar(item);
            }
        }
        cola.mostrar();
    }


    public static boolean verifica_Si_Existe_Uno_Mas(ColaDeNumeros cola, int num) {
        int cont = 0;
        int item = 0;
        int nrElem = cola.nroElemento();

        for (int i = 1; i <= nrElem; i++) {
            item = cola.eliminar();
            if (item == num) {
                cont = cont + 1;
            }else{
                cola.adicionar(item);
            }
        }
        if(cont>0)
            return true;
        return false;
    }}



//    public static void eliminarNumerosRepetidos(ColaDeNumeros cola) {
//        int nroElem = cola.nroElemento();
//
//        for (int i = 1; i <= nroElem; i++) {
//            int item = cola.eliminar();
//
//            if (!verifica_Si_Existe_Uno_Mas(cola, item)) {
//                cola.adicionar(item);
//            }
//        }
//
//        cola.mostrar();
//    }
//
//    public static boolean verifica_Si_Existe_Uno_Mas(ColaDeNumeros cola, int num) {
//        int cont = 0;
//        int nrElem = cola.nroElemento();
//
//        for (int i = 1; i <= nrElem; i++) {
//            int item = cola.eliminar();
//
//            if (item == num) {
//                cont++;
//            }
//
//            cola.adicionar(item);
//        }
//
//        return cont > 0;
//    }

