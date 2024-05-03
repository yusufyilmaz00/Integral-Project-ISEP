package sprintB.us01;

public class Skill {
    private String name;

    /**
     * Create a skill with a name
     *
     * @param name this is the name of the skill
     */
    public Skill(String name) {
        this.name = name;
    }

    /**
     * It gets the name of the Skill when we want to print out for example what skill, does our collaborator has
     *
     * @return return the name
     */
    public String getName() {
        return name;
    }

    /**
     * If we want to change the name of the skill, because we mistyped we can do it here,
     *
     * @param name is the new name of the skill
     */
    public void setName(String name) {
        this.name = name;
    }
}
