package Day18;
import java.io.File;
import java.io.IOException;

public class FileEx2 {
    public static void main(String[] args) {
        try{
            File newFile=new File("Day18/test.txt");
            if (newFile.createNewFile()) {
                System.out.println("File created:"+newFile.getName());
            } else {
                System.out.println("File already exists");
            }
        }
        catch(IOException e){
            System.out.println(e.getMessage());
        }
    }
}
