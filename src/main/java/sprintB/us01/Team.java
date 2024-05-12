package sprintB.us01;

import java.util.ArrayList;
import java.util.List;

public class Team {
    private int currentSize;
    private int maxSize;
    private int minSize;

    private List<Skill> skills;

    public Team(int minSize, int maxSize) {
        this.currentSize = 0;
        this.maxSize = maxSize;
        this.minSize = minSize;
        this.skills = new ArrayList<>();
    }

    public int getCurrentSize() {
        return currentSize;
    }

    public void setCurrentSize(int currentSize) {
        this.currentSize = currentSize;
    }

    public int getMaxSize() {
        return maxSize;
    }

    public void setMaxSize(int maxSize) {
        this.maxSize = maxSize;
    }

    public int getMinSize() {
        return minSize;
    }

    public void setMinSize(int minSize) {
        this.minSize = minSize;
    }

    public List<Skill> getSkills() {
        return skills;
    }

    public void addSkills(Skill skill) {
        this.skills.add(skill);
    }

    @Override
    public String toString() {
        return "Team{" +
                " minSize=" + minSize +
                ", maxSize=" + maxSize +
                ", currentSize=" + currentSize +
                ", skills=" + skills +
                '}';
    }
}
