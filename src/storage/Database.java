package storage;

import java.io.*;

/**
 * Database class. Used to store and load classes to disk.
 */
public class Database{

    private String savePath = "";

    ///Singleton Pattern
    private static Database instance;

    private Database() {}

    public static synchronized Database getInstance(){
        if (instance == null){
            instance = new Database();
        }

        return instance;
    }

    /**
    * Save an Object in the file "fileName".
    * Return true on success, or false on error.
    */
    public boolean writeObjToFile(Serializable obj, String fileName){
        try {
            /// Serializing 'obj'
            FileOutputStream fileOut = new FileOutputStream(savePath+"/"+fileName);
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
    public <T extends Serializable> T readObjFromFile(T obj, String fileName){
        
        try {
            /// De-serializing 'obj'
            FileInputStream fileIn = new FileInputStream(savePath+"/"+fileName);
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
    * Save an Object in a file named = obj.getID().
    * Return true on success, or false on error.
    */
    public boolean writeObjToFile(Storeable obj){
        if(obj.getID() != null) return writeObjToFile(obj, obj.getID());
        return false;
    }

    /**
     * Load Object from file named = obj.getID().
     * Return the object readed from file on success.
     * Return null on error.
     */
    public <T extends Storeable> T readObjFromFile(T obj){
        if (obj.getID() != null) return readObjFromFile(obj, obj.getID());
        return null;
    }
}