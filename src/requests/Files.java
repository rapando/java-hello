package requests;

import java.io.FileWriter;
import java.io.IOException;

public class Files {
    public void saveToJSON(String data, String fileName) throws IOException {
        System.out.println("Saving response to JSON file => " + fileName);

        try (FileWriter file = new FileWriter(fileName)) {
            file.write(data);
            file.flush();
            System.out.println("Saved to " + fileName);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
