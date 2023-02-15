package tn.esprit.alternance;

public class Puissance {

	
	int id;
	int id1;
	int somme;



public Puissance(int id,int id1,int somme) {
	
	this.id=id;
	
	this.somme=somme;
	this.id1=id1;
}

public void calcule(int id,int id1) {

somme=id*id1;

System.out.println(somme);

}
}