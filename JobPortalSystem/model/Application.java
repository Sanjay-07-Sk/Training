package JobPortalSystem.model;

class Application {
    private JobSeeker jobseeker;
    private Job job;
    Application(JobSeeker jobseeker,Job job){
        this.jobseeker=jobseeker;
        this.job=job;
    }    
    public void showApplication(){
        System.out.println(jobseeker.getName()+" applied for "+job.getJob());
    }
}
