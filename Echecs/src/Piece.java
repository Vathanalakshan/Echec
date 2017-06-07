package projet_echecs;

public abstract class Piece {
	protected int couleur;
	protected String nom;
	
	
	public Piece(String nom,int couleur,int x,int y){
		this.couleur=couleur;
		this.nom=nom;
	}
public int Getcouleur(){
	return couleur;
}
public String Getnom(){
	return nom;
}


public abstract String toString();
public abstract boolean moveValable(int xi,int yi,int xf,int yf);
}
