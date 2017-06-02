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
	
	public boolean EstValide(Deplacement deplacement) {
		
		return Math.abs(deplacement.GetDeplacementX()) - Math.abs(deplacement.GetDeplacementY()) == 0 && !deplacement.DeplacementNull();
		
	}

}

