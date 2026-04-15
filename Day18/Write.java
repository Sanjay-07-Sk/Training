package Day18;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;
public class Write {
    public static void main(String[] args) {
        try{
            BufferedWriter writer=new BufferedWriter(new FileWriter("Day18/test.txt"));
            writer.write("Written using file writer");
            writer.newLine();
            writer.write("Written using file writer2");
            writer.newLine();
            writer.write("Written using file writer3");
            writer.close();
        }
        catch(IOException e){
            System.out.println(e);
        }
    }
}
