package storage;

import java.io.*;

/**
 * Database class. Used to store and load classes to disk.
 */
public class Database{

    /**
    * Save an Object in the file "fileName".
    * Return true on success, or false on error.
    */
    public static boolean writeObjToFile(Serializable obj, String fileName){
        try {
            /// Serializing 'obj'
            FileOutputStream fileOut = new FileOutputStream(fileName);
            ObjectOutputStream objectOut = new ObjectOutputStream(fileOut);

            objectOut.writeObject(obj);
            objectOut.close();

            return true;
 
        } catch (Exception ex) {
            /// error
            ex.printStackTrace();
            return false;
        }
    }

    /**
     * Load Object from disk.
     * Return the object readed from file "fileName".
     * Return null on error.
     */
    public static <T extends Serializable> T readObjFromFile(T obj, String fileName){
        
        File f = new File(fileName);
        
        if(!f.exists()) return null;

        try {
            /// De-serializing 'obj'
            FileInputStream fileIn = new FileInputStream(fileName);
            ObjectInputStream objectIn = new ObjectInputStream(fileIn);
            
            /// down-casting object
            obj = (T) objectIn.readObject();
            objectIn.close();

            return obj;
        } catch (Exception ex) {
            /// error
            ex.printStackTrace();
            return null;
        }
    }

    /**
    * Save an Object in a file named = obj.getFileID().
    * Return true on success, or false on error.
    */
    public static boolean writeObjToFile(Storeable obj){
        if(obj.getFileID() != null) return writeObjToFile(obj, obj.getFileID());
        return false;
    }

    /**
     * Load Object from file named = obj.getFileID().
     * Return the object readed from file on success.
     * Return null on error.
     */
    public static <T extends Storeable> T readObjFromFile(T obj){
        if (obj.getFileID() != null) return readObjFromFile(obj, obj.getFileID());
        return null;
    }
}