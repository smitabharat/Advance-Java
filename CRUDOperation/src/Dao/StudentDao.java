package Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.hef.com.Student;

public class StudentDao 
{
	public static Connection getConnection()
	{
		Connection con=null;
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/db","root","root");
		}
		catch(Exception e)
		{
		System.out.println(e);
	}
		return con;
	
	
	}
	public static int save(Student s)
	{
		int status=0;
		try {
			Connection con=StudentDao.getConnection();
			PreparedStatement ps=con.prepareStatement("insert into user(subjectname,marks)values(?,?)");
			ps.setString(1, s.getSubjectname());
			ps.setInt(2, s.getMarks());
			
			status=ps.executeUpdate();
			con.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return status;
		
	}
	
	public static int update(Student s)
	{
		int status=0;
		try
		{
			Connection con=StudentDao.getConnection();
			PreparedStatement ps=con.prepareStatement("update user set subjectname=?,marks=?");
			ps.setString(1, s.getSubjectname());
			ps.setInt(2, s.getMarks());
			ps.setInt(3, s.getId());
			
			status=ps.executeUpdate();
			con.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return status;
	}
	
	public static int delete(int id)
	{
		int status=0;
		try
		{
			Connection con=StudentDao.getConnection();
			PreparedStatement ps=con.prepareStatement("delete fron user where subjectname=?,marks=?");
			ps.setInt(1, id);
			
			status=ps.executeUpdate();
			con.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return status;
	}
	public static Student getStudentById(int id)
	{
		Student st=new Student();
		try
		{
			Connection con=StudentDao.getConnection();
			PreparedStatement ps=con.prepareStatement("select * from user");
			ps.setInt(1, id);
			ResultSet rs=ps.executeQuery();
			if(rs.next())
			{
				st.setId(rs.getInt(1));
				st.setSubjectname(rs.getString(2));
				st.getMarks();
			}
			con.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return st;
	}
	public static List<Student>getAllSubjects()
	{
		List<Student>list=new ArrayList<Student>();
		try
		{
			Connection con=StudentDao.getConnection();
			PreparedStatement ps=con.prepareStatement("select * from user");
	
			ResultSet rs=ps.executeQuery();
			while(rs.next())
			{
				Student s=new Student();
				s.setId(rs.getInt(1));
				s.setSubjectname(rs.getString(2));
				s.setMarks(3);
				list.add(s);
			}
			con.close();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		return list;
	}

}
