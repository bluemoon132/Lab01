package hust.soict.hedspi.aism.media;

import java.util.Scanner;

import hust.soict.hedspi.aism.media.dvd.DigitalVideoDisc;

public class DVDFactory implements AbstractItemFactory{
	private static int idCount = 0;
	public DigitalVideoDisc createMediaItemFromConsole() {
        Scanner sc = new Scanner(System.in);
		
        System.out.print("Enter title: "); String title = sc.nextLine();
        System.out.print("Enter category: "); String category = sc.nextLine();
        System.out.print("Enter Cost: "); float cost = sc.nextFloat();
        sc.nextLine();
	    System.out.print("Enter director: "); String director = sc.nextLine();
        System.out.print("Enter length: "); int length = sc.nextInt();
        idCount++;
        DigitalVideoDisc disc = new DigitalVideoDisc(idCount,title,category,director,length,cost);
        
        System.out.println("Do you want to play?\n1.Yes  2.No");
        System.out.print("You choose: ");
        int select = sc.nextInt();
        sc.nextLine();
        boolean checkd = true;
        do{
            switch(select){
                case 1:
                    disc.play();
                    checkd = false;
                    break;
                case 2:
                    checkd = false;
                    break;
                default:
                    System.out.println("Enter incorrectly, re-enter");
                    break; 
            }
        }while(checkd);
        sc.close();
        return disc;
	}

}
