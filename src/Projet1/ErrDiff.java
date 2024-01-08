package Projet1;

public class ErrDiff extends ErrNat{

	public ErrDiff(int arg) {
		super(arg);
	}
	
	@Override
	public String toString() {
		return super.toString()+", La difference est plus grande que le seuil";
	}
}
