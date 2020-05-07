package fr.unilim.iut.spaceinvader;

public class Vaisseau {

    int x;
    int y;
    int longueur;
    int hauteur;

    public Vaisseau(int longueur, int hauteur) {
		this.longueur=longueur;
		this.hauteur=hauteur;
		this.x = 0;
		this.y = 0;
	}

    public Vaisseau(int longueur, int hauteur, int x, int y) {
	   this.longueur=longueur;
	   this.hauteur=hauteur;
	   this.x = x;
	   this.y = y;
    }

    public boolean occupeLaPosition(int x, int y) 
    {
	     if ((this.x<=x) && (x<=this.x+this.longueur-1)) 
		      if ( (this.y-this.hauteur+1<=y) && (y<=this.y))
			  return true;
		
	     return false;
    }
    
    public void positionner(int x, int y) {
	    this.x = x;
	    this.y = y;
    }
	
	public void seDeplacerVersLaDroite() 
	{
		this.x = this.x + 1 ;
	}
	
	public int abscisse() {
        return this.x;
	}

	public void seDeplacerVersLaGauche() 
	{
		this.x = this.x - 1 ;
	}
	
	public int getX() {
        return this.x;
	}
	
	public int getY() { 
        return this.y;
	}
}
