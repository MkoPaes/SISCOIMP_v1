package storage;

import java.io.Serializable;

public interface Storeable extends Serializable{
    default public String getFileID(){
        return null;
    }
}
