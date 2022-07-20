package bean;

import java.util.Date;

public class Order {

	private int orderId;
	private int userId;
	private int uniformId;
	private int quantity;
	private Date orderedAt;

	public Order() {
		this.orderId = 0;
		this.userId = 0;
		this.uniformId = 0;
		this.quantity = 0;
		this.orderedAt = null;
	}

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public int getUniformId() {
		return uniformId;
	}

	public void setUniformId(int uniformId) {
		this.uniformId = uniformId;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public Date getOrderedAt() {
		return orderedAt;
	}

	public void setOrderedAt(Date orderedAt) {
		this.orderedAt = orderedAt;
	}

}
