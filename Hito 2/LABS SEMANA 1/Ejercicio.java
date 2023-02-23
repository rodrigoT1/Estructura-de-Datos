package ejercicio;

public class Ejercicio {
    private int i;
    private int limite;

    public Ejercicio(){
        this.i=1;
        this.limite=10;
    }
    public void mostrarMensaje(){
        System.out.println("hola mundo master JAVA");
    }
    public void generarNumerosNaturalesFOR(){
        for (int i=1; i <= 10; i++){
            System.out.println("numero: " + i);
        }
    }
    public void generarNaturalesParesFOR(){
        for (int i=1; i <= 20; i++){
            if (i%2 == 0){
                System.out.print(i + ",");
            }
        }
    }
    public void generarNaturalesWHILE(){
        int i=1;
        while (i<=5){
            i++;
            System.out.print(i + ",");
            // i=i+1;
            //i++
            //i+=1
        }
    }
}
