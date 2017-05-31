package projet_echecs;

public class Deplacement {
	private int DeplacementX;
	private int DeplacementY;
	private Position arrive;
	private Position depart;
	public Deplacement(Position depart,Position arrive){
		this.depart=depart;
		this.arrive=arrive;
		this.DeplacementX=arrive.Getcolonne() - depart.Getcolonne();
		this.DeplacementY=arrive.Getligne() - depart.Getligne();
	}
	public int GetDeplacementX(){
		return DeplacementX;
	}
	public int GetDeplacementY(){
		return DeplacementY;
	}
	public Position Getarrive(){
		return arrive;
	}
	public Position Getdepart(){
		return depart;
	}
	public boolean DeplacementNull(){
		return DeplacementX==0 && DeplacementY==0;
	}

}
