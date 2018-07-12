import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class DeserializeMyClassToBePersisted {
	
	public static void main(String[] args) {
		
		
		MyClassToBePersisted persist=null;
		String filename = "file.ser";
		
		try {
			// Reading the object from a file
            FileInputStream file = new FileInputStream(filename);
            ObjectInputStream in = new ObjectInputStream(file);
             
            // Method for deserialization of object
            persist = (MyClassToBePersisted)in.readObject();
             
            in.close();
            file.close();
            
            System.out.println("Object has been deserialized ");
            System.out.println(persist.age);
            System.out.println(persist.name);
            System.out.println(persist.hobby);
           System.out.println(persist.field.nameOfSchool);
           System.out.println(persist.field.yearStarted);
           
            
            
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
