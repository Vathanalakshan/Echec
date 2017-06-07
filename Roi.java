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
	
	
	public boolean moveValable(int xi,int yi,int xf,int yf){//i=initial f=final x,y position
		if ((xf==xi+1||xf==xi-1||xi==xf)&&(yf==yi+1||yf==yi-1||yi==yf))//deplacement dans tous les sens limité a une case
			return true;
		System.out.println("Deplacement Roi impossible");
		return false;
}
}