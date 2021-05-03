package hust.soict.hedspi.aism.media;

import java.util.ArrayList;
import java.util.Scanner;

import hust.soict.hedspi.aism.media.cd.CompactDisc;
import hust.soict.hedspi.aism.media.disc.Track;

public class CDFactory implements AbstractItemFactory {
	private static int idCount = 0;
	@Override
    public CompactDisc createMediaItemFromConsole() {
        Scanner sc = new Scanner(System.in);
        sc.nextLine();
        System.out.print("Enter title: "); String title = sc.nextLine();
        System.out.print("Enter category: "); String category = sc.nextLine();
        System.out.print("Enter Cost: "); float cost = sc.nextFloat();
        sc.nextLine();
        System.out.print("Enter director: "); String director = sc.nextLine();
        System.out.print("Enter artist: "); String artist = sc.nextLine();
        System.out.print("Enter the number of tracks: "); int number = sc.nextInt();
        ArrayList<Track> tracks = new ArrayList<>();
        sc.nextLine();
        for(int i = 0; i < number ; i++){
            System.out.print("Enter title of track: "); String titletrask = sc.nextLine();
            System.out.print("Enter length of track: "); int lengthtrack = sc.nextInt();
            sc.nextLine();
            Track track = new Track(titletrask,lengthtrack);
            tracks.add(track);
        }
        idCount++;
        CompactDisc cd = new CompactDisc(idCount,title,category,cost,director,artist,tracks);
        cd.getLength(tracks);
        System.out.println("Do you want to play?\n1.Yes  2.No");
        System.out.print("You choose: ");
        int select = sc.nextInt();
        sc.nextLine();
        boolean checkd = true;
        do{
            switch(select){
                case 1:
                    cd.play();
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
        return cd;
    }
}
