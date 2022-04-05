package implementProject_Complete.service;

import java.util.Map;

import implementProject_Complete.domain.Product;
import implementProject_Complete.shared.AbstractCRUD;

public interface ProductService extends AbstractCRUD<Product>{
	public Map<Integer, Product> readAllMap();
}
