package projet_echecs;


public class Case {//Class case qui va contenir une piece
	
	private Piece piece;//piece
	
	public Case()
	{
		
	}
	
	public Case(Piece piece)
	{
		this.piece = piece;
	}
		public Piece getPiece() {//recuperer piece qui est dans la case
		return piece;
	}
	
	public void setPiece(Piece piece) {//mettre une piece dans la case
		this.piece = piece;
	}
	public boolean estOccupe()//savoir la case est occupé par n'importe quelle piece
	{
		return (piece != null);	
	}
	
	public boolean estOccupe(int couleur)//verif si case occupéé par une piece par le couleur indiquée en parametre
	{
		if (piece == null)
			return false;
		else
			return (piece.Getcouleur()==couleur);
	}
	
	
	
	public String toString(){ // retourne nom de la pice
		String g=piece.toString();
		return g;
	}


}
