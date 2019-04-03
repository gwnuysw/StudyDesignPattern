package builder;
import java.io.*;

public class HTMLBuilder extends Builder {
    private String filename;                                 // 작성할 파일명.
    private PrintWriter writer;                               // 파일에 기술할. PrintWriter
    public void makeTitle(String title) {                       // HTML 파일에서의 타이틀.
        filename = title + ".html";                           // 타이틀을 기초로 파일명을 결정.
        try {
            writer = new PrintWriter(new FileWriter(filename)); // PrintWriter을 만든다.
        } catch (IOException e) {
            e.printStackTrace();
        }
        writer.println("<html><head><title>" + title + "</title></head><body>"); 
								// Ÿ��Ʋ ����
        writer.println("<h1>" + title + "</h1>");
    }
    public void makeString(String str) {                        // HTML 파일에서의 문자열.
        writer.println("<p>" + str + "</p>");                   // <p> 태그로 출력.
    }
    public void makeItems(String[] items) {                     // HTML 파일에서의 개별항목.
        writer.println("<ul>");                                 // <ul> <li>로출
        for (int i = 0; i < items.length; i++) {
            writer.println("<li>" + items[i] + "</li>");
        }
        writer.println("</ul>");
    }
    public void close() {                                 // 문서의 완성.
        writer.println("</body></html>");                     //태그를 닫는다.
        writer.close();                                        // 파일을 닫는다.
    }
    public String getResult() {
        return filename;                                      //파일명을반환한다.
    }
}