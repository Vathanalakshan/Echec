package projet_echecs;

public class Tour extends Piece {
	public Tour(int couleur,int x,int y){
		super("Tour",couleur, x, y);
		
	}
	
	public String toString() {
	
		if(couleur==1)
		{
		return "\u2656";
		}
		return "\u265C";
	}
	
	public boolean EstValide(Deplacement deplacement) {
		
		return deplacement.GetDeplacementX() * deplacement.GetDeplacementY() == 0 && !deplacement.DeplacementNull();
	}


}

