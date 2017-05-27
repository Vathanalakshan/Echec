
public class Deplacement {
	public Deplacement(){}
	
	
	public boolean caseValable(Piece p,int x,int y){
		if (p instanceof Pion){
			if(p.couleur==1)
				if(x==p.position.Getligne() && y==p.position.Getcolonne()+1){return true;}
			if(p.couleur==0)
				if(x==p.position.Getligne() && y==p.position.Getcolonne()-1){return true;}
			}
		if (p instanceof Fou){
			for(int i=0;i<8;i++){
				if((x==p.position.Getligne()+i) && y==p.position.Getcolonne()+i){return true;} 
				if((x==p.position.Getligne()+i) && y==p.position.Getcolonne()-i){return true;}
				if((x==p.position.Getligne()-i) && y==p.position.Getcolonne()+i){return true;}
				if((x==p.position.Getligne()-i) && y==p.position.Getcolonne()-i){return true;}
			}
		}
		if (p instanceof Reine){
			for(int i=0;i<8;i++){
				if((x==p.position.Getligne()+i) && y==p.position.Getcolonne()+i){return true;}
				if((x==p.position.Getligne()+i) && y==p.position.Getcolonne()-i){return true;}
				if((x==p.position.Getligne()-i) && y==p.position.Getcolonne()+i){return true;}
				if((x==p.position.Getligne()-i) && y==p.position.Getcolonne()-i){return true;}
				if(x==p.position.Getligne() && y==p.position.Getcolonne()+i){return true;}
				if(x==p.position.Getligne() && y==p.position.Getcolonne()-i){return true;}
				if((x==p.position.Getligne()+i) && y==p.position.Getcolonne()){return true;}
				if((x==p.position.Getligne()-i) && y==p.position.Getcolonne()){return true;}
			}
		if (p instanceof Roi){
			if(x==p.position.Getligne()+1 && x==p.position.Getcolonne()){return true;}
			if(x==p.position.Getligne()-1 && x==p.position.Getcolonne()){return true;}
			if(x==p.position.Getligne() && x==p.position.Getcolonne()+1){return true;}
			if(x==p.position.Getligne() && x==p.position.Getcolonne()-1){return true;}
			if(x==p.position.Getligne()+1 && x==p.position.Getcolonne()-1){return true;}
			if(x==p.position.Getligne()-1 && x==p.position.Getcolonne()+1){return true;}
			if(x==p.position.Getligne()+1 && x==p.position.Getcolonne()+1){return true;}
			if(x==p.position.Getligne()-1 && x==p.position.Getcolonne()-1){return true;}


		}
		if (p instanceof Cavalier){
			if(x==p.position.Getligne()+3 && x==p.position.Getcolonne()+2){return true;}
			if(x==p.position.Getligne()+3 && x==p.position.Getcolonne()-2){return true;}
			if(x==p.position.Getligne()-3 && x==p.position.Getcolonne()+2){return true;}
			if(x==p.position.Getligne()-3 && x==p.position.Getcolonne()-2){return true;}

		}
			
		}
		if (p instanceof Tour){
			for(int i=0;i<8;i++){
				if(x==p.position.Getligne() && y==p.position.Getcolonne()+i){return true;}
				if(x==p.position.Getligne() && y==p.position.Getcolonne()-i){return true;}
				if((x==p.position.Getligne()+i) && y==p.position.Getcolonne()){return true;}
				if((x==p.position.Getligne()-i) && y==p.position.Getcolonne()){return true;}
			}
		}
		return false;
	}
	public boolean coordValable(int x,int y){
		if ((x<8 && x>=0) && (y<8 && y>=0)){return true;}
		else 
			return false;
	}
	public void deplacer(Piece p,int x,int y){
		
	}
}
