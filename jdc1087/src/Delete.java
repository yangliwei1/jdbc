import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;


public class Delete {
	public static void main(String[] args){
		 /**
		  *�ڶ��� 
		  * ����jdbc������
		  */
		 try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("���سɹ�");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("����ʧ��");
			e.printStackTrace();
		}
		 /**
		  *������
		  * ����jdbc������
		  */
		 try {
			Connection con= (Connection) DriverManager.getConnection
					 ("jdbc:mysql://127.0.0.1:3306/studb","root","admin");
			System.out.println("�������سɹ�");
			//���Ĳ�
			Statement sta=(Statement) con.createStatement();
			int n=sta.executeUpdate("delete from studentinfo where stuid=10004");
			System.out.println("ɾ��"+n+"��");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("��������ʧ��");
			e.printStackTrace();
		}
	}
}
