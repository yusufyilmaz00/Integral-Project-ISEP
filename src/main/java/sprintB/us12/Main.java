package sprintB.us12;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        Routes r = new Routes();
        r.importFromCsv("C:\\Users\\jerem\\OneDrive - bwedu\\Studium\\7tes Semester\\PPROG\\Allgemein\\Sprint_2\\Data\\US13_JardimEspeciesNucleoRural.csv"); // Provide the correct file path here

        System.out.println(r);


        // Test printing imported routes
//        List<r> routes = importer.getRoutes();
//        for (Route route : routes) {
//            System.out.println(route);
//    }
    }
}

