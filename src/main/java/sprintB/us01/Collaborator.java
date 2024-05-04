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

    public void registerSkill() {
        boolean retry = true;
        System.out.println("What Job would you like to have?");
        while (retry) {
            Scanner JobQuestion = new Scanner(System.in);
            String JobName = JobQuestion.nextLine();
            int returnNumber = checkSkill(JobName);
            if (returnNumber == 0) {
                this.addSkill(new Skill(JobName));
                retry = false;
            }
        }
    }

    public int checkSkill(String SkillName){
        boolean res = SkillCatcher(SkillName);
        if (res) {
            System.out.println("Not a valid Skill name, please type again.");
            return 1;
        } else {
            boolean resCheck = CheckifSame(SkillName);
            if (resCheck) {
                System.out.println("This Skill has already been created, please try again.");
                return -1;
            } else {
                System.out.println("Skill added: " + SkillName);
                return 0;
            }
        }

    }

    private boolean SkillCatcher(String SkillName){
        Pattern p = Pattern.compile(
                "[^a-z]", Pattern.CASE_INSENSITIVE);
        Matcher m = p.matcher(SkillName);
        return m.find();
    }

    private boolean CheckifSame(String SkillName){
        boolean exist = false;
        for (Skill skill : this.getSkills()) {
            if (skill.getName().equals(SkillName)) {
                exist = true;
                break;
            }
        }
        return exist;
    }

}

