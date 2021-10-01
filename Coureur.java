

/**
 *
 * Ream Sadaoui - étudiante 3702213
 * Groupe 7
 */
public class Coureur {

    private int numDossard;
    private double tempsAu100;
    private boolean possedeTemoin;

    public Coureur(int numeroDeDossard) {
        numDossard = numeroDeDossard;
        tempsAu100 = Math.round((12 + (Math.random() * 4)));
        possedeTemoin = false;
    }

    public Coureur() {
        this((int) (Math.random() * 1000) + 1);
    }
    
    public int getNumDossard(){
        return numDossard;
    }
    
    public double getTempsAu100(){
        return tempsAu100;
    }
    
    public boolean getPossedeTemoin(){
        return possedeTemoin;
    }
	
	public void setPossedeTemoin(boolean b){
		possedeTemoin = b;
	}
	
	public String toString(){
		return "Coureur " + getNumDossard()+ " " + getTempsAu100() + " au 100m. possedeTemoin: " + getPossedeTemoin() + " ";
	}
	
	//Il me faut 2 dossards différents pour chacun des coureurs
	public void passeTemoin(Coureur c){
		System.out.println("Moi, grand bogosse coureur " + getNumDossard() +" , je passe le temoin au coureur "+ c.getNumDossard() + " .\n");
		setPossedeTemoin(false);
		c.setPossedeTemoin(true);
	}
	
	public void courir(){
		System.out.println("je suis le coureur " + getNumDossard() + " et je cours.\n");
	}
	
	
}



