
public class Echiquier {
	String tb1,cb1,fb1,db,rb,fb2,cb2,tb2,p1,p2,p3,p4,p5,p6,p7,p8;
	Piece [][] echi;
	public Echiquier(){
		echi=new Piece[8][8];
		lancer();
		afficher();
	}
		
		
	
		
	public void lancer(){
		echi[0][0]=(new Tour(true,0,0,tb1));
		echi[0][1]=(new Cavalier(true,0,1,cb1));
		echi[0][2]=(new Fou(true,0,2,fb1));
		echi[0][3]=(new Reine(true,0,3,db));
		echi[0][4]=(new Roi(true,0,4,rb));
		echi[0][5]=(new Fou(true,0,5,fb2));
		echi[0][6]=(new Cavalier(true,0,6,cb2));
		echi[0][7]=(new Tour(true,0,7,tb2));
		
		echi[1][0]=(new Pion(true,1,0,p1));
		echi[1][1]=(new Pion(true,1,1,p2));
		echi[1][2]=(new Pion(true,1,2,p3));
		echi[1][3]=(new Pion(true,1,3,p4));
		echi[1][4]=(new Pion(true,1,4,p5));
		echi[1][5]=(new Pion(true,1,5,p6));
		echi[1][6]=(new Pion(true,1,6,p7));
		echi[1][7]=(new Pion(true,1,7,p8));

		echi[6][0]=(new Pion(false,0,7,p1));
		echi[6][1]=(new Pion(false,0,7,p2));
		echi[6][2]=(new Pion(false,0,7,p3));
		echi[6][3]=(new Pion(false,0,7,p4));
		echi[6][4]=(new Pion(false,0,7,p5));
		echi[6][5]=(new Pion(false,0,7,p6));
		echi[6][6]=(new Pion(false,0,7,p7));
		echi[6][7]=(new Pion(false,0,7,p8));


		echi[7][0]=(new Tour(false,0,0,tb1));
		echi[7][1]=(new Cavalier(false,0,1,cb1));
		echi[7][2]=(new Fou(false,0,2,fb1));
		echi[7][3]=(new Reine(false,0,3,db));
		echi[7][4]=(new Roi(false,0,4,rb));
		echi[7][5]=(new Fou(false,0,5,fb2));
		echi[7][6]=(new Cavalier(false,0,6,cb2));
		echi[7][7]=(new Tour(false,0,7,tb2));

	}
	
	public void afficher(){
		for(int i=0;i<8;i++){
			for(int j=0;j<8;j++){
				Piece k=echi[i][j];
				System.out.print(k);}

	   }
		System.out.println();
	}
	
	public static void main(String[] args){
		new Echiquier();
	}
	}
		
	



