package projet_echecs;


public class Echiquier {
	 	
	 	private Case echi[][] = new Case[8][8];
	 	public Echiquier(){
	 		for (int i=0;i<8;i++)
	 		{
	 			for(int j=0;j<8;j++){
	 				this.getEchi()[i][j]=new Case(); //Placement des cases sur l'echiquier
	 			}
	 		}
	 		lancer(); //Placement des pièces dans les cases de l'échiquier
	 		afficher();
	 	}
	 	
public boolean cheminLibre(int xi,int yi,int xf,int yf){
	
	
			int couleur=getEchi()[xi][yi].getPiece().Getcouleur();
	 		if (getEchi()[xi][yi].getPiece() instanceof Roi || getEchi()[xi][yi].getPiece() instanceof Cavalier){
	 			if(getEchi()[xf][yf].getPiece()!=null){
	 		 		if(getEchi()[xf][yf].getPiece().Getcouleur()==couleur){
	 		 			return false;
	 		 
	 		 		}
	 		 		}
	 			
	 			return true;
	 			
	 		}
	 		if(getEchi()[xf][yf].getPiece()!=null){
	 		if(getEchi()[xf][yf].getPiece().Getcouleur()==couleur){
	 			return false;
	 
	 		}
	 		}
	 		int distx=xf-xi;//Distance entre deux case
	 		int disty=yf-yi;//Distance entre deux case
	 		
	 		int dx=0;
	 		int dy=0;
	 		
	 		if (distx>0){dx=1;}//Haut vers bas
	 		if (distx<0){dx=-1;}//bas vers haut
	 		if (disty>0){dy=1;}// gauche vers droite
	 		if (disty<0){dy=-1;}// droite vers gauche
	 		
	 		int cntrx=xi;
	 		int cntry=yi;
	 		
	 		if (disty==0){//deplacement vertical
	 			cntrx=cntrx+dx;
	 			for(int i=1;i<Math.abs(distx);i++){		
	 			 if(echi[cntrx][cntry].getPiece()!=null){
	 				 System.out.println("Chemin vertical nonlibre");
	 				 return false;
	 			 }
	 			 cntrx=cntrx+dx;
	 			}
	 		}
	 		
	 		if (distx==0){//deplacement horizantal
	 			cntry=cntry+dy;
	 			for(int i=1;i<Math.abs(disty);i++){
	 			 if( echi[cntrx][cntry].getPiece()!=null){
	 				 System.out.println("Chemin horizontal nonlibre");
	 				 return false;
	 			 }
	 			 cntry=cntry+dy;
	 			}
	 		}
	 		if (distx!=0 && disty!=0){//deplacement diagonale
	 			cntrx=cntrx+dx;
	 			cntry=cntry+dy;
				 System.out.println(cntrx);
 				 System.out.println(cntry);

	 			for(int i=1;i<Math.abs(distx);i++){
	 			 if( echi[cntrx][cntry].getPiece()!=null){

	 				 System.out.println(echi[cntrx][cntry].getPiece());
	 				 System.out.println("Chemin diagonale nonlibre");
	 				 return false;
	 			 }
				 System.out.println(cntrx);
 				 System.out.println(cntry);
	 			 cntrx=cntrx+dx;
	 			 cntry=cntry+dy;
	 			}
	 		}
	 		return true;

	 		}

