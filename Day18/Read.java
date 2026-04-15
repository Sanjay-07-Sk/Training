package Day18;
import java.io.FileReader;
import java.io.IOException;  
public class Read { 
    public static void main(String[] args) {
        try{
            FileReader fr=new FileReader("Day18/test.txt");
            int i;
            while((i=fr.read())!=-1){
                System.out.print((char)i);//casting int to char because read() returns an int value of the character read, and -1 indicates the end of the file.
            }
            fr.close();
        }
        catch(IOException e){
            System.out.println(e.getMessage());
        }
    }
}
