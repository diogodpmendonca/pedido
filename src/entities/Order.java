package entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import entities.enums.OrderStatus;

public class Order {
	Date moment;
	OrderStatus status;
	
	List<OrderItem> items = new ArrayList<>();

	public Order(OrderStatus status) {
		this.moment = new Date();
		this.status = status;
	}

	public Date getMoment() {
		return moment;
	}

	public void setMoment(Date moment) {
		this.moment = moment;
	}

	public OrderStatus getStatus() {
		return status;
	}

	public void setStatus(OrderStatus status) {
		this.status = status;
	}

	public List<OrderItem> getItems() {
		return items;
	}
	
	public void addItem(OrderItem item) {
		items.add(item);
	}
	
	public void removeItem(OrderItem item) {
		items.remove(item);
	}
	
	public Double total() {
		double sum = 0;
		for(OrderItem i: items) {
			sum += i.Subtotal();
		}
		return sum;
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		Client c = new Client();
		sb.append("Momento da Compra: "+moment);
		sb.append("Status da Compra: "+status);
		sb.append(c.toString());
		sb.append("Itens da Compra");
		for(OrderItem item: items) {
			sb.append(item.toString());
		}
		return sb.toString();
	}
}
