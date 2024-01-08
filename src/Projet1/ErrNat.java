package Projet1;

public class ErrNat extends Exception{
	 
	int n=0;
	
	public ErrNat(int arg) {
		n=arg;
	}
	
	public String toString() {
		return this.getClass().getSimpleName()+"> Depassement de seuil: "+n;
	}
}