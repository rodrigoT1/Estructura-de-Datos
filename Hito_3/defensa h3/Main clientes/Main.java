package defensa_h3;

public class Main {
    public static void  main(String[] args){
        Clientes cliente1 = new Clientes("HOMERO", "GARCIA", 17, "ZONA SUR", "MASCULINO");
        Clientes cliente2 = new Clientes("GEORGE", "MICHAEL", 26, "MIRAFLORES", "MASCULINO");
        Clientes cliente3 = new Clientes("RODRIGO", "GARCIA", 23, "ACHUMANI", "MASCULINO");
        Clientes cliente4 = new Clientes("ANDREA", "CUENTAS", 22, "SAN PEDRO", "FEMENINO");
        Clientes cliente5 = new Clientes("XINA", "SUAZO", 18, "VILLA DOLORES", "FEMENINO");
        PilaClientes pila = new PilaClientes();

        pila.adicionar(cliente1);
        pila.adicionar(cliente2);
        pila.adicionar(cliente3);
        pila.adicionar(cliente4);
        pila.adicionar(cliente5);

        //pila.mostrar();

        /////////////METODO 12///////////////
        //mayoresCiertaEdad(,);
        /////////////////////////////////////


        /////////////METODO 13///////////////
        //kEsimoPosicion(,);
        //////////////////////////////////////


        //////////////METODO 14///////////////
        //CambioDeDireccion(,);
        //////////////////////////////////////


        //////////////METODO 15///////////////
        //ordenarPila();
        //////////////////////////////////////

    }
    ///////////////////////////////////////////////////////////////////////////////////////////////////////
    //////////////////////////////////////////////EJERCICIO 12/////////////////////////////////////////////
    public static void mayoresCiertaEdad(PilaClientes pila, int edadMayor) {
        int cantidadMayores = 0;

        while (!pila.esVacio()) {
            Clientes cliente = pila.eliminar();

            if (cliente.getEdad() >= edadMayor) {
                cantidadMayores++;
            }
        }

        if (cantidadMayores == 0) {
            System.out.println("No hay clientes mayores a " + edadMayor + " años");
        } else {
            System.out.println("Hay " + cantidadMayores + " clientes mayores a " + edadMayor + " años");
        }
    }
    ///////////////////////////////////////////////////////////////////////////////////////////////////////////
    ///////////////////////////////////////EJERCICIO 13//////////////////////////////////////////////////////

    public static void kEsimoPosicion(PilaClientes pila, int valorTope){
        PilaClientes aux = new PilaClientes();
        Clientes clienteseliminado = null;
        Clientes alamacenador = null;

        while(!pila.esVacio()){
            clienteseliminado = pila.eliminar();

            if(pila.nroElem() + 1 == valorTope ){
                alamacenador = clienteseliminado;
            }else{
                aux.adicionar(clienteseliminado);
            }
        }
        pila.vaciar(aux);
        pila.adicionar(alamacenador);
    }
    /////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    ////////////////////////////////////////EJERCICIO 14/////////////////////////////////////////////////////////////

    public static void CambioDeDireccion(PilaClientes pila, String DIRECCION){
        PilaClientes aux = new PilaClientes();
        Clientes clientesliminado = null;
        while(!pila.esVacio()){
            clientesliminado=pila.eliminar();
            if(clientesliminado.getGenero().equals("femenino")){
                clientesliminado.setDireccion(DIRECCION);
            }
            aux.adicionar(clientesliminado);
        }
        pila.vaciar(aux);
    }

    /////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    ////////////////////////////////////////EJERCICIO 15/////////////////////////////////////////////////////////////

    public static void ordenarPila(PilaClientes pila){
        PilaClientes aux = new PilaClientes();
        Clientes deletecliente = null;
        PilaClientes almacenar = new PilaClientes();

        while(! pila.esVacio()){
            deletecliente= pila.eliminar();
            if(deletecliente.getGenero().equals("FEMENINO")){
                almacenar.adicionar(deletecliente);
            }else{
                aux.adicionar(deletecliente);
            }
        }
        pila.vaciar(aux);
        pila.vaciar(almacenar);
    }
}
