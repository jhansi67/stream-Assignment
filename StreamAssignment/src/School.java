
public class School implements java.io.Serializable{
	public String nameOfSchool;
	public  transient int yearStarted;
	
	public School(String nameOfSchool, int yearStarted) {
		super();
		this.nameOfSchool = nameOfSchool;
		this.yearStarted = yearStarted;
	}
	
	
}
