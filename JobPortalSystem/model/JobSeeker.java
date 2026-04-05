package JobPortalSystem.model;

public class JobSeeker extends User{
    int id;
    String name;
    String email;
    public JobSeeker(int id,String name,String email){
        super(id, name, email);
    }
    @Override
    public void show(){
        System.out.println("Job Seeker Dashboard");
    }
    public void applyJob(Job job){
        System.out.println(getName()+" applied for "+job.getJob());
    }
}
