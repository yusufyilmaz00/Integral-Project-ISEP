package sprintB.us12;

import java.util.Objects;

public class Edge {
    private WaterPoint x;
    private WaterPoint y;
    private float distance;

    public Edge(WaterPoint orig, WaterPoint dest, float dist) {
        this.x = orig;
        this.y = dest;
        this.distance = dist;
    }

    public WaterPoint getX() {
        return x;
    }

    public void setX(WaterPoint x) {
        this.x = x;
    }

    public WaterPoint getY() {
        return y;
    }

    public void setY(WaterPoint y) {
        this.y = y;
    }

    public float getDistance() {
        return distance;
    }

    public void setDistance(float distance) {
        this.distance = distance;
    }

    @Override
    public String toString() {
        return String.format("%3s --%3.1f-->%3s\n", x, distance, y);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Edge edge = (Edge) o;
        return Float.compare(distance, edge.distance) == 0 && Objects.equals(x, edge.x) && Objects.equals(y, edge.y);
    }

}

