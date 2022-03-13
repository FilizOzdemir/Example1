package examples;

public class CourseManager {

	public void add(Course course) {
		System.out.println(course.getName()+ " eklendi");
	}
	
	public Course[] getAll() {
		Course course1= new Course(1,1,"Java",1,1,"Başlangıç");
		Course course2 = new Course(1,1,"C#",1,1,"Başlangıç");
		Course[] courses = {course1,course2};
		return courses;
	}
}
