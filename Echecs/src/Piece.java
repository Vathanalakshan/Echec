
public abstract class Piece {//Classed m�re
	boolean couleur;//Couleur de la pi�ce
	int position;//Position dans le quelle la piece se trouve
	String nom;//Nom de la piece
	
//Constructeur
	
	public Piece(boolean coul,int pos,String nom){
		setcouleur(coul);
		setposition(pos);
		setnom(nom);
	}
	
	public String getnom(){
		return nom;
	}
	
	public void setnom(String nom){
		this.nom=nom;
	}
	
	public int getposition(){
		return position;
	}
	
	public void setposition(int pos){
		this.position=pos;
	}
	
	public boolean getcoul(){
		return couleur;
	}
	
	public void setcouleur(boolean coul){
		this.couleur=coul;
	}
}