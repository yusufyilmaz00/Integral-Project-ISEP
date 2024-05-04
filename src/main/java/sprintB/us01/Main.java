package sprintB.us01;

public class Main {
    public static void main(String[] args) {

        Collaborator Geza = new Collaborator("Geza","1232225@isep.ipp.pt", "06481191191");
        Geza.registerSkill();
        Geza.registerSkill();

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
    }
}
