

public class Reine extends Piece {
	public Reine(int couleur,int x,int y){
		super("Reine",couleur, x, y);
		
	}
	
	public String toString() {
	
		if(couleur==1)
		{
		return "\u2655 ";
		}
		return "\u265B ";
	}

}
