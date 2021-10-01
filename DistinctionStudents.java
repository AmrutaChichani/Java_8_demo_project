
package ProblemStatement2508;

import java.util.*;

class Student{
    private Long id;
    private String name;
    private double percentage;
    private String dept;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPercentage() {
        return percentage;
    }

    public void setPercentage(double percentage) {
        this.percentage = percentage;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }
    @Override
    public String toString()
    {
    	return ("Id : "+this.id+" Name : "+this.name+" dept: "+this.dept+" Percentage: "+this.percentage+"\n");
    	
    }
 
    
}


public class DistinctionStudents {

	public static Student addStudent(long s_id, String s_name, double s_per, String s_dept )
	{
		Student st=new Student();
		
		st.setId(s_id);
		st.setName(s_name);
		st.setDept(s_dept);
		st.setPercentage(s_per);
		return st;
		
	}
	
	public static void main(String[] args) {
		List<Student> studentList= new ArrayList<Student>();
		studentList.add(addStudent(1,"Rajesh",79.0,"MCA"));
		studentList.add(addStudent(2,"Gauresh",85.0,"MBA"));
		studentList.add(addStudent(3,"Nirmal",59.0,"MCA"));
		studentList.add(addStudent(4,"Ashish",69.0,"MBA"));
		studentList.add(addStudent(5,"Bhavesh",75.0,"MBA"));
		
		studentList.stream().filter(s->s.getPercentage()>75.0)
				.forEach(s->System.out.println(s.getName()));		
				
	
	}

}
