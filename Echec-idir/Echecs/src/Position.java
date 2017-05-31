package projet_echecs;

public class Position {
	private int ligne;
	private int colonne;
	public Position(){
		this.ligne=0;
		this.colonne=0;
	}
	public Position(int x,int y){
		this.ligne=x;
		this.colonne=y;
	}
	public int Getligne(){
		return ligne;
	}
	public int Getcolonne(){
		return colonne;
	}
	
	public void Setligne(int x){
		this.ligne=x;
	}
	public void Setcolonne(int y){
		this.colonne=y;
	}
	
	public boolean equals(Position position) {
		return position.Getcolonne() == this.Getcolonne()
				&& position.ligne == this.ligne;
	}

}
