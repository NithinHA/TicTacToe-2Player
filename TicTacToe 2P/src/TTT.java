import java.util.*;

public class TTT {
	static int row, col;
	
	public static void main(String[]args){
		Scanner in = new Scanner(System.in);
		int a[][] = new int[10][10];
		
		while(true){
			Reset(a);
			Display(a);
			Gameplay(a);
		}
	}
	
	static void Reset(int a[][]){
		System.out.println("\n***Tic-tac-Toe***");
		for(int i=1; i<=3; i++)
			for(int j=1; j<=3; j++)
				a[i][j] = 0;
	}
	
	static void Display(int a[][]){
		System.out.println();
		System.out.println(" +---+---+---+");
		for(int i=1; i<=3; i++){
			for(int j=1; j<=3; j++){
				if(a[i][j] == 0)
					System.out.print(" | "+" ");
				else if(a[i][j] == 1)
					System.out.print(" | "+"O");
				else
					System.out.print(" | "+"X");
			}
			System.out.println(" |");
			System.out.println(" +---+---+---+");
		}
		System.out.println();
	}
	
	static void Gameplay(int a[][]){
		Scanner in = new Scanner(System.in);
		int endgame;
		for(int rep=1; rep<=5; rep++){
			Player1(a);
			Display(a);
			
			int temp = check(a);
			switch(temp){
			case 22: System.out.println("Player 2 Wins!");
					 
					 System.out.println("1 - Reset\n2 - Exit");
					 endgame = in.nextInt();
					 if(endgame == 1)
						 return;
					 else if(endgame == 2)
						 System.exit(0);
					 else
						 System.out.println();
			
			case 11: System.out.println("Player 1 Wins!");
					 
					 System.out.println("1 - Reset\n2 - Exit");
					 endgame = in.nextInt();
					 if(endgame == 1)
						 return;
					 else if(endgame == 2)
						 System.exit(0);
					 else
						 System.out.println();
			
			case 12: System.out.println("Draw");
					 
					 System.out.println("1 - Reset\n2 - Exit");
					 endgame = in.nextInt();
					 if(endgame == 1)
						 return;
					 else if(endgame == 2)
						 System.exit(0);
					 else
						 System.out.println();
			
			case 100: break;
			
			default:System.out.println("Not possible");
			}
			
			Player2(a);
			Display(a);
			
			temp = check(a);
			switch(temp){
			case 22: System.out.println("Player 2 Wins!\n");
					 
					 System.out.println("1 - Reset\n2 - Exit");
					 endgame = in.nextInt();
					 if(endgame == 1)
						 return;
					 else if(endgame == 2)
						 System.exit(0);
					 else
						 System.out.println();
			
			case 11: System.out.println("Player 1 Wins!");

			 		 System.out.println("1 - Reset\n2 - Exit");
			 		 endgame = in.nextInt();
			 		 if(endgame == 1)
			 			 return;
			 		 else if(endgame == 2)
			 			 System.exit(0);
			 		 else
			 			 System.out.println();
			
			case 12: System.out.println("Draw");
					 
					 System.out.println("1 - Reset\n2 - Exit");
					 endgame = in.nextInt();
					 if(endgame == 1)
						 return;
					 else if(endgame == 2)
						 System.exit(0);
					 else
						 System.out.println();
			
			case 100: break;
			
			default:System.out.println("Not possible");
			}
		}
	}
	
	static void Player1(int a[][]){
		Scanner in = new Scanner(System.in);
		
		System.out.println("Place X-");
		System.out.print("row:");	int r = in.nextInt();
		System.out.print("col:");	int c = in.nextInt();
		while(((r>3)||(c>3)||(r<1)||(c<1)) || (a[r][c] != 0)){
			while((r>3)||(c>3)||(r<1)||(c<1)){
				System.out.println("val range:1-3");
				System.out.print("row:");	r = in.nextInt();
				System.out.print("col:");	c = in.nextInt();
			}
		
			while(a[r][c] != 0){
				System.out.println("Space already used");
				System.out.print("row:");	r = in.nextInt();
				System.out.print("col:");	c = in.nextInt();
			}
		}
		a[r][c] = 2;
	}
	
	static int check(int a[][]){
		for(int i=1; i<=3; i++){
			for(int j=1; j<=3; j++){
				if((a[i][j]==1 && a[i][j+1]==1 && a[i][j+2]==1)||
				   (a[i][j]==1 && a[i+1][j]==1 && a[i+2][j]==1)||
				   (a[i][i]==1 && a[i+1][i+1]==1 && a[i+2][i+2]==1)||
				   (a[1][3]==1 && a[2][2]==1 && a[3][1]==1))
					return 11;
				
				else if((a[i][j]==2 && a[i][j+1]==2 && a[i][j+2]==2)||
				   (a[i][j]==2 && a[i+1][j]==2 && a[i+2][j]==2)||
				   (a[i][i]==2 && a[i+1][i+1]==2 && a[i+2][i+2]==2)||
				   (a[1][3]==2 && a[2][2]==2 && a[3][1]==2))
					return 22;
			}
		}
		
		for(int i=1; i<=3; i++){
			for(int j=1; j<=3; j++){
				if(a[i][j] == 0)
					return 100;
			}
		}
		
		return 12;
	}
	
	static void Player2(int a[][]){
		Scanner in = new Scanner(System.in);
		
		System.out.println("Place O-");
		System.out.print("row:");	int r = in.nextInt();
		System.out.print("col:");	int c = in.nextInt();
		
		while(((r>3)||(c>3)||(r<1)||(c<1)) || (a[r][c] != 0)){
			while((r>3)||(c>3)||(r<1)||(c<1)){
				System.out.println("val range:1-3");
				System.out.print("row:");	r = in.nextInt();
				System.out.print("col:");	c = in.nextInt();
			}
		
			while(a[r][c] != 0){
				System.out.println("Space already used");
				System.out.print("row:");	r = in.nextInt();
				System.out.print("col:");	c = in.nextInt();
			}
		}
		
		a[r][c] = 1;
	}
}