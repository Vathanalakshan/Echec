package projet_echecs;

public class Reine extends Piece {
	public Reine(int couleur,int x,int y){
		super("Reine",couleur, x, y);
		
	}
	
	public String toString() {
	
		if(couleur==1)
		{
		return "\u2655";
		}
		return "\u265B";
	}
	
	public boolean moveValable(int xi,int yi,int xf,int yf){//i=initial f=final x,y position
		for (int i=0;i<8;i++){
			if(((xf==xi+i)||(xf==xi-i)) && ((yf==yi+i)||(yf==yi-i)))//deplacement diagonales
				return true;
			if (((xf==xi)&&(yf==yi+i))||(yf==yi-i))//deplacement vertical
				return true;
			if (((xf==xi+i)||(xf==xi-i))&&(yf==yi))//deplacement horizantal
				return true;
		}
		return false;
	}
}
