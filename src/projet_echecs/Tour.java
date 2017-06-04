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
	
	public boolean moveValable(int xi,int yi,int xf,int yf){//i=initial f=final x,y position
		for (int i=0;i<8;i++){
			if (((xf==xi)&&(yf==yi+i))||(yf==yi-i))// deplacement vertical
				return true;
			if (((xf==xi+i)||(xf==xi-i))&&(yf==yi))// deplacement horizantal
				return true;
		}
		return false;
}
}

