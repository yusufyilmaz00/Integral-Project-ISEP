package sprintB.us01;

import java.util.ArrayList;
import java.util.List;

public class Collaborator {
    private String name;
    private String email;

    private String phone;
    private List<Skill> skills;

    public Collaborator(String name, String email, String phone) {
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.skills = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public void addSkill(Skill skill){
        skills.add(skill);
    }

    public List<Skill> getSkills(){
        return skills;
    }
}

