package sprintB.us01;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Collaborator {
    private String name;
    private String email;

    private String phone;
    private List<Skill> skills;

    private Date birthDate;

    private Date admissionDate;

    private String address;

    private String taxpayerNumber;

    private String IdDocType;

    private String IdNumber;

    /**
     * This creates or constructs the collaborator, it requires a name, an email address and a phone number
     * @param name The name of the collaborator
     * @param email The email of the collaborator
     * @param phone The phone number of the collaborator
     */

    public Collaborator(String name, String email, String phone, Date birthDate, Date admissionDate, String address, String taxpayerNumber, String IdDocType, String IdNumber) {
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.skills = new ArrayList<>();
        this.birthDate = birthDate;
        this.admissionDate = admissionDate;
        this.address = address;
        this.taxpayerNumber = taxpayerNumber;
        this.IdDocType = IdDocType;
        this.IdNumber = IdNumber;

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

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public Date getAdmissionDate() {
        return admissionDate;
    }

    public void setAdmissionDate(Date admissionDate) {
        this.admissionDate = admissionDate;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getTaxpayerNumber() {
        return taxpayerNumber;
    }

    public void setTaxpayerNumber(String taxpayerNumber) {
        this.taxpayerNumber = taxpayerNumber;
    }

    public String getIdDocType() {
        return IdDocType;
    }

    public void setIdDocType(String idDocType) {
        this.IdDocType = idDocType;
    }

    public String getIdNumber() {
        return IdNumber;
    }

    public void setIdNumber(String idNumber) {
        IdNumber = idNumber;
    }

    @Override
    public String toString() {
        return "Collaborator{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", skills=" + skills +
                ", birthDate=" + birthDate +
                ", admissionDate=" + admissionDate +
                ", address='" + address + '\'' +
                ", taxpayerNumber='" + taxpayerNumber + '\'' +
                ", IdDocType='" + IdDocType + '\'' +
                ", IdNumber='" + IdNumber + '\'' +
                '}';
    }
/**
     * Here we register a new skill, where we check if it is good for the requirements

    public void registerSkill() {
        boolean retry = true;
        System.out.println("What Skill would you like to have?");
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

    /**
     * Here we test if the skill is appropiate by checking if it is already in the list or it has special character
     * @param SkillName It is a Skill Name that was given
     * @return We return integers, 1 means it has special characters, -1 means it is already in the list, 0 means it is correct

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

    /**
     * Here is the Special Character checker, where we check if it contains special character
     * @param SkillName It is the name of the skill
     * @return it returns a boolean true, or false, based on regex

    private boolean SkillCatcher(String SkillName){
        Pattern p = Pattern.compile(
                "[^a-z]", Pattern.CASE_INSENSITIVE);
        Matcher m = p.matcher(SkillName);
        return m.find();
    }

    /**
     * It checks if it is already in the list
     * @param SkillName name of the job
     * @return returns a boolean true or false based on if it is already in the list or not.

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
    */

}

