

public class Roi extends Piece {
	public Roi(int couleur,int x,int y){
		super("Roi",couleur, x, y);
		
	}
	
	public String toString() {
	
		if(couleur==1)
		{
		return "\u2654 ";
		}
		return "\u265A ";
	}

}