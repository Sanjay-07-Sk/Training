package Day18;
import java.io.File;
import java.io.IOException;
public class FileEx {
    public static void main(String[] args) throws IOException {
        File newFile=new File("Day18/test.txt");
        if (newFile.createNewFile()) {
            System.out.println("File created:"+newFile.getName());
        } else {
            System.out.println("File already exists");
        }
    }
}
