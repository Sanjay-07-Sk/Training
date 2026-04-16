package Day19;

import java.io.FileInputStream;

public class Deserial {
    public static void main(String[] args) {
        FileInputStream fi=new FileInputStream("Day19/student.txt");
        ObjectInputStream objStream=new ObjectInputStream(fi);
        while(true){
            try{
                Student s=(Student)objStream.readObject();
                System.out.println("Name: "+s.name+" Mark: "+s.mark);
            }
            catch(EOFException e){
                break;
            }
        }
        objStream.close();
        fi.close();
    }
}
