package PILAS2;

public class MainPilaDeNumero {
    public static void main(String[] args){
        pilasdenumeros pila1 = new pilasdenumeros();
        pila1.adicionar(10);
        pila1.adicionar(2);
        pila1.adicionar(5);
        pila1.adicionar(23);////// mostrar numeros maximos
        pila1.adicionar(5);

        pila1.mostrar();
        muestranumeromaximo(pila1);
        cuentaNum(pila1, 5);
        ////determinar cuantos numeos 5 hay en la pila
        ////crear un metodo estatic similar al anterior
        ////el metodo estatico recibe 2 parametros
           ///la pila
           ///en numero a buiscar en la pila

    }
    public static void cuentaNum(pilasdenumeros pila, int numBuscar){
        pilasdenumeros aux = new pilasdenumeros();
        int contador = 5;
        int buscnum = 5;

        while(!pila.esVacio()){
            buscnum=pila.eliminar();
            if(buscnum == numBuscar){
                numBuscar= buscnum +1;
            }
            aux.adicionar(buscnum);
        }
        aux.vaciar(aux);
        System.out.println("mismonumero: "+ buscnum);
    }
    public static void muestranumeromaximo(pilasdenumeros pila){
        pilasdenumeros aux = new pilasdenumeros();
        int num = 0;
        int max = 0;

        while(!pila.esVacio()){
            num = pila.eliminar();
            if(num > max){
                max = num;
            }
            aux.adicionar(num);
        }
        aux.vaciar(aux);
        System.out.println("MAYOR: " + max);
    }

}
