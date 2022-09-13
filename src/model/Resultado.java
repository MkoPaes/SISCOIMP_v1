package model;

import java.io.File;
import java.util.ArrayList;

public class Resultado {
    private ArrayList<File> uploads;
    
    public Resultado(){}

    public ArrayList<File> getUploads() {
        return uploads;
    }

    public void setUploads(ArrayList<File> uploads) {
        this.uploads = uploads;
    }
    
}
