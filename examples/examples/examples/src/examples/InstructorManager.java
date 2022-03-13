package examples;

public class InstructorManager {

	public void add(Instructor instructor) {
		System.out.println(instructor.getFirsName()+instructor.getLastName()+ " eklendi");
	}
	public Instructor[] getAll() {
		Instructor instructor1= new Instructor(1,"Engin","Demiroð");//id,firstname,lastname
		Instructor instructor2= new Instructor(2,"aaaa","bbbb");
		Instructor[] instructors= {instructor1,instructor2};
		return instructors;
	}
}
