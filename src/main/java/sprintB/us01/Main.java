package sprintB.us01;

public class Main {
    public static void main(String[] args) {

        Skill Python = new Skill("Python");
        Skill Docker = new Skill("VBA");
        Skill SQL = new Skill("SQL");
        Skill Java = new Skill("Java");

        Collaborator Geza = new Collaborator("Geza","1232225@isep.ipp.pt", "06481191191");
        Geza.addSkill(Python);
        Geza.addSkill(SQL);

        Collaborator Bela = new Collaborator("Bela", "bela@gmail.com", "11861616");
        Bela.addSkill(Docker);

        Collaborator Pista = new Collaborator("Pista", "pista@gmail.com", "181106161");

        Organization Telekom = new Organization("Telekom", "189161", "telekom.com", "1918961", "telekom@gmail.com");
        Telekom.addCollaborators(Geza);
        Telekom.addCollaborators(Pista);

        Organization MSI = new Organization("MSI", "1891918", "msi.com", "189189131", "msi@gmail.com");
        MSI.addCollaborators(Bela);
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
