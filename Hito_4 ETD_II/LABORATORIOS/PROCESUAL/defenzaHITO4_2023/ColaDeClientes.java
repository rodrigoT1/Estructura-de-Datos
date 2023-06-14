package DefenzaH42023;

public class ColaDeClientes {
    private int ini;
    private int fin;
    private int max;
    private Cliente[] clientes;

    public ColaDeClientes(){
        this.max=100;
        this.fin=0;
        this.ini=0;
        this.clientes=new Cliente[this.max+1];
    }
    public boolean esVacio(){
        if(ini==0&&fin==0){
            return true;}else{
            return false;
        }
    }
    public boolean esLleno(){
        if(fin==max){
            return true;}
        else{
            return false;
        }
    }
    public int nroElem()
    {
        return this.fin-this.ini;
    }

    public Cliente adicionar(Cliente nuevoCli)
    {
        if(esLleno()){
            System.out.println("COLA LLENA");
        }else{
            fin=fin+1;
            clientes[fin]=nuevoCli;
        }
        return nuevoCli;
    }
    public Cliente eliminar()
    {
        Cliente itemEliminado=null;
        if(esVacio()){
            System.out.println("COLA VACIA");
        }else{
            ini=ini+1;
            itemEliminado=clientes[ini];
            if (ini==fin){
                ini=fin=0;
            }
        }
        return itemEliminado;
    }
    public void mostrar()
    {
        Cliente item;
        if(esVacio())
        {
            System.out.println("No hay items que mostrar");
        }else{
            System.out.println("Mostrando la COLA DE CLIENTES: ");
            ColaDeClientes aux=new ColaDeClientes();
            while(!esVacio()){
                item=eliminar();
                item.muestraCliente();
                aux.adicionar(item);
            }
            vaciar(aux);
        }
    }
    public void vaciar(ColaDeClientes cola)
    {
        while (!cola.esVacio()) {
            adicionar(cola.eliminar());
        }
    }

    public int getIni() {
        return ini;
    }

    public int getFin() {
        return fin;
    }
}
