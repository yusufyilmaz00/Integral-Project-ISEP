package sprintB.us12;

import java.io.File;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        //Get the two FilePath, that we will need for US13
        String FilePathDos = System.getProperty("user.dir") + "\\docs\\sprintB\\us13\\Data\\US13_JardimDosSentimentos.csv";
        String FilePathEspecies = System.getProperty("user.dir") + "\\docs\\sprintB\\us13\\Data\\US13_JardimEspeciesNucleoRural.csv";

        //Creates the Routes, now only just one, later we will decide how to implement.
        Routes r = new Routes();
        r.importFromCsv(FilePathEspecies); // Provide the correct file path here

        System.out.println(r);


        // Test printing imported routes
//        List<r> routes = importer.getRoutes();
//        for (Route route : routes) {
//            System.out.println(route);
//    }
    }
}

