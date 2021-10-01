/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author reams
 */
public class TestCoureur {
    public static void main(String[] args) {
        
		// Création de mes coureurs
        Coureur c1 = new Coureur();
        Coureur c2 = new Coureur();
        Coureur c3 = new Coureur();
        Coureur c4 = new Coureur();
        
		//Préviens que les lignes qui suivent sont les tests de méthodes des exercices 1 à 5
		System.out.println("Les lignes suivantes sont des tests de methodes.\n");
		
		//Print le dossard du coureur 1
        System.out.println(c1.getNumDossard() + "\n");
		
		//Print le temps au 100 du coureur 2
        System.out.println(c2.getTempsAu100()+ "\n");
		
		//Print si le coureur 3 à un témoin ou pas
		System.out.println(c3.getPossedeTemoin()+ "\n");
		
		//Le coureur 4 à un témoin
		c4.setPossedeTemoin(true);
		
		//Print le coureur 2 et ses coordonnés
		System.out.println(c2.toString());

		//Print le coureur 4 et ses coordonnées
		System.out.println(c4.toString());

		//Le coureur 1 passe le témoin au coureur 2
		c1.passeTemoin(c2);

		//Le coureur 2 se met à courir
		c2.courir();
		
		// J'essaye de débugger car les sauts de lignes propres ne se font pas
		System.out.println("J ESSAYE DE TROUVER LE PROBLEM\n");
		
		
		//Les coureurs courent l'un après l'autre et se passe le témoin
		c1.setPossedeTemoin(true); //Il faut que le coureur 1 ai un témoin avant de courir
		c1.courir();
		System.out.println(c1.toString());
		c1.passeTemoin(c2);
		c1.setPossedeTemoin(false);
		
		//Au tour du coureur 2 !
		c2.courir();
		System.out.println(c2.toString()); //Ici il récupère un témoin donc évaluer à true
		System.out.println("\n");
		c2.passeTemoin(c3);
		c2.setPossedeTemoin(false); //Coureur 2 n'a plus de témoin
		
		//Au tour du coureur 3!
		c3.courir();
		System.out.println(c3.toString()); //Idem coureur 2
		System.out.println("\n");
		c3.passeTemoin(c4);
		c3.setPossedeTemoin(false); //Coureur 3 n'a plus de témoin
		
		//Au cour du dernier coureur !
		c4.courir();
		System.out.println(c4.toString());
		System.out.println("\n");
		c4.setPossedeTemoin(true);
		System.out.println("\n");
		
		//Calculer la somme des temps des 4 coureurs
		double sum = c1.getTempsAu100() + c2.getTempsAu100() + c3.getTempsAu100() + c4.getTempsAu100();
		System.out.println("Le temps total mis par les 4 coureurs est de: " + sum  + " secondes.\n");
		
        
        
 
        
        
    }
}
