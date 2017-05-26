package projet_echecs;

public class Tour extends Piece {
	public Tour(int couleur,int x,int y){
		super("Tour",couleur, x, y);
		
	}
	
	public String toString() {
	
		if(couleur==1)
		{
		return "\u2657 ";
		}
		return "\u265D ";
	}

}