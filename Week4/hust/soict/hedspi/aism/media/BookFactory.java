package hust.soict.hedspi.aism.media;

import java.util.Scanner;

import hust.soict.hedspi.aism.media.book.Book;

public class BookFactory implements AbstractItemFactory{
	private static int idCount = 0;
	
	@Override
	public Book createMediaItemFromConsole() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter title: "); String title = sc.nextLine();
        System.out.print("Enter category: "); String category = sc.nextLine();
        System.out.print("Enter Cost: "); float cost = sc.nextFloat();
        sc.nextLine();
        System.out.print("Enter author: "); String author = sc.nextLine();
        idCount++;
        Book book = new Book(idCount,title,category,cost);
        book.addAuthor(author);
        sc.close();
		return book;
	}
}
