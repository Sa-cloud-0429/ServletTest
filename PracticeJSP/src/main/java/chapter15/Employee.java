package chapter15;/////bean//情報を入れるための箱//

public class Employee implements java.io.Serializable {
	private int id;
	private String name;
	private int age;

	public Employee() {
	}

	public Employee(int id, String name, int age) {
		this.id = id;
		this.name = name;
		this.age = age;

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}