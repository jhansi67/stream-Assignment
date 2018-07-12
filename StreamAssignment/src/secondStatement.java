import java.io.File;
import java.nio.file.Files;
import java.util.LinkedList;
import java.util.stream.Collectors;

public class secondStatement {

	
	public static void main(String[] args) {
		try {
			
			Files.lines(new File("test.txt").toPath()) 
			.collect(Collectors.toCollection(LinkedList::new)).descendingIterator()
			.forEachRemaining(System.out::println);


		} catch (Exception e) {

				e.printStackTrace();
			}
		
		
		
		
	}
}
