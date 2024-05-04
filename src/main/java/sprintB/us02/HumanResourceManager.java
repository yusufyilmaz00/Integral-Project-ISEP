package sprintB.us02;

import sprintB.us01.Skill;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

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

    /**
     * Here we register a new job, where we check if it is good for the requirements
     */
    public void registerJob() {
        boolean retry = true;
        System.out.println("What Job would you like to have?");
        while (retry) {
            Scanner JobQuestion = new Scanner(System.in);
            String JobName = JobQuestion.nextLine();
            int returnNumber = checkJob(JobName);
            if (returnNumber == 0) {
                this.createJobs(JobName);
                retry = false;
            }
        }
    }

    /**
     * Here we test if the job is appropiate by checking if it is already in the list or it has special character
     * @param JobName It is a jobName that was given
     * @return We return integers, 1 means it has special characters, -1 means it is already in the list, 0 means it is correct
     */
    public int checkJob(String JobName){
        boolean res = JobCatcher(JobName);
        if (res) {
            System.out.println("Not a valid job name, please type again.");
            return 1;
        } else {
            boolean resCheck = CheckifSame(JobName);
            if (resCheck) {
                System.out.println("This job has already been created, please try again.");
                return -1;
            } else {
                System.out.println("job added: " + JobName);
                return 0;
            }
        }

    }

    /**
     * Here is the Special Character checker, where we check if it contains special character
     * @param JobName It is the name of the job
     * @return it returns a boolean true, or false, based on regex
     */
    private boolean JobCatcher(String JobName){
        Pattern p = Pattern.compile(
                "[^a-z]", Pattern.CASE_INSENSITIVE);
        Matcher m = p.matcher(JobName);
        return m.find();
    }

    /**
     * It checks if it is already in the list
     * @param JobName name of the job
     * @return returns a boolean true or false based on if it is already in the list or not.
     */
    private boolean CheckifSame(String JobName){
        boolean exist = false;
        for (Job job : this.getJobs()) {
            if (job.getName().equals(JobName)) {
                exist = true;
                break;
            }
        }
        return exist;
    }

}

