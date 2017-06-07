package projet_echecs;

public class Cavalier extends Piece {
	
	public Cavalier(int couleur,int x,int y){
		super("Cavalier",couleur, x, y);
		
	}
	

	
	public String toString() {
	
		if(couleur==1)
		{
		return "\u2658";
		}
		return "\u265E";
	}
	
	
	public boolean moveValable(int xi,int yi,int xf,int yf){//i=initial f=final x,y position

		if ((xf-2==xi||xf+2==xi) && (yf-1==yi||yf+1==yi ))//deplacement de +/- 2 en x et +/- 1 en y 
			return true;
		if ((xf-1==xi||xf+1==xi) && (yf-2==yi||yf+2==yi ))//deplacementde +/- 1 en x et +/- 2 en y
			return true;
		System.out.println("Deplacement cavalier impossible");
		return false;
			}
	}


