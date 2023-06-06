package EJERCICIO;

public class EJERCICIO1 {
    public static void main(String[] args){
        COLAS cola1 = new COLAS();
        cola1.adicionar(4);
        cola1.adicionar(8);
        cola1.adicionar(7);
        cola1.adicionar(4);
        cola1.adicionar(8);
        cola1.adicionar(100);


        System.out.println("Cola original:");
        cola1.mostrar();

        eliminarNumerosRepetidos(cola1);
    }

    public static void eliminarNumerosRepetidos(COLAS cola) {
        int nroElem = cola.nroElemento();
        int item;

        for (int i = 1; i <= nroElem; i++) {
            item = cola.eliminar();

            if (!verifica_Si_Existe_Uno_Mas(cola, item)) {
                cola.adicionar(item);
            }
        }

        System.out.println("Cola sin números repetidos:");
        cola.mostrar();
    }

    public static boolean verifica_Si_Existe_Uno_Mas(COLAS cola, int num) {
        int cont = 0;
        int item = 0;
        int nrElem = cola.nroElemento();

        for (int i = 1; i <= nrElem; i++) {
            item = cola.eliminar();
            if (item == num) {
                cont = cont + 1;
            } else {
                cola.adicionar(item);
            }
        }

        if (cont > 0)
            return true;
        return false;
    }

}
