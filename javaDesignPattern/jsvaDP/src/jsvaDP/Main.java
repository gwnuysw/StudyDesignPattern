package jsvaDP;

import iterator.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BookShelf bookShelf = new BookShelf();
		bookShelf.appendBook(new Book("Around the World in 80 days"));
		bookShelf.appendBook(new Book("Bible"));
		Iterator it = bookShelf.iterator();
		bookShelf.appendBook(new Book("Cinderella"));
		bookShelf.appendBook(new Book("Daddy-Long-Legs"));
		bookShelf.appendBook(new Book("Around the World in 80 days"));
		bookShelf.appendBook(new Book("Bible"));
		bookShelf.appendBook(new Book("Cinderella"));
		bookShelf.appendBook(new Book("Daddy-Long-Legs"));

		while(it.hasNext()) {
			Book book = (Book)it.next();
			System.out.println(book.getName());
		}
	}

}
