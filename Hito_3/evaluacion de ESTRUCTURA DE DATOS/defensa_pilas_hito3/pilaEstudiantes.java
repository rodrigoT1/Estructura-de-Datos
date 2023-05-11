package defensa_pilas_hito3;

import Pila_de_clase.Libro;
import Pila_de_clase.PilaDeLibros;

public class pilaEstudiantes {
    private int max;
    private int tope;
    private estudiante[] estudiantes;

    public pilaEstudiantes(){
        this.tope = 0;
        this.max = 10;
        this.estudiantes = new estudiante[this.max+1];
    }

    public boolean esVacio(){
        if (tope==0){
            return true;
        }
        else{
            return false;
        }
    }

    public boolean esllena(){
        if (tope == max){
            return true;
        }
        else{
            return false;
        }

    }
    public int nroElem(){
        return tope;
    }

    public void adicionar(estudiante nuevoEstudiantes){
        if(esllena()==true){
            System.out.println("Pila de esudiantes es llena:");

        }else{
            tope=this.tope + 1;
            estudiantes[tope]=nuevoEstudiantes;
        }
    }

    public estudiante eliminar(){
        estudiante EstudianteEliminado = null;

        if(!this.esVacio()){
            EstudianteEliminado = estudiantes[tope];
            tope = tope - 1;
        }
        else{
            System.out.println("Pila de estudiantes vacia carnal:");
        }

        return EstudianteEliminado;
    }

    public void vaciar(pilaEstudiantes pila){

        while (pila.esVacio()){
            adicionar(pila.eliminar());
        }
    }

    public void mostrar(){

        estudiante estudiante = null;
        if(esVacio()){
            System.out.println("Pila vacia no hay items que mostrar");
        }
        else
        {
            System.out.println("\nmostrando la Pila de estudiantes");
            pilaEstudiantes aux = new pilaEstudiantes();
            while(!esVacio())
            {
                estudiante = eliminar();
                aux.adicionar(estudiante);
                estudiante.mostrarEstudiante();
            }
            vaciar(aux);
        }
    }
}
