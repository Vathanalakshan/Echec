package projet_echecs;


public class Case {
	
	private Piece piece;
	
	public Case()
	{
		
	}
	
	public Case(Piece piece)
	{
		this.piece = piece;
	}
		public Piece getPiece() {
		return piece;
	}
	
	public void setPiece(Piece piece) {
		this.piece = piece;
	}
	public boolean estOccupe()
	{
		return (piece != null);	
	}
	
	public boolean estOccupe(int couleur)
	{
		if (piece == null)
			return false;
		else
			return (piece.Getcouleur()==couleur);
	}
	
	
	public String toString(){
		String g=piece.toString();
		return g;
	}
	
}
