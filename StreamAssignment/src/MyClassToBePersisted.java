
public class MyClassToBePersisted implements java.io.Serializable{
	
	public MyClassToBePersisted(String name, int age, String hobby, School field) {
		this.name = name;
		this.age = age;
		this.hobby = hobby;
		this.field = field;
	}

	public String name ;
	public  int age ;
	public String hobby; 
	public School field;

}
