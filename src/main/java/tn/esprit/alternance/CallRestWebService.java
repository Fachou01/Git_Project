package tn.esprit.alternance;

import java.io.IOException;

public class CallRestWebService {
	
	public static void main(String[] args) {
		Gamers g1 = new Gamers(1252,"Stow",99,99);
		System.out.println(g1);
		Puissance p1 =new Puissance();
		p1.calcule(4, 5);
	}
}
