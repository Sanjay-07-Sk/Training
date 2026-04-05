package JobPortalSystem.model;

public class Company extends User{
    public Company(int id,String name,String email){
        super(id,name,email);
    }
    @Override
    public void show(){
        System.out.println("Company Dashboard");
    }
    public void postJob(Job job){
        System.out.println("Job Posted:"+job.getJob());
    }   
}
