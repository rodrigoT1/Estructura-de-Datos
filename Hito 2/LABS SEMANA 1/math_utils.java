package ejercicios;

public class math_utils {
    private String nameAPP;
    private String version;
    private int year;


    public math_utils(String nameAPP, String version, int year){
        this.nameAPP = nameAPP;
        this. version = version;
        this.year = year;
    }
    public void printlApp(){
        System.out.println(this.nameAPP + " - " + this.version + " - - " + this .year
        );
    }
    public void generateNatualNumbers(int limit){
        for (int i=1; i <= 10; i++){
            System.out.println("numero: " + i);
        }
    }
    public void generatePairNumbers(int limit){
        System.out.println("generando numeros pares (FOR)");
        for (int i=0; i<=limit;i+=2){
            System.out.print(i + " - ");
        }
    }
    public void getExtensionFromCI(String CI){
        System.out.println("mostrar extencion de la cedula");
        String ext="";
        //63534878
        ext = CI.substring(8);
        // mostrando la extencion
        System.out.println("extencion = " + ext);
    }
}
