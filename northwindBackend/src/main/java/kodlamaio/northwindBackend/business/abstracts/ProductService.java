package kodlamaio.northwindBackend.business.abstracts;

import java.util.List;

import kodlamaio.northwindBackend.core.utilities.results.DataResult;
import kodlamaio.northwindBackend.core.utilities.results.Result;
import kodlamaio.northwindBackend.entities.concretes.Product;
import kodlamaio.northwindBackend.entities.dtos.ProductWithCategoryDto;

public interface ProductService {
      
	DataResult<List<Product>> getAll();
      
	DataResult<List<Product>> getAllSorted();
      
	DataResult<List<Product>> getAll(int pageNo, int pageSize);
      
	Result add(Product product);
     
    DataResult<Product> getByProductName(String productName);
	  
    DataResult<Product> getByProductNameAndCategoryId(String productName, int categoryId);
	  
    DataResult<List<Product>> getByProductNameOrCategoryId(String productName, int categoryId);
  
    DataResult<List<Product>> getByCategoryIdIn(List<Integer> categories);
	  
    DataResult<List<Product>> getByProductNameContains(String productName);
	  
    DataResult<List<Product>> getByProductNameStartsWith(String productName);

    DataResult<List<Product>> getByNameAndCategory(String productName, int categoryId);
      
    DataResult<List<ProductWithCategoryDto>> getProductWithCategoryDetails();
      
      
}