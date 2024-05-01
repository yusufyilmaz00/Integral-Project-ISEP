package sprintB.us12;

import java.util.Objects;

public class WaterPoint {
    private String wp;

    public WaterPoint(String wp) {
        this.wp = wp;
    }

    public String getWp() {
        return wp;
    }

    public void setWp(String wp) {
        this.wp = wp;
    }

    @Override
    public String toString() {
        return "WaterPoint{" +
                "wp='" + wp + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        WaterPoint waterpoint = (WaterPoint) o;
        return Objects.equals(wp, waterpoint.wp);
    }

}
