package sprintB.us02;

import sprintB.us01.Skill;

import java.util.ArrayList;
import java.util.List;

public class HumanResourceManager {
    private String name;
    private String email;

    private String phone;
    private List<Job> Jobs;

    /**
     * This creates or constructs the HRM, it requires a name, an email address and a phone number
     * @param name The name of the HRM
     * @param email The email of the HRM
     * @param phone The phone number of the HRM
     */

    public HumanResourceManager(String name, String email, String phone) {
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.Jobs = new ArrayList<>();
    }

    /**
     * Gets the name of the HRM
     * @return retunrs the name of the HRM
     */
    public String getName() {
        return name;
    }


    /**
     * Gets the email of the HRM
     *
     * @return returns the email of the HRM
     */
    public String getEmail() {
        return email;
    }

    /**
     * Gets the phone numbe rof the HRM
     *
     * @return return the phone number
     */
    public String getPhone() {
        return phone;
    }

    /**
     * Here we can add skill to a HRM
     * @param newJob this a skill, which has to be one from the Skill class
     */
    public void createJobs(String newJob){
        Jobs.add(new Job(newJob));
    }

    /**
     * If we want to know what skills our HRM can do, we can return it
     * @return returns the list of the skill that the collaborator can do
     */
    public List<Job> getJobs(){
        return Jobs;
    }
}

