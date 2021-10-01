/* Author : Ream Sadaoui - groupe 7 - étudiante 3702213 */


public class TestComplexe {
	
	public static void main (String [] args){
		
		//Création de mes complexes 
		Complexe un = new Complexe();
		Complexe deux = new Complexe();
		Complexe trois = new Complexe();
		
		
		//Afficher les 3 complexes
		System.out.println("Les trois complexes sont les suivants:");		
		System.out.println(un.toString());		
		System.out.println(deux.toString());
		System.out.println(trois.toString());
		System.out.println(" ");
		
		//Voir si mon premier complexe est réel ou pas 
		System.out.println(un.estReel());
		System.out.println(" ");
		
		//Idem avec mon deuxieme complexe
		System.out.println(deux.estReel());
		System.out.println(" ");

		//Idem avec mon troisieme complexe
		System.out.println(trois.estReel());
        System.out.println(" ");

		//Additionner les complexes
		System.out.println("Complexes un et deux: ");
		un.addition(deux);
		System.out.println("Complexes deux et trois: ");
		deux.addition(trois);
		
		//Multiplier les complexes
		System.out.println("Complexes trois et deux: ");
		trois.multiplication(deux);
		System.out.println("Complexe trois mutiplie par lui-meme: ");
		trois.multiplication(trois);


	}
}