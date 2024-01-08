package Projet1;

public class EntNat {
	 
	public static int S=0;
	private int nb=0;
	public EntNat(int arg) throws ErrConst{
		if(arg<0) throw new ErrConst(arg);
		else nb=arg;
	}
	public int getN(){
		return nb;
	}
	
	public static int Somme(int a, int b) throws ErrSom{
		int r = a + b;
		if(r>S) throw new ErrSom(r);
		return r;
	}
	
	public static int Diff(int a, int b) throws ErrDiff{
		int r = a - b;
		if(r>S)throw new ErrDiff(r);
		return r;
	}
	
	public static int Prod(int a, int b) throws ErrProd{
		int r = a * b;
		if(r>S)throw new ErrProd(r);
		return r;
	}
}