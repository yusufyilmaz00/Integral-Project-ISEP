package sprintB.us01;

import java.util.ArrayList;
import java.util.List;

public class Team {
    private Integer currentSize;
    private Integer maxSize;
    private Integer minSize;

    private List<Collaborator> composedCollaborators;

    private List<Skill> skills;

    public Team(Integer minSize, Integer maxSize) {
        this.currentSize = 0;
        this.maxSize = maxSize;
        this.minSize = minSize;
        this.composedCollaborators = new ArrayList<>();
        this.skills = new ArrayList<>();
    }

    public Integer getCurrentSize() {
        return currentSize;
    }

    public void setCurrentSize(Integer currentSize) {
        this.currentSize = currentSize;
    }

    public Integer getMaxSize() {
        return maxSize;
    }

    public void setMaxSize(Integer maxSize) {
        this.maxSize = maxSize;
    }

    public Integer getMinSize() {
        return minSize;
    }

    public void setMinSize(Integer minSize) {
        this.minSize = minSize;
    }

    public List<Collaborator> getComposedCollaborators() {
        return composedCollaborators;
    }

    public void addComposedCollaborators(Collaborator collaborator) {
        this.composedCollaborators.add(collaborator);
    }

    public List<Skill> getSkills() {
        return skills;
    }

    public void addSkills(Skill skill) {
        this.skills.add(skill);
    }
}
