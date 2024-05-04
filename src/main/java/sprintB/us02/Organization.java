package sprintB.us02;

import sprintB.us01.Collaborator;

import java.util.ArrayList;
import java.util.List;

public class Organization {
    private String name;
    private String vatNumber;
    private String website;
    private String phoneNumber;
    private String email;
    private List<HumanResourceManager> HRM;
    private List<Job> jobs;

    public Organization(String name, String vatNumber, String website, String phoneNumber, String email) {
        this.name = name;
        this.vatNumber = vatNumber;
        this.website = website;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.HRM = new ArrayList<>();
        this.jobs = new ArrayList<>();
    }

    /**
     * Get the name of the Org.
     * @return gives us the name
     */
    public String getName() {
        return name;
    }

    /**
     * Get the vat number of the Org.
     * @return gives us the vat number
     */
    public String getVatNumber() {
        return vatNumber;
    }

    /**
     * get the website of the Org.
     * @return gives us the website of the org.
     */
    public String getWebsite() {
        return website;
    }

    /**
     * get the phone number of the Org.
     * @return gives us the phone number of the org.
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * get the email of the Org.
     * @return gives us the email of the org.
     */
    public String getEmail() {
        return email;
    }

    /**
     * We can change the name of the org.
     * @param name - what we want to change it to.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Change the vat number of th eOrg.
     * @param vatNumber - what we want to change it to.
     */
    public void setVatNumber(String vatNumber) {
        this.vatNumber = vatNumber;
    }

    /**
     * Change the website of the org.
     * @param website - What we want to change it to.
     */
    public void setWebsite(String website) {
        this.website = website;
    }

    /**
     * Change the phone number of the Org.
     * @param phoneNumber - What we want to change it to
     */
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    /**
     * Change the phone number of the Org.
     * @param email - What we want to change it for.
     */

    /**
     * Change the Org email.
     * @param email - What we want to change it to.
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * We can assign an Resource manager to this company
     * @param HRMNew - The details of the HRM
     */
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