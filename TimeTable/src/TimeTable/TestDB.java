package TimeTable;

import java.sql.ResultSet;

public class TestDB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DBConnection DBC = new DBConnection();
		ResultSet rs = DBC.queryExecute("select * from products where PRODUCT_NAME = ? ", "Apple" );
		try{
			while(rs.next()){
				System.out.println(rs.getInt("Product_ID")+""+ rs.getString("Product_Name") + "" +rs.getInt("QTY")+""+rs.getDouble("price")+"");
				
		}
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
