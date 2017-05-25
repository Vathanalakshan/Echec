
public class Case {
	public int ligne;
	public int colonne;
	public Piece piece;
	
	public Case(int ligne , int colonne,Piece p){
		this.ligne=ligne;
		this.colonne=colonne;
		this.piece=p;
	}
	
	public void setligne(int ligne){
		this.ligne=ligne;
	}

	public void setcolonne(int colonne){
		this.colonne=colonne;
	}
	
	public int getligne(){
		return this.ligne;
	}
	
	public int getcolonne(){
		return this.colonne;
	}
	
	public void  setpiece(Piece p){
		this.piece=p;
	}
	
	public Piece getpiece(){
		return this.piece;
	}
}
