

public class Fou extends Piece {
	public Fou(int couleur,int x,int y){
		super("Fou",couleur, x, y);
		
	}
	
	public String toString() {
	
		if(couleur==1)
		{return "\u2657 ";
		}
		return "\u265D ";

	}

}