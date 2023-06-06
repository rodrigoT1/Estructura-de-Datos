package COLA.OBJETOS;

public class Libro {

    private int codigoLibro;
    private String autor;
    private String genero;
    private String categorias;
    private int paginas;

    public Libro(int codigoLibro, String autor, String genero, String categorias, int paginas) {
        this.codigoLibro = codigoLibro;
        this.autor = autor;
        this.genero = genero;
        this.categorias = categorias;
        this.paginas = paginas;
    }
    /////////// GETTERS

    public int getCodigoLibro() {
        return codigoLibro;
    }

    public String getAutor() {
        return autor;
    }

    public String getGenero() {
        return genero;
    }

    public String getCategorias() {
        return categorias;
    }

    public int getPaginas() {
        return paginas;
    }

    ///////////// SETTERS

    public void setCodigoLibro(int codigoLibro) {
        this.codigoLibro = codigoLibro;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setCategorias(String categorias) {
        this.categorias = categorias;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }


    public void mostrar(){
        System.out.println("mostrando datos del libro");
        System.out.println("Codigo: " + getCodigoLibro());
        System.out.println("Autor: " + getAutor());
        System.out.println("Genero: " + getGenero());
        System.out.println("Categoria: " + getCategorias());
        System.out.println("Paginas: " + getPaginas());
        System.out.println();
    }
}
