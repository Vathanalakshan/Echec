package projet_echecs;

public class Echiquier {
	 	
	 	private Case echi[][] = new Case[8][8];
	 	public Echiquier(){
	 		for (int i=0;i<8;i++)
	 		{
	 			for(int j=0;j<8;j++){
	 				this.echi[i][j]=new Case(); //Placement des cases sur l'echiquier
	 			}
	 		}
	 		lancer(); //Placement des pièces dans les cases de l'échiquier
	 		afficher();
	 		deplacer(0, 0, 1, 0);
	 	}
	 	
	 	public boolean cheminlibre(int xi,int xf,int yi,int yf){//chemin libre a utiliser pour fou/tour/reine
	 		if(xi==xf){//deplacement horizantale
	 			if (yf-yi>0){//deplacement de gauche a droite
	 				for(int i=1;i<(yf-yi);i++)//nombre de case a verifier si c vide
	 					if(echi[xi][yi+i].estOccupe()==true)//verfi si case occupé
	 						return false;
	 			}
	 			if (yf-yi<0){// deplacement de droite a gauche
	 				for(int i=1;i<(yi-yf);i++){//nmbre de case a verifer si vide
	 					if(echi[xi][yf-i].estOccupe()==true)//verifie si case occupé
	 						return false;
	 				}
	 			}
	 		}
	 			if(yi==yf){//deplacement vertical
		 			if (xf-xi>0){//deplamcemet de haut vers bas
		 				for(int i=1;i<(xf-xi);i++)//nbre de case a verifier
		 					if(echi[xi+i][yi].estOccupe()==true)//verifie si case occupé
		 						return false;
		 			}
		 			if (xf-xi<0){//deplacement bas vers haut
		 				for(int i=1;i<(xi-xf);i++){//nbre de case a verifier
		 					if(echi[xf-i][yf].estOccupe()==true)//verifie si case occupé
		 						return false;
		 				}
		 			}}
	 		if(xf-xi>0 && yf-yi>0){//deplacement diagonale ver bas et droite
	 			for(int i=1;i<(xf-xi);i++)
	 				if(echi[xi+i][yi+i].estOccupe()==true)
	 					return true;
	 		}
	 		if(xf-xi<0 && yf-yi<0){//deplacement diagonale vers  haut et gauche
	 			for(int i=1;i<(xi-xf);i++)
	 			if(echi[xi-i][yi-i].estOccupe()==true)
	 				return true;
	 		}
	 		if(xf-xi<0 && yf-yi>0){//deplacement diagonale ver haut et droit
	 			for(int i=1;i<(yf-yi);i++){
	 				if(echi[xi-i][yi+i].estOccupe()==true)
	 					return true;
	 			}
	 		}
	 		if(xf-xi>0 && yf-yi<0){//deplacement vers bas et gauche
	 			for(int i=1;i<(xf-xi);i++){
	 				if(echi[xi+i][yi-i].estOccupe()==true)
	 					return true;
	 			}
	 		}

	 		return false;
	 	}
	 	
	 	
	 	public void deplacer(int xi,int yi,int xf,int yf){//i=initial f=final x,y position
 			System.out.print("ok1");

	 		if (echi[xi][yi].getPiece().moveValable(xi,yi,xf,yf)==true){//verfie le deplacement est valable pour la piece
	 			Piece temp=echi[xi][yi].getPiece();
	 			echi[xf][yf].setPiece(temp);//met la piece qui est dans les coordonnéée inital dans le coordonnéé nouvelle
	 			echi[xi][yi].setPiece(null);//detruit la piece qui etait dans la coordonnée initiales
	 			System.out.print("ok2");

	 		}
	 		else 
	 			System.out.print("impposible");
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
	 		int cpt = 0; 
	 		
	 		for(int i=0;i<8;i++){
	 			if(i==0)
		 			System.out.print("    1   2   3   4   5   6   7   8 ");
	 			if(i>=1){
		 			System.out.print("|");

	 			}
	 			
	 			System.out.print("\n");
	 			for(int j=0;j<8;j++){
	 				if(i==0 && cpt == 0){
	 					System.out.print("A ");
	 				cpt++;
	 				}
	 				if(i==1 && cpt == 1){
	 					System.out.print("B ");
	 				cpt++;
	 				}
	 				if(i==2 && cpt == 2){
	 					System.out.print("C ");
	 				cpt++;
	 				}
	 				if(i==3 && cpt == 3){
	 					System.out.print("D ");
	 				cpt++;
	 				}
	 				if(i==4 && cpt == 4){
	 					System.out.print("E ");
	 				cpt++;
	 				}
	 				if(i==5 && cpt == 5){
	 					System.out.print("F ");
	 				cpt++;
	 				}
	 				if(i==6 && cpt == 6){
	 					System.out.print("G ");
	 				cpt++;
	 				}
	 				if(i==7 && cpt == 7){
	 					System.out.print("H ");
	 				cpt++;
	 				}
	 				if(!echi[i][j].estOccupe()){
	 					System.out.print("| - ");
	 				}
	 				if(echi[i][j].getPiece()!=null){

	 				String k=echi[i][j].toString();
	 				System.out.print("| "+k+ " ");
}
	 
	 	   }
	 
	 	}
				System.out.print("|\n\n");

	 	}
}
	 	
	 
	 
	  