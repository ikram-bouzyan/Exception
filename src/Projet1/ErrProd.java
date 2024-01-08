package Projet1;

public class ErrProd extends ErrNat{

	public ErrProd(int arg) {
		super(arg);
	}

	@Override
	public String toString() {
		return super.toString()+", Le produit est plus grand que le seuil";
	}
}
