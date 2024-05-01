package sprintB.us12;

import java.util.ArrayList;
import java.util.List;
public class Routes {
    private List<Edge> graph;

    public Routes() {
        graph = new ArrayList<Edge>();
    }

    public void add(Edge e) {
        graph.add(e);
    }

    public List<WaterPoint> getVertices() {
        List<WaterPoint> result = new ArrayList<WaterPoint>();
        for (Edge e : graph) {
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
                "graph=\n" + graph +
                '}';
    }

    public List<WaterPoint> getVerticesConnectedToWaterPoint(WaterPoint v){
        List<WaterPoint> result = new ArrayList<>();
        for (Edge e : graph){
            if (e.getX().equals(v))
                result.add(e.getY());
        }
        return result;
    }

    public void importFromCsv (String filepath) {
        //-> import from csv 
    }
}
