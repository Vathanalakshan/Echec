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
	
	public boolean EstValide(Deplacement deplacement) {
		
		return (Math.abs(deplacement.GetDeplacementX()) - Math.abs(deplacement.GetDeplacementY()) == 0 
				| deplacement.GetDeplacementX() * deplacement.GetDeplacementY() == 0) && !deplacement.DeplacementNull();
	}

}
