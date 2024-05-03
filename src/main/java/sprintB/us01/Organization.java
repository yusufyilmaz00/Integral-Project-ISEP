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

    public Organization(String name, String vatNumber, String website, String phoneNumber, String email) {
        this.name = name;
        this.vatNumber = vatNumber;
        this.website = website;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.collaborators = new ArrayList<>();
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
}