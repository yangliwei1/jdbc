import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;


public class Cha {
	public static void main(String[] args){
		 /**
		  *第二步 
		  * 加载jdbc驱动器
		  */
		 try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("加载成功");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("加载失败");
			e.printStackTrace();
		}
		 /**
		  *第三步
		  * 连接jdbc驱动器
		  */
		 try {
			Connection con= (Connection) DriverManager.getConnection
					 ("jdbc:mysql://127.0.0.1:3306/studb","root","admin");
			System.out.println("创建加载成功");
			//第四步
			Statement sta=(Statement) con.createStatement();			
			ResultSet rs=sta.executeQuery("select * from studentinfo;");
			while(rs.next()){
				String stuid= rs.getString("stuid");
				String stuname= rs.getString("stuname");
				int age= rs.getInt("age");
				System.out.println(stuid+stuname +age);
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("创建加载失败");
			e.printStackTrace();
		}
		 
	 }
}
