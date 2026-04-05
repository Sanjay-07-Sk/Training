package JobPortalSystem.Main;
import JobPortalSystem.model.*;
import JobPortalSystem.services.*;
public class Main {
    public static void main(String[] args) {
        try{
            JobPortal portal=new JobPortal();
            Job job1=new Job(1,"Software Engineer","Java Developer");
            portal.addJob(job1);
            Job job2=new Job(2,"Game Developer","Tester");
            portal.addJob(job2);
            JobSeeker jobseeker=new JobSeeker(198,"Sanjay","sanjay07@gmail.com");
            Company company=new Company(200,"Infosys","hrinfo@gmail.com");
            company.postJob(job1);
            company.postJob(job2);
            jobseeker.applyJob(job1);
            jobseeker.applyJob(job2);
            portal.showJobs();
        }
        catch(IllegalArgumentException e){
            System.out.println("Error:"+e.getMessage());
        }
    }
}
