package jse.training.cocepts.innerclasses.anonymous;

import java.util.Scanner;

public class MyFashionsCart {

	public static void main(String[] args) {
		System.out.println("Welcome to MyFashions");
		System.out.println("What are you looking for?");
		System.out.println("1. Clothing\n2.Apparels\n3.Jewellery");
		Scanner sc = new Scanner(System.in);
		int selected = sc.nextInt();
		MyFashions fashions=new MyFashions();
		switch (selected) {
		case 1:
			MyFashions.Clothing clothing = fashions.new Clothing();
			clothing.payment();
			break;
		case 2:
			MyFashions.Apparels apparels = fashions.new Apparels();
			apparels.payment();
			break;
		case 3:
			MyFashions.Jewellery jewellery = fashions.new Jewellery();
			jewellery.payment();
			break;
		default:
			System.out.println("Selected Incorrect");
		}
	}
}
