package examples;

public class Course {

	private int id;//kurs id
	private int categoryId;//kategori id
	private String name;//kurs ismi
	private int instructorId;//eðitmen id
	private double price;//kurs fiyatý
	private String description;//taným
	public Course() {

	}
	public Course(int id, int categoryId, String name, int instructorId, double price, String description) {
		
		this.id = id;
		this.categoryId = categoryId;
		this.name = name;
		this.instructorId = instructorId;
		this.price = price;
		this.description = description;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getInstructorId() {
		return instructorId;
	}
	public void setInstructorId(int instructorId) {
		this.instructorId = instructorId;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	
}
