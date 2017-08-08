package TimeTable;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Map;

import com.mysql.jdbc.ResultSetMetaData;

public class SelectCourse extends Tinterface{
	
	public ArrayList<String> matchLevel(String level) {
		
<<<<<<< HEAD
    ArrayList courseList = new ArrayList();	
    
	DBConnection DBC = new DBConnection();
	ResultSet rs = DBC.queryExecute("select NAME from course where LEVEL = ? ", level);
	
		try {
			
		while (rs.next()) {//数据集不为空
			courseList.add(rs.getObject(1));		
			}
		
		System.out.println(courseList);
		
		}
		catch (Exception e) {  
            // TODO: handle exception  
            e.printStackTrace();  
      }  
=======
    ArrayList<String> courseList = new ArrayList();	
    
	DBConnection DBC = new DBConnection();
	ResultSet rs = DBC.queryExecute("select NAME from course where LEVEL = ? ", level);
	
		try {
			
		while (rs.next()) {//数据集不为空
			courseList.add((String) rs.getObject(1));		

			}

		
		System.out.println(courseList);
		
		}
		catch (Exception e) {  
            e.printStackTrace();  
      }  

//		String[] stringArray = courseList.toArray(new String[0]);
//		return stringArray;

>>>>>>> refs/remotes/origin/master
		return courseList;
		
	}
	
	
}
