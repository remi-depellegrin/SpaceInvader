package fr.unilim.iut.spaceinvader;

import fr.unilim.iut.spaceinvaders.utils.Position;

public class Vaisseau {


    int longueur;
    int hauteur;
    Position origine;
    
    public Vaisseau(int longueur, int hauteur, int x, int y) {
 	   this.longueur=longueur;
 	   this.hauteur=hauteur;
 	   this.origine = new Position (x,y);
 	   }

    public Vaisseau(int longueur, int hauteur) {
		this(longueur, hauteur, 0, 0);
	}
    public boolean occupeLaPosition(int x, int y) {
	     return (estAbscisseCouverte(x) && estOrdonneeCouverte(y));
    }

	private boolean estOrdonneeCouverte(int y) {
		return (ordonneeLaPlusBasse()<=y) && (y<=ordonneeLaPlusHaute());
	}

	private int ordonneeLaPlusHaute() {
		return this.origine.ordonnee();
	}

	private int ordonneeLaPlusBasse() {
		return ordonneeLaPlusHaute()-this.hauteur+1;
	}

	private boolean estAbscisseCouverte(int x) {
		return (abscisseLaPlusAGauche()<=x) && (x<=abscisseLaPlusADroite());
	}

	public int abscisseLaPlusADroite() {
		return this.origine.abscisse() + this.longueur-1;
	}
    
    public void positionner(int x, int y) {
	    this.x = x;
	    this.y = y;
    }
	
	public void seDeplacerVersLaDroite() 
	{
		this.x = this.x + 1 ;
	}
	
	public int abscisseLaPlusAGauche() {
        return this.origine.abscisse();
	}

	public void seDeplacerVersLaGauche() 
	{
		this.x = this.x - 1 ;
	}
	
	public int getX() {
        return this.x;
	}
	
	public int getY() { 
        return ordonneeLaPlusHaute();
	}
}
