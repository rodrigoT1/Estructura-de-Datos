package DEFENSA_HITO4_2023;
import java.util.Objects;
public class Main {
    public static void main(String[] args) {
        ColaDeClientes colaClientes = new ColaDeClientes();
        Cliente cliente1 = new Cliente(6775623,"Rodrigo","Torrez",58,"Bolivia","Masculino","Gold");
        Cliente cliente2 = new Cliente(5111918,"Emeth","Brount",38,"Mexico","Masculino","Silver");
        Cliente cliente3 = new Cliente(6596125,"Louren","Mamani ",65,"Bolivia","Femenino","Gold");
        Cliente cliente4 = new Cliente(6265288,"George","Mamani",50,"Bolivia","Masculino","Gold");
        Cliente cliente5 = new Cliente(1321651,"Saul","McFly",66,"Peru","Masculino","Gold");

        colaClientes.adicionar(cliente1);
        colaClientes.adicionar(cliente2);
        colaClientes.adicionar(cliente3);
        colaClientes.adicionar(cliente4);
        colaClientes.adicionar(cliente5);

       //colaClientes.mostrar();
        aplicarPromocionVIP(colaClientes);
//        Mayores_a_60(colaClientes,60);
//        eliminarPorId(colaClientes, 6775623);
//        eliminarPorId(colaClientes, 5111918);

    }
    //-- PARTE PRACTICA
    // crear un metodo estatico
    //los de apellido m se conviertan en VIP

    public static void aplicarPromocionVIP(ColaDeClientes cola) {
        ColaDeClientes aux = new ColaDeClientes();
        Cliente item;

        int initialSize = cola.nroElem();
        for (int i = 0; i < initialSize; i++) {
            item = cola.eliminar();
            if (item.getTipo().equals("Gold")) {
                item.setTipo("VIP");
                if (item.getApellidos().startsWith("M") &&
                        item.getNombres().endsWith("ni")) {
                }
            }
            aux.adicionar(item);
        }
        cola.vaciar(aux);
        cola.mostrar();
    }

    //mover al inicio
    //USAR CUALQUIER COSA PERO SIN WHILE
    public static void Mayores_a_60(ColaDeClientes cola, int edad) {
        ColaDeClientes aux = new ColaDeClientes();
        ColaDeClientes aux1 = new ColaDeClientes();

        int initialSize = cola.nroElem();
        for (int i = 0; i < initialSize; i++) {
            Cliente item = cola.eliminar();
            if (item.getEdad() > edad) {
                aux.adicionar(item);
            } else {
                aux1.adicionar(item);
            }
        }

        cola.vaciar(aux);
        cola.vaciar(aux1);
        cola.mostrar();
    }

    // crear un metodo estatic
    //eliminar con while o for
    public static void eliminarPorId(ColaDeClientes cola, int id) {
        int count = 0;
        ColaDeClientes aux = new ColaDeClientes();
        Cliente item;

        while (!cola.esVacio()) {
            item = cola.eliminar();

            if (item.getId() != id) {
                aux.adicionar(item);
            } else {
                count++;
                if (count == 2) {
                    break;
                }
            }
        }
        cola.vaciar(aux);
        cola.mostrar();
    }

}
