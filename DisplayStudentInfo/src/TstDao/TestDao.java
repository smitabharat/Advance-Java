package TstDao;

import com.bean.com.Student;

import Dao.StudentInfo;

public class TestDao 
{

	public static void main (String args[])
	{
		StudentInfo st=new StudentInfo();
		Student stud=st.getStudentById(1);
		System.out.println(stud);
		
	}
}
