package Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.bean.com.Student;

public class StudentInfo {

	private String DB_URL = "jdbc:mysql://localhost:3306/db";
	private String USERNAME = "root";
	private String PASSWORD = "root";

	public Student  getStudentById(int id) {
		Student st = new Student();
		try {
			String query = "SELECT * FROM studinfo where id=?";
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection(DB_URL, USERNAME, PASSWORD);
			PreparedStatement pst = con.prepareStatement(query);
			pst.setInt(1, id);
			ResultSet rs = pst.executeQuery();
			System.out.println("success");
			while (rs.next()) {
				st.setId(rs.getInt("id"));
				st.setName(rs.getString("name"));
				st.setAddress(rs.getString("address"));
			}
			System.out.println("match");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return st;

	}
}