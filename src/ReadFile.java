import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile {
    public static void main(String[] args) throws IOException {
        File file=new File("/home/knoldus/IdeaProjects/LambdaAssignment2/src/demoFile.txt");
        BufferedReader bufferedReader=new BufferedReader(new FileReader(file));
        String st;
        while ((st = bufferedReader.readLine()) != null)
            System.out.println(WordsCount.frequency(st));
    }
}
