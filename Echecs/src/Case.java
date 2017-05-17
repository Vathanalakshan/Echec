
public class Case {
	public int ligne;
	public int colonne;
	public Piece piece;
	
	public Case(int ligne , int  colonne){
		this.ligne=ligne;
		this.colonne=colonne;
		//Algo pour indentifier la piéce
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
	
	/* get set Piece*/
}
