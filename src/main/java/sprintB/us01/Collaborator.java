package sprintB.us01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Collaborator {
    private String name;
    private String email;

    private String phone;
    private List<Skill> skills;

    /**
     * This creates or constructs the collaborator, it requires a name, an email address and a phone number
     * @param name The name of the collaborator
     * @param email The email of the collaborator
     * @param phone The phone number of the collaborator
     */

    public Collaborator(String name, String email, String phone) {
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.skills = new ArrayList<>();
    }

    /**
     * Gets the name of the collaborator
     * @return retunrs the name of the collaborator
     */
    public String getName() {
        return name;
    }


    /**
     * Gets the email of the collaborator
     *
     * @return returns the email of the collaborator
     */
    public String getEmail() {
        return email;
    }

    /**
     * Gets the phone numbe rof the collaborator
     *
     * @return return the phone number
     */
    public String getPhone() {
        return phone;
    }

    /**
     * Here we can add skill to a collaborator
     * @param skill this a skill, which has to be one from the Skill class
     */
    public void addSkill(Skill skill){
        skills.add(skill);
    }

    /**
     * If we want to know what skills our collaborator can do, we can return it
     * @return returns the list of the skill that the collaborator can do
     */
    public List<Skill> getSkills(){
        return skills;
    }

    public void registerJob(){
        Scanner JobQuestion = new Scanner(System.in);
        System.out.println("What work would you like to have?");
        String JobName = JobQuestion.nextLine();
        boolean res = JobCatcher(JobName);
        if (res) {
            System.out.println("Not a valid Job name");

        }else {
            boolean resCheck = CheckifSame(JobName);
            if (resCheck){
                System.out.println("This job has already been created");
            }else{
                this.addSkill(new Skill(JobName));
                System.out.println("Job name is: " + JobName);}
        }

    }

    private boolean JobCatcher(String JobName){
        Pattern p = Pattern.compile(
                "[^a-z]", Pattern.CASE_INSENSITIVE);
        Matcher m = p.matcher(JobName);
        return m.find();
    }

    private boolean CheckifSame(String JobName){
        boolean exist = false;
        for (Skill skill : this.getSkills()) {
            if (skill.getName().equals(JobName)) {
                exist = true;
                break;
            }
        }
        return exist;
    }

}

