package projet_echecs;

public class Fou extends Piece {
	public Fou(int couleur,int x,int y){
		super("Fou",couleur, x, y);
		
	}
	
	public String toString() {
	
		if(couleur==1)
		{
		return "\u2657";
		}
		return "\u265D";
	}
	
	public boolean moveValable(int xi,int yi,int xf,int yf){//i=initial f=final x,y position
		for (int i=0;i<8;i++){
			if(((xf==xi+i)||(xf==xi-i)) && ((yf==yi+i)||(yf==yi-i)))
				return true;
		}
		return false;
	}
}

