package Projet1;

public class ErrConst extends Exception {
	int entier;
	
	ErrConst(int entier){
		this.entier=entier;
	}
	@Override
	public String toString() {
		return "n'est pas entier positif "+entier;
	}
	
	
}
