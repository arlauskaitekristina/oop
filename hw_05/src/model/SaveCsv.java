package model;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class SaveCsv implements ISave {

    private File file = new File("Humans.csv");

    @Override
    public void saveAs(String human){
        try {
            FileWriter writer = new FileWriter(file, true);
            writer.write(human);
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public File getFile() {return file;
    }

    public void setFile(File file) {this.file = file;
    }
}