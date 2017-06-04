package projet_echecs;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
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
	 				(int)str.charAt(1)<49 || (int)str2.charAt(1)<49 || (int)str.charAt(1)>57 || (int)str2.charAt(1)>57 || ex.getEchi()[(int)str.charAt(0)-65][(int)str.charAt(1)-49].estOccupe(0)){
	 			System.out.println("saisie incorrecte recommencer");
	 			System.out.println("quel piece voulez vous deplacer :");
		 		str=sc.nextLine();
		 		System.out.println("ou voulez vous la deplacer :");
		 		str2=sc.nextLine();
	 			
	 		}
	 		
	 		ex.deplacer((int)str.charAt(0)-65,(int)str.charAt(1)-49,(int)str2.charAt(0)-65,(int)str2.charAt(1)-49);
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
 				(int)str_noir.charAt(1)<49 || (int)str2_noir.charAt(1)<49 || (int)str_noir.charAt(1)>57 || (int)str2_noir.charAt(1)>57 ){
 			System.out.println("saisie incorrecte recommencer");
 			System.out.println("quel piece voulez vous deplacer :");
	 		str_noir=sc.nextLine();
	 		System.out.println("ou voulez vous la deplacer :");
	 		str2_noir=sc.nextLine();
 			
 		}
 		
 		ex.deplacer((int)str_noir.charAt(0)-65,(int)str_noir.charAt(1)-49,(int)str2_noir.charAt(0)-65,(int)str2_noir.charAt(1)-49);
		}
 		
 		ex.afficher();
	i++;
		
	}

	}

}


