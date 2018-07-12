import java.io.File;
import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

public class SortedDirList {

	File file;

	public SortedDirList(File file) {
		super();
		this.file = file;
	}

	public static void main(String[] args) {
		//list();
		//recursiveFind(Paths.get("."), System.out::println);
		recursiveFind(Paths.get("."), p -> { 
			  if (p.toFile().getName().toString().matches("[c]*")) {
			    System.out.println(p);
			  }
			});
		
		

	}

	public static void list() {
		try {
			
			Files.newDirectoryStream(Paths.get("."), path -> path.toFile().isFile())
	        .forEach(System.out::println);

		} catch (IOException e) {

			e.printStackTrace();
		}
		
		/*try {
			Files.newDirectoryStream(Paths.get("./src"),
			        path -> path.toString().endsWith(".java"))
			        .forEach(System.out::println);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		*/
		
		/*final String dir = ".";
		final File file = Paths.get(dir).toFile();
		File[] files = file.listFiles();
		Arrays.sort(files, (f1, f2) -> {
			if (f1.isDirectory() != f2.isDirectory()) {
				if (f1.isDirectory()) {
					return -1;
				} else {
					return 1;
				}
			} else {
				return f1.getName().toLowerCase().compareTo(f2.getName().toLowerCase());
			}
		});
		Stream.of(files).forEach(System.out::println);*/

	}

	public static void recursiveFind(Path path, Consumer<Path> c) {
		
		
		  try (DirectoryStream<Path> newDirectoryStream = Files.newDirectoryStream(path)) {
		    StreamSupport.stream(newDirectoryStream.spliterator(), false)
		                 .peek(p -> {
		                   c.accept(p);
		                   if (p.toFile()
		                        .isDirectory()) {
		                     recursiveFind(p, c);
		                   }
		                 })
		                 .collect(Collectors.toList());
		  } catch (IOException e) {
		    e.printStackTrace();
		  }
		}
}
