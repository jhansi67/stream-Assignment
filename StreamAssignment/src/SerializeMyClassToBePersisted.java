import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializeMyClassToBePersisted {
	
	public static void main(String[] args) {
		
		School s=new School("A.P.R School",2007);
		
		MyClassToBePersisted persist=new MyClassToBePersisted("jhansi", 25, "cooking", s);
		String filename = "file.ser";
		
		try {
			FileOutputStream fos=new FileOutputStream(filename);
			ObjectOutputStream oos=new ObjectOutputStream(fos);
			
			oos.writeObject(persist);
			
			fos.close();
			oos.close();
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	}

}
