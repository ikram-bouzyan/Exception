package Projet1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Donner le seuil: ");
		int S=sc.nextInt();
		System.out.println("Entrer a: ");
		int a = sc.nextInt();
		System.out.println("Entrer b: ");
		int b = sc.nextInt();
		try {
			System.out.println("La somme est: "+EntNat.Somme(a, b));
			System.out.println("La difference est: "+EntNat.Diff(a, b));
			System.out.println("Le produit est: "+EntNat.Prod(a, b));
		}
		catch(ErrNat e) {
			System.err.println(e);
		} 
	}
}

