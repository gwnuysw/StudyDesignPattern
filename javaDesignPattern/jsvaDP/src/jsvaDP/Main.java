package jsvaDP;

import java.io.IOException;

import Singleton.ticketMaker;
import adapter.*;
import factoryMethod.*;
import iterator.*;
import templateMethod.*;
import builder.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*iterator pattern*/
//		BookShelf bookShelf = new BookShelf();
//		bookShelf.appendBook(new Book("Around the World in 80 days"));
//		bookShelf.appendBook(new Book("Bible"));
//		Iterator it = bookShelf.iterator();
//		bookShelf.appendBook(new Book("Cinderella"));
//		bookShelf.appendBook(new Book("Daddy-Long-Legs"));
//
//		while(it.hasNext()) {
//			Book book = (Book)it.next();
//			System.out.println(book.getName());
//		}
		
		
		/*adaptor pattern*/
//		Print p = new PrintBanner("Hello");
//		/*PrintBanner p = new PrintBanner("Hello");
//		 * 위와 같이 하지 않는 이유는 직류 12볼트(Banner) 기기를 교류 100볼트(Print)
//		 * 콘센트에 꽂는데 필요한 어탭터 가 PrintBanner이기 때문입니다.
//		 * Print콘센에 다양한 어댑터를 꽂을 수 있습니다.*/
//        p.printWeak();
//        p.printStrong();
		
		/*FileProperties*/
//      FileIO f = new FileProperties();
//      try {
//          f.readFromFile("file.txt");
//          f.setValue("year", "2004");
//          f.setValue("month", "4");
//          f.setValue("day", "21");
//          f.writeToFile("newfile.txt");
//      } catch (IOException e) {
//          e.printStackTrace();
//      }

//      AbstractDisplay d1 = new CharDisplay('H');
//      AbstractDisplay d2 = new StringDisplay("Hello, world.");
//      AbstractDisplay d3 = new StringDisplay("안녕하세요.");
//      d1.display();   
//      d2.display();  
//      d3.display();  
		
		/*factory method*/
//		Factory factory = new IDcardFactory();
//	    Product card1 = factory.create("홍길동");
//	    Product card2 = factory.create("이순신");
//	    Product card3 = factory.create("강감찬");
//	    card1.use();
//	    card2.use();
//	    card3.use();
//	    System.out.println(((IDcardFactory) factory).getOwnerCard("홍길동"));
//	    System.out.println(((IDCard)card1).getauthToken());
//	    System.out.println(((IDcardFactory) factory).getOwnerCard("이순신"));
//	    System.out.println(((IDcardFactory) factory).getOwnerCard("강감찬"));
	    
		/*singleton*/
//	    ticketMaker t = ticketMaker.getInstance();
//	    System.out.println(t.getNextNumber());
//	    System.out.println(t.getNextNumber());
//	    System.out.println(t.getNextNumber());
//	    System.out.println(t.getNextNumber());
		
        if (args.length != 1) {
            usage();
            System.exit(0);
        }
        if (args[0].equals("plain")) {
            Builder textbuilder = new TextBuilder();
            //Director director = new Director(textbuilder);
            //director.construct();
            textbuilder.tpmethod(textbuilder);
            String result = ((TextBuilder) textbuilder).getResult();
            System.out.println(result);
        } else if (args[0].equals("html")) {
            HTMLBuilder htmlbuilder = new HTMLBuilder();
            //Director director = new Director(htmlbuilder);
            //director.construct();
            htmlbuilder.tpmethod(htmlbuilder);
            String filename = htmlbuilder.getResult();
            System.out.println(filename + " is created.");
        } else {
            usage();
            System.exit(0);
        }
	}
    public static void usage() {
        System.out.println("Usage: java Main plain normal text edit");
        System.out.println("Usage: java Main html  HTML text edit");
    }
}
