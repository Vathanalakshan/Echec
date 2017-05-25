
public class Echiquier {
	String tb1,cb1,fb1,db,rb,fb2,cb2,tb2,p1,p2,p3,p4,p5,p6,p7,p8;
	Case echi[][] = new Case[8][8];
	public Echiquier(){
		for (int i=0;i<8;i++)
		{
			for(int j=0;j<8;j++){
				echi[i][j]=(new Case(i,j,null));
			}
		}
		lancer();
		afficher();
	}
		
	public void lancer(){
		echi[0][0].setpiece(new Tour(true,0,0,tb1));
		echi[0][1].setpiece(new Cavalier(true,0,1,cb1));
		echi[0][2].setpiece(new Fou(true,0,2,fb1));
		echi[0][3].setpiece(new Reine(true,0,3,db));
		echi[0][4].setpiece(new Roi(true,0,4,rb));
		echi[0][5].setpiece(new Fou(true,0,5,fb2));
		echi[0][6].setpiece(new Cavalier(true,0,6,cb2));
		echi[0][7].setpiece(new Tour(true,0,7,tb2));
		
		echi[1][0].setpiece(new Pion(true,0,7,p1));
		echi[1][1].setpiece(new Pion(true,0,7,p2));
		echi[1][2].setpiece(new Pion(true,0,7,p3));
		echi[1][3].setpiece(new Pion(true,0,7,p4));
		echi[1][4].setpiece(new Pion(true,0,7,p5));
		echi[1][5].setpiece(new Pion(true,0,7,p6));
		echi[1][6].setpiece(new Pion(true,0,7,p7));
		echi[1][7].setpiece(new Pion(true,0,7,p8));

		echi[7][0].setpiece(new Pion(false,0,7,p1));
		echi[7][1].setpiece(new Pion(false,0,7,p2));
		echi[7][2].setpiece(new Pion(false,0,7,p3));
		echi[7][3].setpiece(new Pion(false,0,7,p4));
		echi[7][4].setpiece(new Pion(false,0,7,p5));
		echi[7][5].setpiece(new Pion(false,0,7,p6));
		echi[7][6].setpiece(new Pion(false,0,7,p7));
		echi[7][7].setpiece(new Pion(false,0,7,p8));


		echi[7][0].setpiece(new Tour(false,0,0,tb1));
		echi[7][1].setpiece(new Cavalier(false,0,1,cb1));
		echi[7][2].setpiece(new Fou(false,0,2,fb1));
		echi[7][3].setpiece(new Reine(false,0,3,db));
		echi[7][4].setpiece(new Roi(false,0,4,rb));
		echi[7][5].setpiece(new Fou(false,0,5,fb2));
		echi[7][6].setpiece(new Cavalier(false,0,6,cb2));
		echi[7][7].setpiece(new Tour(false,0,7,tb2));

	}
	
	public void afficher(){
		for(int i=0;i<8;i++){
			for(int j=0;j<8;j++){
				String k=echi[i][j].piece.nom;
				System.out.println(k);}

	   }

	}
	}
		
	



