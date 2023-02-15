package tn.esprit.alternance;

import java.io.IOException;

public class CallRestWebService {
	
	public static void main(String[] args) {
		Gamers g1 = new Gamers(1252,"Stow",99,99);
		System.out.println(g1);
		Person p1 = new Person(1,"Koumenji","Mohamed");
		System.out.println(p1);
		Product product1 = new Product("yaourt",0.400,1);
		System.out.println(product1);
		Product product2 = new Product("coca",2000,2);
		System.out.println(product1);
	}
}
