package Student;

public class Main {
    public static void main(String[] args){
        fullname st1 = new fullname("rodrigo","peres",25);
        //fullname
        String nombre =st1.getfullname();
        System.out.println("nombre:" + nombre);
        st1.setfullname("pepito1");

        String nombrecambiado= st1.getfullname();
        System.out.println("nombre:" + nombrecambiado);

        //lastname
        String apellido= st1.setLastname();
        System.out.println("apellido:" + nombre);
        st1.getLastname("pep1");

        String apellidocambiado= st1.setLastname();
        System.out.println("apellido:" + apellidocambiado);

        // age
        int age = st1.getAge();
        System.out.println("Age:" + age);
        st1.setAge(30);

        int agecambiado= st1.getAge();
        System.out.println("age:" + agecambiado);
    }
}
