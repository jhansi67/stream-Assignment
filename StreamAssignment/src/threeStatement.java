import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class threeStatement {
	public static void main(String[] args) {
		
		try {
			List<String> longestWords =
				    Files.lines(Paths.get("test.txt"))
				         .collect(Collectors.groupingBy(String::length))
				         .entrySet()
				         .stream()
				         .max(Map.Entry.comparingByKey())
				         .map(Map.Entry::getValue)
				         .orElse(null);
			System.out.println(longestWords);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
