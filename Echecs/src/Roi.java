package projet_echecs;

public class Roi extends Piece {
	public Roi(int couleur,int x,int y){
		super("Roi",couleur, x, y);
		
	}
	
	public String toString() {
	
		if(couleur==1)
		{
		return "\u2654";
		}
		return "\u265A";
	}
	
	
	public boolean EstValide(Deplacement deplacement) {
		
		return Math.abs(deplacement.GetDeplacementX()) * Math.abs(deplacement.GetDeplacementY()) <= 1
		&& Math.abs(deplacement.GetDeplacementX()) - Math.abs(deplacement.GetDeplacementY()) <= 1
		&& Math.abs(deplacement.GetDeplacementX()) - Math.abs(deplacement.GetDeplacementY()) >= -1
			&& !deplacement.DeplacementNull();
	}

}