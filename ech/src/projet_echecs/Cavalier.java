package projet_echecs;

public class Cavalier extends Piece {
	
	public Cavalier(int couleur,int x,int y){
		super("Cavalier",couleur, x, y);
		
	}
	

	
	public String toString() {
	
		if(couleur==1)
		{
		return "\u2658";
		}
		return "\u265E";
	}
	public boolean EstValide(Deplacement deplacement) {
		
		return (Math.abs(deplacement.GetDeplacementX()) == 2) && (Math.abs(deplacement.GetDeplacementY()) == 1) || (Math.abs(deplacement.GetDeplacementX()) == 1) && (Math.abs(deplacement.GetDeplacementY()) ==  2);
	}

}
