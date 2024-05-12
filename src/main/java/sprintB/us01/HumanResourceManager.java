package sprintB.us01;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HumanResourceManager {
    private String name;
    private String email;

    private String phone;

    private List<Skill> possibleSkills;
    private List<Job> Jobs;

    private List<Collaborator> collaborators;



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
        this.possibleSkills = new ArrayList<>();
        this.Jobs = new ArrayList<>();
        this.collaborators = new ArrayList<>();
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

    public void addpossibleSkill(Skill skill){
        possibleSkills.add(skill);
    }

    /**
     * If we want to know what skills our collaborator can do, we can return it
     * @return returns the list of the skill that the collaborator can do
     */
    public List<Skill> getpossibleSkills(){
        return possibleSkills;
    }

    public void registerSkill() {
        boolean retry = true;
        System.out.println("What Skill would you like to have?");
        while (retry) {
            Scanner JobQuestion = new Scanner(System.in);
            String JobName = JobQuestion.nextLine();
            int returnNumber = checkSkill(JobName);
            if (returnNumber == 0) {
                this.addpossibleSkill(new Skill(JobName));
                retry = false;
            }
        }
    }

    /**
     * Here we test if the skill is appropiate by checking if it is already in the list or it has special character
     * @param SkillName It is a Skill Name that was given
     * @return We return integers, 1 means it has special characters, -1 means it is already in the list, 0 means it is correct
     */
    public int checkSkill(String SkillName){
        boolean res = SkillCatcher(SkillName);
        if (res) {
            System.out.println("Not a valid Skill name, please type again.");
            return 1;
        } else {
            boolean resCheck = CheckifSameSkill(SkillName);
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
     */
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
     */
    private boolean CheckifSameSkill(String SkillName){
        boolean exist = false;
        for (Skill skill : this.getpossibleSkills()) {
            if (skill.getName().equals(SkillName)) {
                exist = true;
                break;
            }
        }
        return exist;
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
            boolean resCheck = CheckifSameJob(JobName);
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
    private boolean CheckifSameJob(String JobName){
        boolean exist = false;
        for (Job job : this.getJobs()) {
            if (job.getName().equals(JobName)) {
                exist = true;
                break;
            }
        }
        return exist;
    }

    public void registerCollaborator () {
        boolean retry = true;
        System.out.println("Please write the requested data");
        System.out.println("Name:");
        Scanner data = new Scanner(System.in);
        String name = data.nextLine();
        System.out.println("birth date:");
        String[] list = data.nextLine().split("/");
        Date birthDate = new Date(Integer.parseInt(list[0]),Integer.parseInt(list[1]),Integer.parseInt(list[2]));
        System.out.println("admission date:");
        list = data.nextLine().split("/");
        Date admissionDate = new Date(Integer.parseInt(list[0]),Integer.parseInt(list[1]),Integer.parseInt(list[2]));
        System.out.println("address:");
        data = new Scanner(System.in);
        String address = data.nextLine();
        System.out.println("phone:");
        data = new Scanner(System.in);
        String phone = data.nextLine();
        System.out.println("email:");
        data = new Scanner(System.in);
        String email = data.nextLine();
        System.out.println("ID doc type");
        data = new Scanner(System.in);
        String IdDocType = data.nextLine();
        String taxpayerNumber = "";
        String IdNumber = "";

        while (retry) {
            System.out.println("taxpayer number:");
            data = new Scanner(System.in);
            taxpayerNumber = data.nextLine();
            if (verifyTaxpayerNumber(taxpayerNumber)) {
                retry = false;
            }
            else {
                System.out.println("invalid taxpayer number");
            }
        }
        retry = true;
        while (retry) {
            System.out.println("Id number:");
            data = new Scanner(System.in);
            IdNumber = data.nextLine();
            if (verifyIdNumber(IdNumber, IdDocType)) {
                retry = false;
            }
            else {
                System.out.println("invalid taxpayer number");
            }
        }

        collaborators.add(new Collaborator(name, email, phone, birthDate, admissionDate, address, taxpayerNumber, IdDocType, IdNumber));
    }

    private boolean verifyIdNumber(String number, String IdType) {
        if (IdType == "passport") {
           if (number.length() == 7) // not sure if thats the right length for portuguese passports, but I think so
               return true;
           else
               return false;
        } else if (IdType == "ID card") {
            if (number.length() == 8) // not sure if thats the right length for portuguese id cards, but I think so
                return true;
            else
                return false;
        }
        return false;
    }

    private boolean verifyTaxpayerNumber(String number) {
        if (number.length() == 9) // not sure if thats the right length for the portuguese tax number, but I think so
            return true;
        else
            return false;
    }



}