	 	public boolean memeCouleur(int xi,int xf,int yi,int yf){
	 		int a=(getEchi()[xi][yi].getPiece().Getcouleur());
	 		int b=(getEchi()[xf][yf].getPiece().Getcouleur());
	 		if(a==b){
 				System.out.println("Les cases de départ et arrivée contiennt une piece de la meme couleur");
 				return false;}
	 		return true;
	 	}	 	
/**
 * Methode capture par un pion possible, verifie si le deplacement d'un pion en diagonale est valide.
 * Donc, il verifie si une piece d'une couleur contraire au pion se trouve a sa diagonale, si oui, le deplacement
 * est accepte
 * @param Deplacement du pion
 * @return vrai ou faux si le pion peut manger la piece ou non
 */
public boolean captureParUnPionPossible(int xi,int yi,int xf,int yf) {
	//Je vŽrifie si la pice est un pion
	if(getEchi()[xi][yi].getPiece() instanceof Pion)
	{
		//initialisation des variables dont j'aurai besoin dans mes conditions, ˆ savoir la couleur de la pice de dŽpart et la case d'arrivŽ.
		Case Arrive = getEchi()[xf][yf];
		int couleurDepart = getEchi()[xi][yi].getPiece().Getcouleur();
		
		//je vŽrifie d'abord si la pice d'arrivŽ existe et si elle est de la couleur contraire de celle de dŽpart.
		if(!Arrive.estOccupe(couleurDepart))
			/*Je vérifie si le dŽplacement est valide, 
			 *Le dŽplacement est valide si le produits du dŽplacement x et y donne 1 si la couleur de dŽpart est noir
			 *ou -1 si la pice de départ est blanche. 
			 */
			if((xf==xi+1) && (yf==yi+1) && couleurDepart==1)
				return true;
		if((xf==xi-1) && (yf==yi-1) && couleurDepart==0)
			return true;
	}
	return false;
	
}
		public boolean Peutetredeplacer(int xi,int yi,int xf,int yf){
			if(getEchi()[xi][xf].getPiece()==null){return false;}
			if (getEchi()[xi][yi].getPiece().moveValable(xi,yi,xf,yf)==true   && cheminLibre(xi,yi,xf,yf)){//verfie le deplacement est valable pour la piece
	 			return true;
	 		}
	 		else if(getEchi()[xi][yi].getPiece() instanceof Pion && captureParUnPionPossible(xi,yi,xf,yf) ){
	 			return true;
	 		}
			
	 		else 
	 			return false;
			
		}


	 	
	 	public void deplacer(int xi,int yi,int xf,int yf){//i=initial f=final x,y position
 			

	 		if (getEchi()[xi][yi].getPiece().moveValable(xi,yi,xf,yf)==true   && cheminLibre(xi,yi,xf,yf)){//verfie le deplacement est valable pour la piece
	 			Piece temp=getEchi()[xi][yi].getPiece();
	 			getEchi()[xf][yf].setPiece(temp);//met la piece qui est dans les coordonnéée inital dans le coordonnéé nouvelle
	 			getEchi()[xi][yi].setPiece(null);//detruit la piece qui etait dans la coordonnée initiales
	 		
	 		}
	 		else if(getEchi()[xi][yi].getPiece() instanceof Pion && captureParUnPionPossible(xi,yi,xf,yf) ){
	 			Piece temp1=getEchi()[xi][yi].getPiece();
	 			getEchi()[xf][yf].setPiece(temp1);//met la piece qui est dans les coordonnéée inital dans le coordonnéé nouvelle
	 			getEchi()[xi][yi].setPiece(null);//detruit la piece qui etait dans la coordonnée initiales
	 		}
	 		else 
	 			System.out.println("deplacement impossible");
	 	}
	 	
	 	
	 
	 		
	 	public void lancer(){
	 		getEchi()[0][0].setPiece(new Tour(0,0,0)); 
	 		getEchi()[0][1].setPiece(new Cavalier(0,0,1));
	 		getEchi()[0][2].setPiece(new Fou(0,0,2));
	 		getEchi()[0][3].setPiece(new Reine(0,0,3));
	 		getEchi()[0][4].setPiece(new Roi(0,0,4));
	 		getEchi()[0][5].setPiece(new Fou(0,0,5));
	 		getEchi()[0][6].setPiece(new Cavalier(0,0,6));
	 		getEchi()[0][7].setPiece(new Tour(0,0,7));

	 		getEchi()[1][0].setPiece(new Pion(0,1,7));
	 		getEchi()[1][1].setPiece(new Pion(0,1,7));
	 		getEchi()[1][2].setPiece(new Pion(0,1,7));
	 		getEchi()[1][3].setPiece(new Pion(0,1,7));
	 		getEchi()[1][4].setPiece(new Pion(0,1,7));
	 		getEchi()[1][5].setPiece(new Pion(0,1,7));
	 		getEchi()[1][6].setPiece(new Pion(0,1,7));
	 		getEchi()[1][7].setPiece(new Pion(0,1,7));
	 
	 		getEchi()[6][0].setPiece(new Pion(1,0,7));
	 		getEchi()[6][1].setPiece(new Pion(1,0,7));
	 		getEchi()[6][2].setPiece(new Pion(1,0,7));
	 		getEchi()[6][3].setPiece(new Pion(1,0,7));
	 		getEchi()[6][4].setPiece(new Pion(1,0,7));
	 		getEchi()[6][5].setPiece(new Pion(1,0,7));
	 		getEchi()[6][6].setPiece(new Pion(1,0,7));
	 		getEchi()[6][7].setPiece(new Pion(1,0,7));
	 
	 	

	 		getEchi()[7][0].setPiece(new Tour(1,0,0));
	 		getEchi()[7][1].setPiece(new Cavalier(1,0,1));
	 		getEchi()[7][2].setPiece(new Fou(1,0,2));
	 		getEchi()[7][3].setPiece(new Reine(1,0,3));
	 		getEchi()[7][4].setPiece(new Roi(1,0,4));
	 		getEchi()[7][5].setPiece(new Fou(1,0,5));
	 		getEchi()[7][6].setPiece(new Cavalier(1,0,6));
	 		getEchi()[7][7].setPiece(new Tour(1,0,7));
	 		
	 	}
	  	
