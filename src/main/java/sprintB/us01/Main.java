package sprintB.us01;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        /**
        Collaborator Geza = new Collaborator("Geza","1232225@isep.ipp.pt", "06481191191", new Date(), new Date(), "address", "1", "id","1");
        HumanResourceManager Geza2 = new HumanResourceManager("Geza", "1232225@isep.ipp.pt", "0681191191");
        Geza2.registerSkill();
        Geza2.registerSkill();

        Organization Telekom = new Organization("Telekom", "189161", "telekom.com", "1918961", "telekom@gmail.com");
        Telekom.addCollaborators(Geza);
        System.out.println("Organization: " + Telekom.getName());
        System.out.println("Collaborators:");
        for (Collaborator collaborator : Telekom.getCollaborators()) {
            System.out.println("- " + collaborator.getName() + " (" + collaborator.getEmail() + ")");
            System.out.println("  Skills:");
            for (Skill skill : collaborator.getSkills()) {
                System.out.println("  - " + skill.getName());
            }
        }
        System.out.println("HumanResourceManager");
        System.out.println("- " + Geza2.getName() + " (" + Geza2.getEmail() + ")");
        System.out.println("possible  Skills:");
        for (Skill skill : Geza2.getpossibleSkills()) {
            System.out.println("  - " + skill.getName());
        }



        // us02 (copied from another main)
        HumanResourceManager HRM1 = new HumanResourceManager("HR Manager 1", "hr1@example.com", "+123456789");
        HRM1.registerJob();
        HRM1.registerJob();

        Telekom = new Organization("Telekom", "123456789", "www.telekom.com", "19489494", "telekom@gmail.com");
        Telekom.addHumanResourceManager(HRM1);

        System.out.println("Organization: " + Telekom.getName());
        System.out.println("Human Resource Managers:");
        for (HumanResourceManager HRM : Telekom.getHumanResourceManager()) {
            System.out.println("- " + HRM.getName() + " (" + HRM.getEmail() + ")");
            System.out.println("  Jobs created:");
            for (Job job : HRM.getJobs()) {
                System.out.println("  - " + job.getName());
                Telekom.addJob(job); // Adding jobs created by Human Resource Managers to Organization's job list
            }
        }

        System.out.println("Organization's Jobs:");
        for (Job job : Telekom.getJobs()) {
            System.out.println("- " + job.getName());
        }

        */
        // us03
        HumanResourceManager HRMJeremias = new HumanResourceManager("Jeremias", "1232233@isep.ipp.pt", "004915733740494");
        HRMJeremias.registerCollaborator();

        // us04
        Collaborator Jeremias = new Collaborator("Jeremias","1232233@isep.ipp.pt", "004915733740494", new Date(), new Date(), "address", "1", "id","1");
        HRMJeremias.registerSkill();
        HRMJeremias.registerSkill();

        System.out.println("HumanResourceManager");
        System.out.println("- " + HRMJeremias.getName() + " (" + HRMJeremias.getEmail() + ")");
        System.out.println("possible  Skills:");
        for (Skill skill : HRMJeremias.getpossibleSkills()) {
            System.out.println("  - " + skill.getName());
        }
        HRMJeremias.assignSkillToCollaborator();


        // us05
        HRMJeremias.createTeam();

    }

}
