package model;

import Implementors.ProductImplementor;

public class Product_pojo {

	private String pname;
	private int pprice;

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public int getPprice() {
		return pprice;
	}

	public void setPprice(int pprice) {
		this.pprice = pprice;
	}

	public void addProduct(Product_pojo pojo) {
		new ProductImplementor().add(pojo);

	}

	public void updateProduct(Product_pojo pojo) {
		new ProductImplementor().update(pojo);

	}

	public void deleteProduct(Product_pojo pojo) {
		new ProductImplementor().delete(pojo);

	}
	

}
