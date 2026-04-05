package JobPortalSystem.services;
import JobPortalSystem.model.*;
import java.util.ArrayList;

public class JobPortal {
    private ArrayList<Job> jobs=new ArrayList<>();
    public void addJob(Job job){
        jobs.add(job);
    }
    public void showJobs(){
        for(Job j:jobs){
            System.out.println(j.getJob());
        }
    }
}
