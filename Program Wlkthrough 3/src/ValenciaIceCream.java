import java.util.Scanner;

public class ValenciaIceCream {
	private int[][] bonusTable;
	private int weeks;
	private int reviews;
	
	
public ValenciaIceCream() {
		this.bonusTable = makeBonusTable();
		holdMethods();
	}

//getters and setters
public int[][] getBonusTable() {
	return bonusTable;
}


public void setBonusTable(int[][] bonusTable) {
	this.bonusTable = bonusTable;
}

public int getWeeks() {
	return weeks;
}

public void setWeeks(int weeks) {
	this.weeks = weeks;
}

public int getReviews() {
	return reviews;
}

public void setReviews(int reviews) {
	this.reviews = reviews;
}
//end getters and setters
public void holdMethods() {
	Scanner scnr = new Scanner(System.in);
	int bonus = 0;
	int totalBonus = 0;
	int value;
	
	do {
		askBonusFactors();
		bonus = findBonus();
		System.out.println("--Your bonus is $" + bonus);
		totalBonus += bonus;
		
		//ask users if they continue sentinel value is -1
		System.out.println("*Enter any values to continue (-1 to exit): ");
		value = scnr.nextInt();
	}while(value != -1);
	
	System.out.println("The total amount of bonuses paid out is $" + totalBonus);
}
public int findBonus() {	
	//fixes the end values for the bonus
	if(getWeeks() >= 6) {
		setWeeks(6);
	}
	if(getReviews() >= 4) {
		setReviews(4);
	}
	
	//return the bonus on the table
	return getBonusTable()[getWeeks()][getReviews()];
}

public void askBonusFactors() {
	Scanner scnr = new Scanner(System.in);
	int weeksWorked;
	int reviewsReceived;
	
	//ask weeks worked
	do {
		System.out.println("How many weeks did you work: ");
		weeksWorked = scnr.nextInt();
	}while(weeksWorked < 0);
	this.weeks = weeksWorked;
	
	//ask reviews received
	do {
		System.out.println("Enter the number of positive customer reviews: ");
		reviewsReceived = scnr.nextInt();
	}while(reviewsReceived < 0);
	this.reviews = reviewsReceived;

}//end bonusFactors 
public int[][] makeBonusTable(){
	int[][] table = new int[7][5];
	
	//row = weeks, column = reviews
	
	//insert values into the table
	table[0][0] = 25;
	table[0][1] = 45;
	table[0][2] = 80;
	table[0][3] = 110;
	table[0][4] = 150;
	
	table[1][0] = 50;
	table[1][1] = 60;
	table[1][2] = 90;
	table[1][3] = 120;
	table[1][4] = 185;
	
	table[2][0] = 100;
	table[2][1] = 125;
	table[2][2] = 160;
	table[2][3] = 210;
	table[2][4] = 265;
	
	table[3][0] = 160;
	table[3][1] = 190;
	table[3][2] = 225;
	table[3][3] = 275;
	table[3][4] = 340;
	
	table[4][0] = 230;
	table[4][1] = 270;
	table[4][2] = 325;
	table[4][3] = 385;
	table[4][4] = 450;
	
	table[5][0] = 300;
	table[5][1] = 360;
	table[5][2] = 420;
	table[5][3] = 480;
	table[5][4] = 600;
	
	table[6][0] = 425;
	table[6][1] = 495;
	table[6][2] = 600;
	table[6][3] = 715;
	table[6][4] = 875;
	//end insert values into the table
	return table;
}//makeBonusTable method
}//end ValenciaIceCream class