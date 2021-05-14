package hust.soict.hedspi.aims.order;

import java.security.spec.RSAOtherPrimeInfo;
import java.util.*;

import hust.soict.hedspi.aims.PlayerException;
import hust.soict.hedspi.aism.media.Media;
import hust.soict.hedspi.aism.media.book.Book;
import hust.soict.hedspi.aism.media.cd.CompactDisc;
import hust.soict.hedspi.aism.media.disc.Track;
import hust.soict.hedspi.aism.media.dvd.DigitalVideoDisc;

import javax.naming.LimitExceededException;
import java.util.ArrayList;
import java.util.Random;

public class Order {
	public static final int MAX_NUMBER_ORDERED = 10;
	public static final int MAX_LIMITED_ORDERED = 5;
	private static int nbOrdered = 0;
	private int luckyItem = 0;
	public ArrayList<Media> listOfItems = new ArrayList<Media>(MAX_NUMBER_ORDERED);
	Scanner sc = new Scanner(System.in);
	
	public int getLuckyItem() {
	    return luckyItem;
	}
	
	public ArrayList<Media> getlistOfItems() {
        return listOfItems;
    }
	
	public static boolean checkNumberOfOrder() {
        return (nbOrdered < 5);
    }
	
	public Order(){
	    try {
            nbOrdered++;
        } catch(Exception e) {
            System.out.println(e.getMessage());
        }
    }
	
	public void verifyOrderedItem() {
        int dem = listOfItems.size();
        if (dem < MAX_NUMBER_ORDERED - 1 ) {
            System.out.println("An new Order has been added");
        }
        if (dem == MAX_NUMBER_ORDERED - 1 ) {
            System.out.println("An new Order has been added, Order is full");
        }
        if (dem > MAX_NUMBER_ORDERED - 1 ) {
            System.out.println("Order is full, can't add");
        }
    }
	
	public void addItem(Media item){
        verifyOrderedItem();
        if (listOfItems.size() < MAX_NUMBER_ORDERED)
            listOfItems.add(item);
    }
	public void addItem(ArrayList<Media> items ){
        for(int i=0; i < items.size() ; i++){
            addItem(items.get(i));
        }
    }

    public void addItembyid(int id,ArrayList<Media> items ){
        int count = 0;
        for(int i = 0; i<items.size(); i++){
            if(items.get(i).getId() == id){
                addItem(items.get(i));
                count ++;
                break;
            }
        }
        if(count == 0) System.out.println("Does not exist");
    }

    public void removeItem(Media item ){
        if(listOfItems.contains(item)){
            listOfItems.remove(item);
            System.out.println("Removed from the list");
        } else System.out.println("Does not exist");
    }

    public void removeItem(ArrayList<Media> items ){
       items.clear();
    }

    public void removeItembyid(ArrayList <Media> listOfItems,int id){
        int count = 0;
        for(int i=0 ; i< listOfItems.size(); i++){
            if(listOfItems.get(i).getId() == id){
                listOfItems.remove(i);
                count++;
                System.out.println("Deleted");
                if(i == getLuckyItem()){
                    randomLuckyItem();
                }
            }
        }
        if(count==0){ System.out.println("The searching id does not exist");}
    }
    public void show(ArrayList <Media> listOfItems) {
        System.out.println("------------------------------------");
        for (int i = 0; i < listOfItems.size(); i++) {
            System.out.println(i + 1 + "." + listOfItems.get(i).displayInfor());
        }
        System.out.println("------------------------------------");
    }
    
    public float totalCost() {
        float tong = 0;
        for (int i = 0; i < listOfItems.size(); i++) {
            tong += listOfItems.get(i).getCost();
        }
        tong -= listOfItems.get(luckyItem).getCost();
        return tong;
    }
        
    public void randomLuckyItem() {
        int range = 10;
        this.luckyItem = (int) (Math.random() * range);
        if(luckyItem >= listOfItems.size()) this.luckyItem = listOfItems.size() - 1;
    }

    public int checkid(ArrayList <Media> listOfItems,int id){
        int count = 0;
        for(int i=0; i<listOfItems.size(); i++){
            if(listOfItems.get(i).getId() == id){
                count++;
            }
        }
        return count;
    }

    public void newItem(ArrayList <Media> listOfItems,int choice) throws PlayerException {
        boolean check = true;
        int id;
        do{
            System.out.print("Enter id: "); id = sc.nextInt();
            if(checkid(listOfItems, id) != 0 ){
                System.out.println("Already exists, please re-enter");
            }else { check = false; }
        }while(check);
        sc.nextLine();
        System.out.print("Enter title: "); String title = sc.nextLine();
        System.out.print("Enter category: "); String category = sc.nextLine();
        System.out.print("Enter Cost: "); float cost = sc.nextFloat();
        sc.nextLine();
        if(choice == 1){
            System.out.print("Enter author: "); String author = sc.nextLine();
            Book bk = new Book(id,title,category,cost);
            bk.addAuthor(author);
            listOfItems.add(bk);
        }
        if(choice == 2){
            System.out.print("Enter director: "); String director = sc.nextLine();
            System.out.print("Enter artist: "); String artist = sc.nextLine();
            System.out.print("Enter the number of trasks: "); int number = sc.nextInt();
            ArrayList<Track> tracks = new ArrayList<>();
            sc.nextLine();
            for(int i = 0; i < number ; i++){
                System.out.print("Enter title of track: "); String titletrask = sc.nextLine();
                System.out.print("Enter length of track: "); int lengthtrack = sc.nextInt();
                sc.nextLine();
                Track track = new Track(titletrask,lengthtrack);
                tracks.add(track);
            }
            CompactDisc cd = new CompactDisc(id,title,category,cost,director,artist,tracks);
            cd.getLength(tracks);
            listOfItems.add(cd);
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
        }
        if(choice == 3){
            System.out.print("Enter director: "); String director = sc.nextLine();
            System.out.print("Enter length: "); int length = sc.nextInt();
            DigitalVideoDisc disc = new DigitalVideoDisc(id,title,category,director,length,cost);
            listOfItems.add(disc);
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
        }
        
    }
}
