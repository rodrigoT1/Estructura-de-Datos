package ejercicio;

public class Math_utils {
    private String nameAPP;
    private String version;
    private int year;


    public Math_utils(String nameAPP, String version, int year){
        this.nameAPP = nameAPP;
        this. version = version;
        this.year = year;
    }
    public void printlApp(){
        System.out.println(
                this.nameAPP + " - " +
                this.version + " - - " +
                this .year
        );
    }

    public void generateNatualNumbers(int limit){
        for (int i=1; i <= 10; i++){
            System.out.println("numero: " + i);
        }
    }
    public void generatePairNumbers(int limit){

    }
    public void getExtensionFromCI(String CI){

    }
}
