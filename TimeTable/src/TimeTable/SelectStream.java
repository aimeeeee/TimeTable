package TimeTable;

import java.sql.ResultSet;
import java.util.ArrayList;

public class SelectStream {

	public ArrayList<String> matchLevel(String course) {
		
		//get result from DB
		
	    ArrayList<String> streamList = new ArrayList();	
	    
		DBConnection DBC = new DBConnection();
		ResultSet rs = DBC.queryExecute("select * from course where NAME = ? ", course);
		
			try {
				
			while (rs.next()) {//数据集不为空
				
				for(int i = 4; i < 8; i++) {
				String s = rs.getString(i);
				
				if(s != null) {
					streamList.add(s);
			
				}
				}
			}
			System.out.println(streamList);
			
			}
			catch (Exception e) {  
	            // TODO: handle exception  
	            e.printStackTrace();  
	      }  
			return streamList;
			
		}
	
	
}
