package examples;

public class Main {

	public static void main(String[] args) {
		 Instructor instructor = new Instructor(1,"Engin","Demiroð");//id,firstname,lastname
		// Üstte ki kýsým gibi veri eklemenin bir diðer yolu ise set olarak eklemektir.
		 /*
		 instructor.setId(1);
		 instructor.setFirsName("Engin");
		 instructor.setLastName("Demiroð");
		 */
		 Instructor[] instructors = {instructor};
		 
		 Course course = new Course(1,1,"Java",1,100,"Baþlangýç");//id,categoryid,name,instructorid,price,description
		 // Üstte ki kýsým gibi veri eklemenin bir diðer yolu ise set olarak eklemektir.
		 /*
		 course.setId(1);
		 course.setCategoryId(1);
		 course.setName("java");
		 course.setInstructorId(1);
		 course.setPrice(100);
		 course.setDescription("Baþlangýç");
		 */
		 Course[] courses= {course};
		 
		 //verileri getirme...
		 
		 //Eðitmen verisi:
		 for (Instructor instructor1 : instructors) {
			System.out.println(instructor.getId()+" / "+instructor.getFirsName() + " / "+instructor.getLastName());
		}
		 
		 //Kurs verisi:
		 for (Course course1 : courses) {
			System.out.println(course.getId()+" / "+course.getCategoryId() +" / "+course.getName()+" / "+course.getInstructorId()+" / "+course.getPrice()+" / "+course.getDescription());
		}
		 		

	}

}
