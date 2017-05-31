package projet_echecs;

public class Echiquier {
	 	
	 	Case echi[][] = new Case[8][8];
	 	public Echiquier(){
	 		for (int i=0;i<8;i++)
	 		{
	 			for(int j=0;j<8;j++){
	 				echi[i][j]=new Case();
	 			}
	 		}
	 		lancer();
	 		afficher();
	 	}
	 		
	 	public void lancer(){
	 		echi[0][0].setPiece(new Tour(1,0,0));
	 		echi[0][1].setPiece(new Cavalier(1,0,1));
	 		echi[0][2].setPiece(new Fou(1,0,2));
	 		echi[0][3].setPiece(new Reine(1,0,3));
	 		echi[0][4].setPiece(new Roi(1,0,4));
	 		echi[0][5].setPiece(new Fou(1,0,5));
	 		echi[0][6].setPiece(new Cavalier(1,0,6));
	 		echi[0][7].setPiece(new Tour(1,0,7));
	 		
	 		echi[1][0].setPiece(new Pion(1,0,7));
	 		echi[1][1].setPiece(new Pion(1,0,7));
	 		echi[1][2].setPiece(new Pion(1,0,7));
	 		echi[1][3].setPiece(new Pion(1,0,7));
	 		echi[1][4].setPiece(new Pion(1,0,7));
	 		echi[1][5].setPiece(new Pion(1,0,7));
	 		echi[1][6].setPiece(new Pion(1,0,7));
	 		echi[1][7].setPiece(new Pion(1,0,7));
	 
	 		echi[6][0].setPiece(new Pion(0,0,7));
	 		echi[6][1].setPiece(new Pion(0,0,7));
	 		echi[6][2].setPiece(new Pion(0,0,7));
	 		echi[6][3].setPiece(new Pion(0,0,7));
	 		echi[6][4].setPiece(new Pion(0,0,7));
	 		echi[6][5].setPiece(new Pion(0,0,7));
	 		echi[6][6].setPiece(new Pion(0,0,7));
	 		echi[6][7].setPiece(new Pion(0,0,7));
	 
	 
	 		echi[7][0].setPiece(new Tour(0,0,0));
	 		echi[7][1].setPiece(new Cavalier(0,0,1));
	 		echi[7][2].setPiece(new Fou(0,0,2));
	 		echi[7][3].setPiece(new Reine(0,0,3));
	 		echi[7][4].setPiece(new Roi(0,0,4));
	 		echi[7][5].setPiece(new Fou(0,0,5));
	 		echi[7][6].setPiece(new Cavalier(0,0,6));
	 		echi[7][7].setPiece(new Tour(0,0,7));
	 
	 	}
	  	
	 	public void afficher(){
	 		for(int i=0;i<8;i++){
	 			if(i%2!=0){System.out.print('\n');}
	 			for(int j=0;j<8;j++){
	 				if(echi[i][j].getPiece()!=null){

	 				String k=echi[i][j].toString();
	 				System.out.print(k);}
	 
	 	   }
	 
	 	}
	 	}

		public void deplacer(Piece p,Deplacement d){
			position t=d.GetArrive();
			position x=p.Getposition();
			if (p.EstValide(d)){
				echi[t.ligne][t.colonne]=p;
				echi[p.ligne][p.colonne]=null;
			}
		}//
}
	 	
	 
	 
	  