package JobPortalSystem.model;

abstract class User {
    private String name;
    private int id;
    private String email;
    public User(int id,String name,String email){
        this.id=id;
        this.name=name;
        this.email=email;
    }
    public String getName(){
        return name;
    }
    public abstract void show();
}
