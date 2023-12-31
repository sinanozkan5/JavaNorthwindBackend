package kodlamaio.northwindBackend.entities.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductWithCategoryDto {
	private int id;
	private String productName;
	private String categoryName;
	public ProductWithCategoryDto() {
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getCategoryName() {
		return categoryName;
	}
	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}
	
	public ProductWithCategoryDto(int id, String productName, String categoryName) {
		super();
		this.id = id;
		this.productName = productName;
		this.categoryName = categoryName;
	}
	
}
