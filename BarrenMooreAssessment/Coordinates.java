package BarrenMooreAssessment;

import java.util.Scanner;
import java.util.Random;;

public class Coordinates {
	
	
	
	public void Position() {
		
		int PlayerX = 50;
		int PlayerY = 50;
		int Health = 100;
		
		Random Rand = new Random();
		int TreasureX = Rand.nextInt(100);
		int TreasureY = Rand.nextInt(100);
		
		
		 System.out.println("Ye awaken young traveller in the middle of an olde barren moore in The Kingdom of Glasgow after a weekend sesh. Ye be stricken with a severe 'droof' and need to requisition");
		 System.out.println("the holy gourd of Irn Bru before ye 'conk oot'.The compass ye stole from thy mother's purse will guide ye on your quest. But be wary squire, Only the foolish dare ");
		 System.out.println("venture outwith the boundaries of the Barren moore.");
		 System.out.println("");
		 
		 
		 System.out.println("Your position on the grid is " + "X:" + PlayerX + " " + "Y:" + PlayerY );
			
			
			while(PlayerX != TreasureX || PlayerY != TreasureY || Health == 0) {
			Scanner sc=new Scanner(System.in);
			System.out.println("enter new X co-ordinates between 0 - 100.");
			
						
			int numX = sc.nextInt();
			PlayerX = numX;
			System.out.println("enter new Y co-ordinates between 0 - 100.");
						
			int numY = sc.nextInt();
			PlayerY = numY;
			
			System.out.println("your new position on the grid is " + "X:" + PlayerX + " " + "Y:" + PlayerY );
			Health -= 10;
			System.out.println("Your Health is at " + Health);
			
		    	    
	     if(PlayerY == TreasureY & PlayerX == TreasureX) {
			System.out.println("Ye have found the fabled receptacle which holdeth thy nectar of the gods, Irn Bru! Congratulations young squire!");
			break;
			}  
	     if (Health <= 0) {
	    	 System.out.println("you are pan breed young squire, thy sesh endeth in tragedy.");
	    	 System.out.println("The treasure was located at  X:" + TreasureX + " Y:" + TreasureY );
	    	 break;
	     }
	      if (PlayerX > 100) {
	    	 System.out.println("Ye have travelled too far East traveller, and ended up on the East coast, ye fall upon your own sword, rather than listen to that stupid accent.");
	    	 System.out.println("The treasure was located at  X:" + TreasureX + " Y:" + TreasureY );
	    	 break;
	     }
	      if (PlayerX < 0) {
	    	 System.out.println("Ye have travelled too far West traveller, and ended up in Ayrshire. Ye be slain by a roaming band of tattie pickers for having all your teeth and no needlemarks on thy arms.");
	    	 System.out.println("The treasure was located at  X:" + TreasureX + " Y:" + TreasureY );
	    	 break;
	     }
	     if (PlayerY > 100) {
	    	 System.out.println("Ye have travelled too far North traveller, and have ended up in the highlands, You marry a sheep and your family disowns you.");
	    	 System.out.println("The treasure was located at  X:" + TreasureX + " Y:" + TreasureY );
	    	 break;
	     }
	     if (PlayerY < 0) {
	    	 System.out.println("Ye have travelled too far South traveller and have ended up in Ibrox.The dead walk the streets and drag their knuckles. You succumb to the stench, tis a terrible place.");
	    	 System.out.println("The treasure was located at  X:" + TreasureX + " Y:" + TreasureY );
	    	 break;
	     }
	     if((PlayerY > TreasureY) & (PlayerX == TreasureX)) {
				System.out.println("The compass says 'go Directly south'.");
				System.out.println("------------------------------------");
		}
	     else if((PlayerY < TreasureY) & (PlayerX == TreasureX)) {
			System.out.println("The compass says 'go Directly north'.");
			System.out.println("------------------------------------");
		}
	     else if((PlayerX > TreasureX) & (PlayerY == TreasureY)) {
			System.out.println("The compass says 'go Directly west'.");
			System.out.println("-----------------------------------");
		}
	     else if((PlayerX < TreasureX) & (PlayerY == TreasureY)) {
			System.out.println("The compass says 'go Directly east'.");
			System.out.println("-----------------------------------");
		}
	     else if ((PlayerX > TreasureX) & (PlayerY > TreasureY)) {
			System.out.println("The compass says 'Go SouthWest'.");
			System.out.println("-------------------------------");
		}
	     else if ((PlayerX > TreasureX) & (PlayerY < TreasureY)) {
			System.out.println("The compass says 'Go NorthWest'.");
			System.out.println("-------------------------------");
		}
	     else if ((PlayerX < TreasureX) & (PlayerY > TreasureY)) {
			System.out.println("The compass says 'Go SouthEast'.");
			System.out.println("-------------------------------");
		}
	     else if((PlayerX < TreasureX) & (PlayerY < TreasureY)) {
			System.out.println("The compass says 'Go NorthEast'.");
			System.out.println("-------------------------------");
		}
		     
	     }
		 System.out.println("");
	     System.out.println("press enter to play again ");
	     System.out.println("____________________________________________________________________________________________________________________________________________________________________________________________________");
	     Scanner sc2=new Scanner(System.in);
	     String str2 = sc2.nextLine();
	     if(str2.valueOf("y") != null) {
	    	 Position();	    	 
	     }
	   
		
		
		}
			
			
	}
	

	


