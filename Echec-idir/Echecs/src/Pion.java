package projet_echecs;

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
	public boolean EstValide(Deplacement deplacement) {
		if (couleur==1){
			if(deplacement.GetDeplacementX==0 && deplacement.GetDeplacementY==-1 && deplacement.DeplacementNull()==false)
				return true;
			else(deplacement.GetDeplacementX==0 && deplacement.GetDeplacement==+1 && deplacement.DeplacementNull()==false)
				return true;
		
}//cas de premier round a faire
}
}