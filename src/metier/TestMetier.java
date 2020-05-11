package metier;

public class TestMetier {

	public static void main(String[] args) {
		CreditMetier metier=new CreditMetier();
		double m=metier.calculMensualite(15000, 60, 2.6);
		System.out.println(m);
	}

}
