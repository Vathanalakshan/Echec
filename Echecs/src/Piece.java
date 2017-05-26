

public abstract class Piece {
	protected int couleur;
	protected String nom;
	protected Position position;
	
	public Piece(String nom,int couleur,int x,int y){
		this.couleur=couleur;
		this.nom=nom;
		this.position=new Position(x,y);
	}
public int Getcouleur(){
	return couleur;
}
public String Getnom(){
	return nom;
}
public Position Getpositon(){
	return position;
}
public abstract String toString();

}
