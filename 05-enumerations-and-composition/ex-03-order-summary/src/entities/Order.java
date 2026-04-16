package entities;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import entities.enums.OrderStatus;

public class Order {
	private LocalDateTime moment;
	private OrderStatus status;
	private Client client;
	
	private List<OrderItem> orderItems = new ArrayList<>(); 

	public Order() {
		
	}

	public Order(LocalDateTime moment, OrderStatus status, Client client) {
		this.moment = moment;
		this.status = status;
		this.client = client;
	}

	public LocalDateTime getMoment() {
		return moment;
	}

	public void setMoment(LocalDateTime moment) {
		this.moment = moment;
	}

	public OrderStatus getStatus() {
		return status;
	}

	public void setStatus(OrderStatus status) {
		this.status = status;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public List<OrderItem> getOrderItem() {
		return orderItems;
	}
	
	public void addItem(OrderItem orderItem) {
		orderItems.add(orderItem);
	}
	public void removeItem(OrderItem orderItem) {
		orderItems.remove(orderItem);
	}
	
	public Double total() {
		Double sum = 0.0;
		for(OrderItem o: orderItems) {
			sum += o.subTotal();
		}
		
		return sum;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		for (OrderItem o: orderItems) {
			sb.append(o.getProduct().getName()); 
			sb.append(", " + "$" + String.format("%.2f", o.getProduct().getPrice()));
			sb.append(", Quantity: " + o.getQuantity());
			sb.append(", Subtotal: $"); 
			sb.append(String.format("%.2f", o.subTotal()) +"\n");
		}
		sb.append("Total Price: $" +String.format("%.2f", total()));
		return sb.toString();
	}
	
	
}
