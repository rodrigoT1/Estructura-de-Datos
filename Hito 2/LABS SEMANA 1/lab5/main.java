package PILAS;

    public class main {
        public static void main(String[] args) {
            int[] edadesEDD = new int[5];
            edadesEDD[0] = 33;
            edadesEDD[1] = 20;
            edadesEDD[2] = 19;
            edadesEDD[3] = 42;
            edadesEDD[4] = 25;

            int[] edadesDBAII = new int[5];
            edadesDBAII[0] = 30;
            edadesDBAII[1] = 20;
            edadesDBAII[2] = 19;
            edadesDBAII[3] = 15;
            edadesDBAII[4] = 25;

            Edades par1 = new Edades("Unifranz", "EDD", edadesEDD);
            Edades par2 = new Edades("Unifranz", "DBA II", edadesDBAII);

            //Mostrando el array de EDADES (EDD)
            //par1.mostrar();

            //Determinar la edad mayor
            //determinaEdadMayor(par1);

            //suma mas 5 a los pares
            //sumaEdadesPares5(par1);
            //par1.mostrar();

            //Intercambia valores entre dos arrays
            par1.mostrar();
            par2.mostrar();

            intercambiaValores(par1, par2);

            par1.mostrar();
            par2.mostrar();
        }

        public static int determinaEdadMayor(Edades obj1) {
            int[] edades = obj1.getEdades();
            int mayorEdad = edades[0];

            for (int i=1; i< edades.length; i++){
                if (edades[i] > mayorEdad) {
                    mayorEdad = edades[i];
                }
            }

            System.out.println("Edad Mayor: " + mayorEdad);
            return mayorEdad;
        }

        public static void sumaEdadesPares5(Edades obj1) {
            int[] edades = obj1.getEdades();

            for (int i=0; i< edades.length; i++){
                if (edades[i] % 2 == 0) {
                    edades[i] = edades[i] + 5;
                }
            }

            obj1.setEdades(edades);
        }

        public static void intercambiaValores(Edades par1, Edades par2) {
            int mayorEDD = determinaEdadMayor(par1);
            int mayorDBA = determinaEdadMayor(par2);

            int[] edadesEDD = par1.getEdades();
            for (int i = 0; i < edadesEDD.length; i++) {
                if (edadesEDD[i] == mayorEDD) {
                    edadesEDD[i] = mayorDBA;
                }
            }

            int[] edadesDBA = par2.getEdades();
            for (int i = 0; i < edadesDBA.length; i++) {
                if (edadesDBA[i] == mayorDBA) {
                    edadesDBA[i] = mayorEDD;
                }
            }
        }
    }
