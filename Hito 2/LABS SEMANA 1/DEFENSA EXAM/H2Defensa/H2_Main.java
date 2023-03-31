package H2Defensa;

public class H2_Main {

    public static void main(String[] args)
    {
        ///////EJERCICIO2
        Provincia proTa1 = new Provincia("Gran Chaco");
        Provincia proTa2 = new Provincia("José María Avilés");

        Provincia proLa1 = new Provincia("Murillo");
        Provincia proLa2 = new Provincia("Larecaja");

        Provincia[] provinciasLapaz = new Provincia[2];
        provinciasLapaz[0] = proLa1;
        provinciasLapaz[1] = proLa2;

        Provincia[] provinciasTarija = new Provincia[2];
        provinciasTarija[0] = proTa1;
        provinciasTarija[1] = proTa2;

        Departamentos deLpz = new Departamentos("LA PAZ",2,provinciasLapaz);
        Departamentos deTrj = new Departamentos("TARIJA",2,provinciasTarija);

        Departamentos[] deps = new Departamentos[2];

        deps[0] = deLpz;

        deps[1] = deTrj;

        Pais pa = new Pais("Bolivia",2,deps);

        System.out.println("EJER2 DATOS DEL PAIS: ");

        pa.MuestraPais();

        System.out.println(" ");

        ///////EJERCICIO3

        Provincia proCbba1 = new Provincia("Ayopaya.");
        Provincia[] provinciasCbba = new Provincia[1];
        provinciasCbba[0] = proCbba1;

        Departamentos deCbba = new Departamentos("COCHABAMBA",1,provinciasCbba);
        System.out.println("EJERC3 ACTUALIZACION DE DATOS DE ACUERDO AL PUNTO 3: ");

        pa.agregaDepartamento(deCbba);

        pa.MuestraPais();

        System.out.println(" ");

        /////////EJERCICIO4
        System.out.println("EJER4 PROVINCIA AGREGADA:");

        Provincia proLa3 = new Provincia("Ingavi");

        deLpz.agregaNuevaProvincia("LA PAZ",proLa3);

        pa.MuestraPais();

    }
}