	 	public void afficher(){


	 		int cpt = 0;

	 		for(int i=0;i<8;i++){
	 			if(i==0)
		 			System.out.print("     A    B    C    D    E    F    G    H \n"+ "  ┌────┬────┬────┬────┬────┬────┬────┬────┐");
	 			if(i>=1){
		 			System.out.print("\n  ├────┼────┼────┼────┼────┼────┼────┼────┤");

	 			}

	 			System.out.print("\n");
	 			for(int j=0;j<8;j++){
	 				if(i==0 && cpt == 0){
	 					System.out.print("1 │");
	 				cpt++;
	 				}
	 				if(i==1 && cpt == 1){
	 					System.out.print("2 │");
	 				cpt++;
	 				}
	 				if(i==2 && cpt == 2){
	 					System.out.print("3 │");
	 				cpt++;
	 				}
	 				if(i==3 && cpt == 3){
	 					System.out.print("4 │");
	 				cpt++;
	 				}
	 				if(i==4 && cpt == 4){
	 					System.out.print("5 │");
	 				cpt++;
	 				}
	 				if(i==5 && cpt == 5){
	 					System.out.print("6 │");
	 				cpt++;
	 				}
	 				if(i==6 && cpt == 6){
	 					System.out.print("7 │");
	 				cpt++;
	 				}
	 				if(i==7 && cpt == 7){
	 					System.out.print("8 │");
	 				cpt++;
	 				}
	 				if(!getEchi()[i][j].estOccupe()){
	 					System.out.print("    │");
	 				}
	 				if(getEchi()[i][j].getPiece()!=null){

	 				String k=getEchi()[i][j].toString();
	 				System.out.print("      "+k+ "    │");
}

	 	   }

	 	}
				System.out.print("\n  └────┴────┴────┴────┴────┴────┴────┴────┘");
				System.out.print("\n\n");
				

	 	}

		/**
		 * @return the echi
		 */
		public Case[][] getEchi() {
			return echi;
		}

		/**
		 * @param echi the echi to set
		 */
		public void setEchi(Case echi[][]) {
			this.echi = echi;
		}
}
	 	
	 
	 
	  