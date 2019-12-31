package com.akshay;

public class Welcome {

	public static void main(String[] args) {
		System.out.println("Welcome to Z-SHOP");
		System.out.println();
		System.out.println();
		
		System.out.println("Items available**********");

		Shop s = new Shop();
		s.setId(100);
		s.setName("Soap");
		
		Shop s1 = new Shop(101,"Pen");
		
		Shop s2 = new Shop(103,"Mouse");
		
		
		System.out.println(s.getId() +" "+ s.getName());
		System.out.println(s1.getId()+ " "+s1.getName());
		System.out.println(s2.getId()+ " "+s2.getName());

		
		System.out.println();
		System.out.println("Items Purchased*********");
		System.out.println(s.getId() +" "+ s.getName());
		
		
		
	}
}
