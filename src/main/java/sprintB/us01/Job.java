package sprintB.us01;

public class Job {
    private String name;

    /**
     * Create a Job with a name
     *
     * @param name this is the name of the job
     */
    public Job(String name) {
        this.name = name;
    }

    /**
     * It gets the name of the job when we want to print out for example what job, does our HRM has
     *
     * @return return the name
     */
    public String getName() {
        return name;
    }

    /**
     * If we want to change the name of the job, because we mistyped we can do it here,
     *
     * @param name is the new name of the job
     */
    public void setName(String name) {
        this.name = name;
    }
}
