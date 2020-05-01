package navpreet.cg.gla.spring.dao;

import java.util.List;

import arun.cg.gla.spring.entity.Product;
import arun.cg.gla.spring.entity.ProductOld;


public interface ProductDaoInterface {
	
	public boolean create(Product product);
	public List<Product> reterivev1();
//	public List<ProductOld> reterieve();

}
