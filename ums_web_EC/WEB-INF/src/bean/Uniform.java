package bean;

import java.util.Date;

public class Uniform {

	private int uniformId;
	private String uniformName;
	private int price;
	private int stock;
	private String image;
	private String info;
	private Date createdAt;

	public Uniform() {
		this.uniformId = 0;
		this.uniformName = null;
		this.price = 0;
		this.stock = 0;
		this.image = null;
		this.info = null;
		this.createdAt = null;
	}

	public int getUniformId() {
		return uniformId;
	}

	public void setUniformId(int uniformId) {
		this.uniformId = uniformId;
	}

	public String getUniformName() {
		return uniformName;
	}

	public void setUniformName(String uniformName) {
		this.uniformName = uniformName;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public String getInfo() {
		return info;
	}

	public void setInfo(String info) {
		this.info = info;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

}
