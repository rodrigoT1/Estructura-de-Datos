package DefenzaH42023;

import java.util.Objects;

public class Main {

        public static void main(String[] args) {

            ColaDeClientes colaClientes=new ColaDeClientes();
            Cliente cliente1 = new Cliente("Rodrigo","Torrez",60,"Bolivia","Masculino","Gold");
            Cliente cliente2 = new Cliente("Emeth","Brount",38,"Mexico","Masculino","Silver");
            Cliente cliente3 = new Cliente("Louren","McFly",68,"Bolivia","Femenino","Gold");
            Cliente cliente4 = new Cliente("George","McFly",90,"Bolivia","Masculino","Silver");
            Cliente cliente5 = new Cliente("Saul","McFly",70,"Peru","Masculino","Gold");
            //-------------------------------------------------------------------------------------------------------------------------------
            ColaDeClientes colaClientes2=new ColaDeClientes();
            Cliente cliente6=new Cliente("Biff","Tannen",50,"Peru","Masculino","Gold");
            Cliente cliente7=new Cliente("jose","Fernandez",34,"Chile","Masculino","silver");
            Cliente cliente8=new Cliente("Marty","Mercury",28,"Bolivia","Masculino","silver");
            Cliente cliente9=new Cliente("Mario","Choque",20,"Mexico","Masculino","Gold");
            Cliente cliente10=new Cliente("Luigi","Conde",64,"Argentina","Masculino","Gold");

            colaClientes.adicionar(cliente1);
            colaClientes.adicionar(cliente2);
            colaClientes.adicionar(cliente3);
            colaClientes.adicionar(cliente4);
            colaClientes.adicionar(cliente5);
            colaClientes.mostrar();

            colaClientes2.adicionar(cliente6);
            colaClientes2.adicionar(cliente7);
            colaClientes2.adicionar(cliente8);
            colaClientes2.adicionar(cliente9);
            colaClientes2.adicionar(cliente10);
            colaClientes2.mostrar();
            
            //Gold_a_Vip(colaClientes,"Gold","Bolivia");
            //Mayores_a_60(colaClientes,60);
            //mover_Cliente_saul(colaClientes,colaClientes2,"Saul");
        }
        //EJERCICIO 13
        public static void Gold_a_Vip(ColaDeClientes cola,String tipo, String nacionalidad){
            ColaDeClientes aux = new ColaDeClientes();
            Cliente cont;
            while(!cola.esVacio()){
                cont=cola.eliminar();
                if(Objects.equals(cont.getPais(),nacionalidad) && Objects.equals(cont.getTipo(),tipo)){
                    cont.setTipo("Vip");
                }
                aux.adicionar(cont);
            }
            cola.vaciar(aux);
            cola.mostrar();
        }
        //EJERCICIO 14
        public static void Mayores_a_60(ColaDeClientes cola, int edad){
            ColaDeClientes aux = new ColaDeClientes();
            ColaDeClientes aux1 = new ColaDeClientes();
            Cliente item;

            while (!cola.esVacio()){
                item=cola.eliminar();

                if(item.getEdad() > edad){
                    aux.adicionar(item);
                }else {
                    aux1.adicionar(item);
                }
            }
            cola.vaciar(aux);
            cola.vaciar(aux1);
            cola.mostrar();
        }
        // EJERCICIO 15
        public static void mover_Cliente_saul(ColaDeClientes colaA,ColaDeClientes colaB,String nombre){
            ColaDeClientes aux=new ColaDeClientes();
            ColaDeClientes aux1=new ColaDeClientes();
            Cliente item;
            Cliente itemB;
            while (!colaA.esVacio()){
                item=colaA.eliminar();
                itemB=colaB.eliminar();
                if(Objects.equals(item.getNombres(),nombre)){
                    aux1.adicionar(item);
                }
                else {
                    aux.adicionar(item);
                }
                aux1.adicionar(itemB);
            }
            colaA.vaciar(aux);
            colaB.vaciar(aux1);
            colaA.mostrar();
            System.out.println("Mostrando COLA de clientes B");
            colaB.mostrar();
        }


}
