package jse.training.cocepts.Ecommerce.MyShoppy;

import jse.training.cocepts.Ecommerce.Order.Order;
import jse.training.cocepts.Ecommerce.Payment.CardPayment;
import jse.training.cocepts.Ecommerce.Payment.Payment;
import jse.training.cocepts.Ecommerce.Product.Product;

public class OneShop {
	public static void main(String[] args) {
		Product product=new Product(1789, "bluetooth","electronics" );
		Payment payment=new CardPayment(); 
		Order order=new Order(1987, "12-01-2024",product,payment);
		/*
		System.out.println("#########Order Details#####"
				     + "\nOrder ID:           "+order.getOrderId()
		             + "\nOrder Date:       " +order.getOrderDate()
		             + " \nProduct ID:       "+order.getProduct().getProductId()
		             + "\nProduct Name:  "+order.getProduct().getProductName()
		             +"\nPayement Type:  " +order.getPayment().pay()
		             );
		             */
		
		System.out.println(order);
	}





}
