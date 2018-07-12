import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.Arrays;
import java.util.List;

public class sixthStatement {

	public static void main(String[] args) {
		sixthStatement mof = new sixthStatement();
		String date = "21/05/1992";
		List<Customer> custlist = Arrays.asList(new Customer(12345L, "jhansi", "hyderabad", 25, date),
				new Customer(12346L, "reddy", "hyderabad", 26, date),
				new Customer(12345L, "vishnu", "bangalore", 28, date),
				new Customer(12345L, "gowtham", "tirupathi", 1, date));
		mof.storeObject(custlist);
		mof.displayObjects();

	}

	private void displayObjects() {
		InputStream fileIs = null;
		ObjectInputStream objIs = null;
		try {
			fileIs = new FileInputStream("customerFile.txt");
			objIs = new ObjectInputStream(fileIs);
			List<Customer> custlist = (List<Customer>) objIs.readObject();
			System.out.println(custlist.size());
			custlist.stream().filter(e->e.getCustomerAge()>=25 && e.getCustomerAddress().equals("hyderabad")).forEach(e->System.out.println(e));

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		} catch (ClassNotFoundException ex) {
			ex.printStackTrace();
		}

	}

	private void storeObject(List<Customer> list) {
		OutputStream ops = null;
		ObjectOutputStream objOps = null;
		try {
			ops = new FileOutputStream("customerFile.txt");
			objOps = new ObjectOutputStream(ops);
			objOps.writeObject(list);
			objOps.flush();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		}

	}
}
