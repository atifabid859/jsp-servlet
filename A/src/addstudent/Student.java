package addstudent;

import java.util.List;

import com.b.Integer;

public class Student {
	private int id;
	private String name;
	private List<java.lang.Integer> marks;
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
	public List<java.lang.Integer> getMarks() {
		return marks;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", marks=" + marks + "]";
	}
	public void setMarks(List<java.lang.Integer> marks2) {
		this.marks = marks2;
	}
	
	
	

	}


