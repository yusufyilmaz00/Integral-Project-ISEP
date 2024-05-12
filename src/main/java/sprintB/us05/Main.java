package sprintB.us05;

import sprintB.us01.HumanResourceManager;
import sprintB.us01.Job;
import sprintB.us02.Organization;

public class Main {
    public static void main(String[] args) {
        HumanResourceManager HRM1 = new HumanResourceManager("HR Manager 1", "hr1@example.com", "+123456789");
        HRM1.registerJob();
        HRM1.registerJob();

        Organization Telekom = new Organization("Telekom", "123456789", "www.telekom.com", "19489494", "telekom@gmail.com");
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
    }
}
