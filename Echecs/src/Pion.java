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
	
	public boolean moveValable(int xi,int yi,int xf,int yf){//i=initial f=final x,y position
		if(couleur==0 && xi==6 && xf==4 && yi-yf==0){//pion noir sur la ligne 6:cad premier move
			System.out.println(xi);
					return true;
		}
		if(couleur==1 && xi==1 && xf==3 && yi-yf==0){//pion blanc sur la ligne 1:cad premier move
			if((xf==xi+2||xf==xi+1)&&(yf-yi==0))//
					return true;
		}
		if (couleur==1){//deplacement du pion normal sans elimier un autre piece
			if((xf==xi+1)&&(yf==yi))
				return true;
			/*if((xf==xi+1)&&(yf==yi-1 || yf==yi+1)){
  
					
				}*/
			}
		
		if (couleur==0){//deplacement du pion normal sans eliminer un autre pice
			if((xf==xi-1)&&(yf==yi))
				return true;
		}
		
	
		System.out.println("Deplacement Pion impossible");
		System.out.println(xi);
		System.out.println(xf);
		System.out.println(yi);
		System.out.println(yf);
		System.out.println(couleur);
		return false;
		}
}