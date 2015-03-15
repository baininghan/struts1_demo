package mystruts.model;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

import javax.naming.NamingException;

import mystruts.actionForm.ProductForm;
import util.Struts;

public class SearchProduct extends Struts {

	private ProductForm form;
	
	public SearchProduct(ProductForm form) throws NamingException, SQLException {
		super();
		this.form = form;
	}

	/**
	 * 查询产品信息，并通过List返回查询结果
	 * @return
	 */
	public List<String[]> search() {
		List<String[]> result = new LinkedList<String[]>();
		String sql = "select * from t_products where product_name like %"+form.getProductName()+"%";
		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while(rs.next()){
				String[] row = new String[3];
				row[0] = rs.getString(1);
				row[1] = rs.getString(2);
				row[2] = rs.getString(3);
				result.add(row);
			}
			rs.close();
			ps.close();
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return result;
	}
}
