package Projet1;

public class ErrSom extends ErrNat{
	
	public ErrSom(int arg) {
		super(arg);
	}
	
	@Override
	public String toString() {
		return super.toString()+", La somme est plus grande que le seuil";
	}
}
