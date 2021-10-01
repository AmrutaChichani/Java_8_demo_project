package ProblemStatement2508;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.*;

public class GroupByDept {
	//enum Departments{MCA,MBA,ENGR};

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
		
		//adding students
		List<Student> studentList= new ArrayList<Student>();
		studentList.add(addStudent(1,"Rajesh",79.0,"MCA"));
		studentList.add(addStudent(2,"Gauresh",85.0,"MBA"));
		studentList.add(addStudent(3,"Nirmal",59.0,"MCA"));
		studentList.add(addStudent(4,"Ashish",69.0,"MBA"));
		studentList.add(addStudent(5,"Bhavesh",75.0,"MBA"));
		studentList.add(addStudent(6,"Prachi",55.0,"ENGR"));
		//grouping
		Map<String,List<Student>> deptSt=studentList.stream()
				.collect(Collectors.groupingBy(Student::getDept));
				
		deptSt.forEach((k,v)->{System.out.println(k+" "+v+"\n");});
	}

}
