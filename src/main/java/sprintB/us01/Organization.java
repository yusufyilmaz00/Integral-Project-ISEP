package sprintB.us01;

import java.util.ArrayList;
import java.util.List;

public class Organization {
    private String name;
    private String vatNumber;
    private String website;
    private String phoneNumber;
    private String email;
    private List<Collaborator> collaborators;

    // us02 (copied from another class
    private List<HumanResourceManager> HRM;
    private List<Job> jobs;

    public Organization(String name, String vatNumber, String website, String phoneNumber, String email) {
        this.name = name;
        this.vatNumber = vatNumber;
        this.website = website;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.collaborators = new ArrayList<>();
        this.HRM = new ArrayList<>();
        this.jobs = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public String getVatNumber() {
        return vatNumber;
    }

    public String getWebsite() {
        return website;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setVatNumber(String vatNumber) {
        this.vatNumber = vatNumber;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void addCollaborators(Collaborator collaborator) {
        collaborators.add(collaborator);
    }

    public List<Collaborator> getCollaborators(){
        return collaborators;
    }

    public void addHumanResourceManager(HumanResourceManager HRMNew) {
        HRM.add(HRMNew);
    }

    /**
     * We can list who are the HRMs of the Org.
     * @return - Retunr a list of the HRMs.
     */
    public List<HumanResourceManager> getHumanResourceManager(){
        return HRM;
    }

    /**
     * We can add a job that is owned by this org.
     * @param job - Name of the job
     */
    public void addJob(Job job){
        jobs.add(job);
    }

    /**
     * It gives back us the jobs that this company owns.
     * @return - Returns a list of jobs
     */
    public List<Job> getJobs(){
        return jobs;
    }

}