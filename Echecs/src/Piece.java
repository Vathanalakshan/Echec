
public abstract class Piece {//Classed mére
	boolean couleur;//Couleur de la piéce
	int x,y;//Position dans le quelle la piece se trouve
	String nom;//Nom de la piece
	
//Constructeur
	
	public Piece(boolean coul,int x,int y,String nom){
		setcouleur(coul);
		setposition(x,y);
		setnom(nom);
	}
	
	public String getnom(){
		return nom;
	}
	
	public void setnom(String nom){
		this.nom=nom;
	}
	
	public int getpositionabs(){
		return x;
	}
	public int getpositionord(){
		return y;
	}
	
	public void setposition(int l,int m){
		this.x=l;
		this.y=m;
	}
	
	public boolean getcoul(){
		return couleur;
	}
	
	public void setcouleur(boolean coul){
		this.couleur=coul;
	}
}