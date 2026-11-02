package operations;

import model.Product_pojo;

public interface Product_Operations {

	void add(Product_pojo pojo);

	void update(Product_pojo pojo);

	void delete(Product_pojo pojo);

	void show();
}
