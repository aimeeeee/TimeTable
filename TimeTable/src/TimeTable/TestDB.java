package TimeTable;

import java.sql.ResultSet;

public class TestDB {

	public static void main(String[] args) {
		DBConnection DBC = new DBConnection();
		ResultSet rs = DBC.queryExecute("select * from course where idcourse = ? ", "1" );
		try{
			while(rs.next()){
				System.out.println(rs.getInt("idcourse")+""+ rs.getString("NAME") + "" +rs.getString("LEVEL")+""+rs.getString("STREM")+"");
				
		}
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
