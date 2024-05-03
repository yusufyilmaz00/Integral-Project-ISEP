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

    public void addHumanResourceManager(HumanResourceManager HRMNew) {
        HRM.add(HRMNew);
    }

    public List<HumanResourceManager> getHumanResourceManager(){
        return HRM;
    }

    public void addJob(Job job){
        jobs.add(job);
    }

    public List<Job> getJobs(){
        return jobs;
    }
}