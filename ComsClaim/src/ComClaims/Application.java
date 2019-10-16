package ComClaims;

public class Application 
{

	public static void main(String[] args) 
	{
		
	    Student student1 = new Student();
	    Student student2 = new Student("Steve", "Goldman");
	    
	    
	    System.out.println(student2 + " " + student2.getFirstName() + " " + student2.getLastName());
	    
	    student1.setFirstName("Steve");
	    System.out.println(student1.getFirstName());
	  
	    System.out.println(student2.getFirstName() + " " + student2.getLastName());
	    student1.setFirstName("Steve1");
	    student1.setLastName("Goldman1");
	    System.out.println(student1.getFirstName() + " " + student1.getLastName());
	}
	
	
}
