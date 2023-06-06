package COLA.OBJETOS;

public class Main {

    public static void main(String[]args){
        ColaDeLibros colaDeLibros = new ColaDeLibros();

        Libro libro1 = new Libro(1,"Juan","masculino","MANGA",80);
        Libro libro2 = new Libro(2,"Saul","masculino","MANGA",100);
        Libro libro3 = new Libro(3,"Ana","femenino","HISTORIA",40);
        Libro libro4 = new Libro(4,"Micaela","femenino","HISTORIA",30);
        Libro libro5 = new Libro(5,"`Pepito`","otro","NOVELA",20);
        Libro libro6 = new Libro(6,"Pep","otro","NOVELA",20);
        Libro libro7 = new Libro(7,"Carlos","masculino","ARTE",200);

        colaDeLibros.adicionar(libro1);
        colaDeLibros.adicionar(libro2);
        colaDeLibros.adicionar(libro3);
        colaDeLibros.adicionar(libro4);
        colaDeLibros.adicionar(libro5);
        colaDeLibros.adicionar(libro6);
        colaDeLibros.adicionar(libro7);

//        colaDeLibros.mostrar();
//        encontrarLibroConMenorPaginas(colaDeLibros).mostrar();
//        ordenarColaDeLibrosPorGenero(colaDeLibros);
//        colaDeLibros.mostrar();
//        ordenarColaDeLibrosPorPaginas(colaDeLibros);

        colaDeLibros.mostrar();
        ordenarpaginas(colaDeLibros);
    }

    // crear un metodo estatico que muestre el libro con menor paginas

    public static Libro encontrarLibroConMenorPaginas(ColaDeLibros colaDeLibros){
        // aux
        ColaDeLibros aux = new ColaDeLibros();
        Libro libroMenor = null;
        int paginasMenor = Integer.MAX_VALUE;

        while(!colaDeLibros.esVacia()){
            Libro item = colaDeLibros.eliminar();
            if(item.getPaginas() < paginasMenor){
                paginasMenor = item.getPaginas();
                libroMenor = item;
            }
            aux.adicionar(item);
        }
        colaDeLibros.vaciar(aux);
        return libroMenor;
    }
    // ordenar la cola de libros en base al genero al principio deben estar femenino despues tienen que estar masculinou finalmente otro
    public static void ordenarColaDeLibrosPorGenero(ColaDeLibros colaDeLibros) {
        //aux
        ColaDeLibros fem = new ColaDeLibros();
        ColaDeLibros mas = new ColaDeLibros();
        ColaDeLibros otro = new ColaDeLibros();

        while (!colaDeLibros.esVacia()) {
            Libro libro = colaDeLibros.eliminar();
            String genero = libro.getGenero();

            if (genero.equals("femenino")) {
                fem.adicionar(libro);
            } else if (genero.equals("masculino")) {
                mas.adicionar(libro);
            } else {
                otro.adicionar(libro);
            }
        }

        colaDeLibros.vaciar(fem);
        colaDeLibros.vaciar(mas);
        colaDeLibros.vaciar(otro);
    }
    // crear un metodo que ordenar por la cantidad de paginas que empiece desde 20 y termine en 200
    private static Libro ordenarColaDeLibrosPorPaginas(ColaDeLibros colaDeLibros) {
        int tamaño = colaDeLibros.nroElemento();

        for (int i = 0; i < tamaño - 1; i++) {
            boolean intercambio = false;
            for (int j = 0; j < tamaño - i - 1; j++) {
                Libro libro1 = colaDeLibros.eliminar();
                Libro libro2 = colaDeLibros.eliminar();

                if (libro1.getPaginas() > libro2.getPaginas()) {
                    colaDeLibros.adicionar(libro2);
                    colaDeLibros.adicionar(libro1);
                    intercambio = true;
                } else {
                    colaDeLibros.adicionar(libro1);
                    colaDeLibros.adicionar(libro2);
                }
            }
            if (!intercambio) {
                // Si no se produjo ningún intercambio en la iteración, la cola ya está ordenada
                break;
            }
        }
        return null;
    }
    // solucion
    private static void ordenarpaginas(ColaDeLibros colaDeLibros){
        ColaDeLibros ordenador = new ColaDeLibros();
        ColaDeLibros aux = new ColaDeLibros();
        int nroElem = colaDeLibros.nroElemento();

        for(int i = 1; i<= nroElem; i++){
            Libro libro = ordenarColaDeLibrosPorPaginas(colaDeLibros);

            while (colaDeLibros.esVacia()){
                Libro item = colaDeLibros.eliminar();
                if(item.getCodigoLibro()==libro.getCodigoLibro()){
                    ordenador.adicionar(item);
                }else{
                    aux.adicionar(item);
                }
            }
            colaDeLibros.vaciar(aux);
        }
        colaDeLibros.vaciar(ordenador);
        colaDeLibros.mostrar();
    }



}
