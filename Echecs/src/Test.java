package projet_echecs;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	String historique = "";	
	Echiquier ex=new Echiquier();
	System.out.print(ex);
	System.out.print('\n');
	int i=0;
	while(i<1000){
		if(i%2==0){
			System.out.println("c'est au tour des blancs de jouer:");
			Scanner sc=new Scanner(System.in);
	 		System.out.println("quel piece voulez vous deplacer :");
	 		String str=sc.nextLine();
	 		Scanner scs=new Scanner(System.in);
	 		System.out.println("ou voulez vous la deplacer :");
	 		String str2=sc.nextLine();
	 		
	 		while(str.length()!=2 || str2.length()!=2 || (int)str.charAt(0)<65 || (int)str.charAt(0)>72 || (int)str2.charAt(0)>72 || (int)str2.charAt(0)<65 ||
	 				(int)str.charAt(1)<49 || (int)str2.charAt(1)<49 || (int)str.charAt(1)>57 || (int)str2.charAt(1)>57 || ex.getEchi()[(int)str.charAt(1)-49][(int)str.charAt(0)-65].estOccupe(0)|| !ex.Peutetredeplacer((int)str.charAt(1)-49,(int)str.charAt(0)-65,(int)str2.charAt(1)-49,(int)str2.charAt(0)-65)){
	 			System.out.println("saisie incorrecte ou deplacement impossible recommencer");
	 			System.out.println("quel piece voulez vous deplacer :");																									
		 		str=sc.nextLine();
		 		System.out.println("ou voulez vous la deplacer :");
		 		str2=sc.nextLine();
	 			
	 		}
	 		historique=historique+" blanc: deplacement "+ex.getEchi()[(int)str.charAt(1)-49][(int)str.charAt(0)-65].getPiece().Getnom()+" "+ str +" en " + str2 + "\n";
	 		ex.deplacer((int)str.charAt(1)-49,(int)str.charAt(0)-65,(int)str2.charAt(1)-49,(int)str2.charAt(0)-65);
	 		
		}
		else{
		System.out.println("c'est au tour des noirs de jouer:");
		Scanner sc=new Scanner(System.in);
 		System.out.println("quel piece voulez vous deplacer :");
 		String str_noir=sc.nextLine();
 		Scanner scs=new Scanner(System.in);
 		System.out.println("ou voulez vous la deplacer :");
 		String str2_noir=sc.nextLine();
 		
 		while((int)str_noir.charAt(0)<65 || (int)str_noir.charAt(0)>72 || (int)str2_noir.charAt(0)>72 || (int)str2_noir.charAt(0)<65 ||
 				(int)str_noir.charAt(1)<49 || (int)str2_noir.charAt(1)<49 || (int)str_noir.charAt(1)>57 || (int)str2_noir.charAt(1)>57 || 
 				ex.getEchi()[(int)str2_noir.charAt(1)-49][(int)str_noir.charAt(0)-65].estOccupe(1) || !ex.Peutetredeplacer((int)str_noir.charAt(1)-49,(int)str_noir.charAt(0)-65,(int)str2_noir.charAt(1)-49,(int)str2_noir.charAt(0)-65) ){
 			
 			
 			System.out.println("saisie incorrecte ou deplacement impossible recommencer");
 			System.out.println("quel piece voulez vous deplacer :");
	 		str_noir=sc.nextLine();
	 		System.out.println("ou voulez vous la deplacer :");
	 		str2_noir=sc.nextLine();
 			
 		}
 		
 		historique=historique + "noir: deplacement "+ex.getEchi()[(int)str_noir.charAt(1)-49][(int)str_noir.charAt(0)-65].getPiece().Getnom()+" "+ str_noir +" en " + str2_noir +"\n";
 		ex.deplacer((int)str_noir.charAt(1)-49,(int)str_noir.charAt(0)-65,(int)str2_noir.charAt(1)-49,(int)str2_noir.charAt(0)-65);
 		
		}
 		ex.afficher();
 		System.out.println(historique);
	i++;
		
	}

	}

}


