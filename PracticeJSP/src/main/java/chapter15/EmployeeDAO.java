package chapter15;///社員の情報を取ったり追加したり買えたりする場所///

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class EmployeeDAO extends DAO {///daoクラスを継承している///

	public List<Employee> findAll()throws Exception{
		List<Employee> list=new ArrayList<>();//空のリストを作成してここに社員のデータを入れていく//
		String sql ="select * from employees";//実行するSQLを書いている//
		try(Connection con=getConnection();//DAOからきていてデータベースとつながるコネクションを返す//
				PreparedStatement ps=con.prepareStatement(sql);//SQLを安全に実行するために準備するもの//
				ResultSet rs=ps.executeQuery()){////
			while(rs.next()) {
				list.add(new Employee(rs.getInt("id"),rs.getString("name"),rs.getInt("age")));
				
			}
		}
		return list;
	}
	
	public Employee findById(int id) throws Exception {
		String sql ="select * from employees WHERE id=?";
		try(Connection con= getConnection();
				PreparedStatement ps=con.prepareStatement(sql)){
				ps.setInt(1, id);
				try(ResultSet rs =ps.executeQuery()){
					if(rs.next()) {
						return new Employee(rs.getInt("id"),rs.getString("name"),rs.getInt("age"));
						
					}
				}
		}
	
	return null;
	
	}

	public boolean insert(Employee employee) throws Exception {
			String sql="INSERT INTO employees(name,age) VALUES(?,?)";
			try(Connection con = getConnection();
					PreparedStatement ps=con.prepareStatement(sql)){
				ps.setString(1, employee.getName());
				ps.setInt(2,employee.getAge());
				return ps.executeUpdate()>0;
				
			}
	}

	public boolean update(Employee employee) throws Exception {
		String sql="UPDATE employees SET name=?,age=? WHERE id=?";
		try(Connection con= getConnection();
				PreparedStatement ps=con.prepareStatement(sql)){
			ps.setString(1,employee.getName());
			ps.setInt(2,employee.getAge());
			ps.setInt(3, employee.getId());
			return ps.executeUpdate()>0;
		}
	}

	public boolean delete(int id) throws Exception {
		String sql="DELETE FROM employees WHERE id=?";
		try(Connection con = getConnection();
				PreparedStatement ps = con.prepareStatement(sql)){
			ps.setInt(1, id);
			return ps.executeUpdate()>0;
		}
	}
}
