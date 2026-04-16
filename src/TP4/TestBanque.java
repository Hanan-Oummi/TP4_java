package TP4;

public class TestBanque {
	public static void main(String[] args) {
		Compte[] comptes = new Compte[4];
		comptes[0] = new CompteCourant("C1", "Hanan", 1000, 200);
		comptes[1] = new CompteEpargne("E1", "Khadija", 2000, 0.04);
		comptes[2] = new ComptePremium("P1", "Ayoube", 3000, 300);
		comptes[3] = new CompteCourant("C2", "Youssef", 4000, 200);
		
		for (Compte c : comptes) {
			c.deposer(200);
			c.retirer(300);
			c.afficher();
		}
		
		//Filtrage par type
		System.out.println("les comptes de type CompteEpargne:");
		for(Compte c : comptes) {
			if(c instanceof CompteEpargne) {
				c.afficher();
			}
		}
		
				
		
	}

}

