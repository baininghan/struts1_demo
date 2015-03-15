package mystruts.model;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.naming.NamingException;

import mystruts.actionForm.ProductForm;
import util.Struts;

public class Product extends Struts {

	private ProductForm form;
	
	public Product(ProductForm form) throws NamingException, SQLException {
		super();
		this.form = form;
		validate();
	}

	/**
	 * 验证客户端提交的数据
	 */
	public void validate() {
		
	}
	
	/**
	 * 将客户端提交的产品信息保存到t_products中
	 */
	public void save() {
		String productID = form.getProductID();
		String productName = form.getProductName();
		float price = form.getPrice();
		String sql = "insert into t_products values("+productID+","+productName+","+String.valueOf(price)+")";
		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.executeUpdate();
			ps.close();
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
}
