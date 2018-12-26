package model.entities;

public class OrderItem {
	Integer quantity;
	Double price;
	
	Product product;

	public OrderItem(Integer quantity, Double price, Product product) {
		this.quantity = quantity;
		this.price = price;
		this.product = product;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}
	
	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public Double Subtotal() {
		return quantity * price;
	}

	@Override
	public String toString() {
		return product.getName()
				+", $"+String.format("%.2f",price)
				+", Quantidade:"+quantity
				+", Subtotal$"+String.format("%.2f",Subtotal());
	}

	
	
	
}
