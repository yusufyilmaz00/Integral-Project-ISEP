package sprintB.us12;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
public class Routes {
    private List<Edge> routes;

    public Routes() {
        routes = new ArrayList<Edge>();
    }

    public void add(Edge e) {
        routes.add(e);
    }

    public List<WaterPoint> getVertices() {
        List<WaterPoint> result = new ArrayList<WaterPoint>();
        for (Edge e : routes) {
            if (!result.contains(e.getX()))
                result.add(e.getX());
            if (!result.contains(e.getY()))
                result.add(e.getY());
        }

        return result;
    }

    @Override
    public String toString() {
        return "Graph{" +
                "graph=\n" + routes +
                '}';
    }

    public List<WaterPoint> getVerticesConnectedToWaterPoint(WaterPoint v){
        List<WaterPoint> result = new ArrayList<>();
        for (Edge e : routes){
            if (e.getX().equals(v))
                result.add(e.getY());
        }
        return result;
    }

    //-> import from csv
    public void importFromCsv (String filePath) {
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(";");
                if (parts.length == 3) {
                    try {
                        this.add(new Edge(new WaterPoint(parts[0].trim()),new WaterPoint(parts[1].trim()), Float.parseFloat(parts[2].trim())));
                    } catch (NumberFormatException e) {
                        System.out.println("Error: Invalid format for route data.");
                    }
                } else {
                    System.out.println("Error: Invalid number of fields in CSV line.");
                }
            }
        } catch (IOException e) {
            System.out.println("Error reading CSV file: " + e.getMessage());
        }
    }
}
