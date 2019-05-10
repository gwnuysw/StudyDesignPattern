package jsvaDP;

import java.io.IOException;


import Singleton.ticketMaker;
import adapter.*;
import factoryMethod.*;
//import iterator.*;
import java.util.Iterator;

import ChainOfResponsibility.*;
import templateMethod.*;
import visitor.*;
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
//		System.out.println("after remove-----");
//		/*bookShelf객체를 it이 받고 bookshelf의 요소를 하나 지워도 it에 넘겨진 bookshelf객체에 반영된다. chain관계가 있는듯 하다.*/
//		it = bookShelf.iterator();
//		bookShelf.deleteBook();
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
		
		/*builder*/
//        if (args.length != 1) {
//            usage();
//            System.exit(0);
//        }
//        if (args[0].equals("plain")) {
//            Builder textbuilder = new TextBuilder();
//            //Director director = new Director(textbuilder);
//            //director.construct();
//            textbuilder.tpmethod(textbuilder);
//            String result = ((TextBuilder) textbuilder).getResult();
//            System.out.println(result);
//        } else if (args[0].equals("html")) {
//            HTMLBuilder htmlbuilder = new HTMLBuilder();
//            //Director director = new Director(htmlbuilder);
//            //director.construct();
//            htmlbuilder.tpmethod(htmlbuilder);
//            String filename = htmlbuilder.getResult();
//            System.out.println(filename + " is created.");
//        } else {
//            usage();
//            System.exit(0);
//        }
		
		/*visitor*/
//		try {
//            Directory rootdir = new Directory("root");
//            Directory bindir = new Directory("bin");
//            Directory tmpdir = new Directory("tmp");
//            Directory usrdir = new Directory("usr");
//            rootdir.add(bindir);
//            rootdir.add(tmpdir);
//            rootdir.add(usrdir);
//            bindir.add(new File("vi", 10000));
//            bindir.add(new File("latex", 20000));
//
//            Directory Kim = new Directory("Kim");
//            Directory Lee = new Directory("Lee");
//            Directory Park = new Directory("Park ");
//            usrdir.add(Kim);
//            usrdir.add(Lee); 
//            usrdir.add(Park);
//            Kim.add(new File("diary.html", 100));
//            Kim.add(new File("Composite.java", 200));
//            Kim.add(new File("hyejaKim.txt", 150));
//            Lee.add(new File("memo.tex", 300));
//            Lee.add(new File("index.html", 350));
//            Lee.add(new File("Leehyeja.txt", 325));
//            Park.add(new File("game.doc", 400));
//            Park.add(new File("junk.mail", 500));
//            Park.add(new File("Parkhyeja.txt", 450));
//
//            FileNameFindVisitor ffv = new FileNameFindVisitor("hyeja"); 
//            rootdir.accept(ffv);                           
//
//            Iterator it = ffv.getFoundFiles();                
//            while (it.hasNext()) {                          
//                File file = (File)it.next();                    
//                System.out.println(file.toString());           
//            }                                            
//        } catch (FileTreatmentException e) {
//            e.printStackTrace();
//        }
		
		/*Chain of Responsibility*/
		Support seokwon = new HwSupport("seokwon");
		Support alice     = new NoSupport("Alice");
        Support bob     = new LimitSupport("Bob", 100);
        Support charlie   = new SpecialSupport("Charlie", 429);
        Support diana    = new LimitSupport("Diana", 200);
        Support elmo    = new OddSupport("Elmo");
        Support fred     = new LimitSupport("Fred", 300);
        seokwon.setNext(alice).setNext(bob).setNext(charlie).setNext(diana).setNext(elmo).setNext(fred);
        for (int i = 0; i < 500; i += 1) {
            seokwon.support(new Trouble(i));
        }
	}
//    public static void usage() {
//        System.out.println("Usage: java Main plain normal text edit");
//        System.out.println("Usage: java Main html  HTML text edit");
//    }
}
