package projet_echecs;

public class Pion extends Piece {
	public Pion(int couleur,int x,int y){
		super("Pion",couleur, x, y);
		
	}
	
	public String toString() {
	
		if(couleur==1)
		{
		return "\u2659";
		}
		return "\u265F";
	}
	
	public boolean EstValide(Deplacement deplacement) {
		
			
		if (deplacement.GetDeplacementX() == 0){
			if (super.couleur==1){
				
				return deplacement.GetDeplacementY() <= (deplacement.Getdepart().Getligne() == 1 ? 2 : 1) && deplacement.GetDeplacementY() > 0;
			}
			else {
				
	return deplacement.GetDeplacementY() >= (deplacement.Getdepart().Getligne() == 6 ? -2 : -1) && deplacement.GetDeplacementY() < 0;
			}
	
			
	}
		return false;
}

	
}