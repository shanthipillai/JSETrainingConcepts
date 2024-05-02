package jse.training.cocepts.Ecommerce.Order;

import jse.training.cocepts.Ecommerce.Payment.Payment;
import jse.training.cocepts.Ecommerce.Product.Product;

public class Order {
private int orderId;
private String orderDate;
private Product product;
private Payment payment;


public Order() {
	super();
	// TODO Auto-generated constructor stub
}

public Order(int orderId, String orderDate, Product product, Payment payment) {
	super();
	this.orderId = orderId;
	this.orderDate = orderDate;
	this.product = product;
	this.payment = payment;
}

public int getOrderId() {
	return orderId;
}
public void setOrderId(int orderId) {
	this.orderId = orderId;
}
public String getOrderDate() {
	return orderDate;
}
public void setOrderDate(String orderDate) {
	this.orderDate = orderDate;
}
public Product getProduct() {
	return product;
}
public void setProduct(Product product) {
	this.product = product;
}
public Payment getPayment() {
	return payment;
}
public void setPayment(Payment payment) {
	this.payment = payment;
}

@Override
	public String toString() {
	
		return "#########Order Details#####"
				     + "\nOrder ID:           "+getOrderId()
		             + "\nOrder Date:       " +getOrderDate()
		             + "\n Product ID:       "+getProduct().getProductId()
		             + "\nProduct Name:  "+getProduct().getProductName()
		             +"\nPayement Type:  " +getPayment().pay()
		             ;
	}

}
