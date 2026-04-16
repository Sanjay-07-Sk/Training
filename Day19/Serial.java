package Day19;
import java.io.*;
class Student implements Serializable{ 
    String name;
    int mark;
    public Student(String name,int mark){
        this.name=name;
        this.mark=mark;
    }
}
class CustomObjectOutputStream extends ObjectOutputStream{
    CustomObjectOutputStream(ObjectOutputStream objStream) throws IOException {
        super(objStream);
    }
    @Override
    protected void writeStreamHeader() throws IOException {
        // Do not write a header
    }
}
public class Serial {
    public static void main(String[] args) throws IOException {
        Student s=new Student("Saai",93);
        File file=new File("Day19/student.txt");
        FileOutputStream fo=new FileOutputStream(file,true);//connect file
        ObjectOutputStream objStream;
        if(file.length()==0){
            objStream=new ObjectOutputStream(fo);//first time serializating
        }
        else{
            objStream=new CustomObjectOutputStream(new ObjectOutputStream(fo));//appending to the existing serialized file
        }
        objStream.writeObject(s);//writing on file
        objStream.close();
        fo.close();
    }
}
