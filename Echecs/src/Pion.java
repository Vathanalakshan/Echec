

public class Pion extends Piece {
	public Pion(int couleur,int x,int y){
		super("Pion",couleur, x, y);
		
	}
	
	public String toString() {
	
		if(couleur==1)
		{
		return "\u2659 ";
		}
		return "\u265F ";
	}

}