public class Complexe {

	private double reelle;
	private double imag;

	public Complexe(double reelle, double imag){
		reelle = reelle;
		imag = imag;
	}

	public Complexe(){
		this.reelle = Math.round((-2 + (Math.random()* 4)));
		this.imag = Math.round((-2 + (Math.random()* 4)));

	}

	//Generation d'une string qui renvoie les valeurs
	public String toString(){
		String string = (reelle + " + ("+ imag + "i)");
		return string;
	}

	//Check si un complexe est reel ou pas
	public  boolean estReel(){
		boolean check;

		System.out.println("Le complexe " + toString() + " est-il reel?");
		if(imag == 0) {
			check = true;
		}
		else
		{
			check = false;
		}
		return check;
	}

	//Additionne 2 complexes
	public void addition(Complexe complexe){
		double somme_reel = reelle + complexe.reelle;
		double somme_imaginaire = imag + complexe.imag;
		if (somme_reel == 0 && somme_imaginaire == 0){
			System.out.println("La somme des complexes est nulle\n");
		} else {
		System.out.println("La somme des complexes vaut: " + somme_reel + " + (" + somme_reel+ "i)\n");
	}
	}

	//Multiplication 2 complexes
	public void multiplication(Complexe complexe){
		double multiplication = (reelle*complexe.reelle - imag*complexe.imag) * (reelle*complexe.imag + imag*complexe.reelle);
		//checker si le résultat est nul
		if (multiplication == 0)
		{
			System.out.println("La multiplication est nulle\n");
		} else {

		System.out.println("La multiplication vaut : " + multiplication +"i\n");
	}
	}
}
