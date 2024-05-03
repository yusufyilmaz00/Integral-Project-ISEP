package sprintB.us02;

public class Main {
    public static void main(String[] args) {
        HumanResourceManager HRM1 = new HumanResourceManager("HR Manager 1", "hr1@example.com", "+123456789");
        HRM1.createJobs("Python Programmer");

        HumanResourceManager HRM2 = new HumanResourceManager("HR Manager 2", "hr2@example.com", "+987654321");
        HRM2.createJobs("Machine Learning Programmer");

        Organization Telekom = new Organization("Telekom", "123456789", "www.telekom.com", "19489494", "telekom@gmail.com");
        Telekom.addHumanResourceManager(HRM1);
        Telekom.addHumanResourceManager(HRM2);

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
    }
}
