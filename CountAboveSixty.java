package ProblemStatement2508;

import java.util.ArrayList;
import java.util.List;
//import java.util.stream.*;

public class CountAboveSixty {
	
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
		studentList.add(addStudent(5,"Bhavesh",45.0,"MBA"));
		
		long stCount=studentList.stream().filter(s->s.getPercentage()>60.0)
							.count();
		System.out.println(stCount+" Students scored more than 60% ");
		
		

	}

}
