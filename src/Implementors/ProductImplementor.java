package Implementors;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import db_config.GetConnection;
import model.Product_pojo;
import operations.Product_Operations;

public class ProductImplementor implements Product_Operations {

	@Override
	public void add(Product_pojo pojo) {
		PreparedStatement preparedStatement;
		try {
			preparedStatement = GetConnection.getConnection().prepareStatement("insert into product values(?,?)");
			preparedStatement.setString(1, pojo.getPname());
			preparedStatement.setInt(2, pojo.getPprice());
			preparedStatement.executeUpdate();
			GetConnection.getConnection().close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Override
	public void update(Product_pojo pojo) {
		PreparedStatement preparedStatement;
		try {
			preparedStatement = GetConnection.getConnection()
					.prepareStatement("update product set pprice =? where pname=?");
			preparedStatement.setInt(1, pojo.getPprice());
			preparedStatement.setString(2, pojo.getPname());
			preparedStatement.executeUpdate();
			GetConnection.getConnection().close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Override
	public void delete(Product_pojo pojo) {
		PreparedStatement preparedStatement;
		try {
			preparedStatement = GetConnection.getConnection().prepareStatement("delete from product where pname=?");
			preparedStatement.setString(1, pojo.getPname());
			preparedStatement.executeUpdate();
			GetConnection.getConnection().close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Override
	public void show() {
		// TODO Auto-generated method stub

	}

}
