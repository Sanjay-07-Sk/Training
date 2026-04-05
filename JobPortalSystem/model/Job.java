package JobPortalSystem.model;

public class Job {
    private int jobid;
    private String job;
    private String desig;
    public Job(int jobid,String job,String desig){
        if(job==null ||job.isEmpty()){
            throw new IllegalArgumentException("Invalid Job Title");
        }
        this.jobid=jobid;
        this.job=job;
        this.desig=desig;
    }    
    public String getJob(){
        return job;
    }
}
