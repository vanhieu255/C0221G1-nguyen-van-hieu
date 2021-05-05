package commons;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class IdDocFile {
    public static final String PATH ="src/data/id.csv";
    public static List<String>  docFile(){
        File file = null;
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        String line = null;
        List<String> strings = new ArrayList<>();
        try {
            file = new File(PATH);
            fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);
            while ((line = bufferedReader.readLine()) != null) {
                strings.add(line);
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                bufferedReader.close();
                fileReader.close();

            } catch (IOException e) {
                e.printStackTrace();
            }
            return strings;
        }
    }
}
