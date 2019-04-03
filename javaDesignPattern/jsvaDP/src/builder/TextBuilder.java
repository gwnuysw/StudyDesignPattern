package builder;

public class TextBuilder extends Builder {
    private StringBuffer buffer = new StringBuffer();           // 필드 문서를 구축한다.
    public void makeTitle(String title) {                       // 일 텍스트 제목.
        buffer.append("==============================\n");     // 장식선.
        buffer.append("⌈" + title + "⌋\n");                   // 사용한 테이블.
        buffer.append("\n");                                // 빈행.
    }
    public void makeString(String str) {                       // 일반텍스트에서 문자열.
        buffer.append('◼' + str + "\n");                     // 글머리 기호 붙은 문자열.
        buffer.append("\n");                                // 빈행.
    }
    public void makeItems(String[] items) {                   // 일반 텍스트에서 개별 항
        for (int i = 0; i < items.length; i++) {
            buffer.append(" •" + items[i] + "\n");            // 글머리 기호 붙은 문자열.
        }
        buffer.append("\n");                               // 빈행.
    }
    public void close() {                                   // 문서의 완성.
        buffer.append("==============================\n");     // 장식선.
    }
    public String getResult() {                              // 완성한 문자.
        return buffer.toString();                             // StringBuffer를 String로 변환.
    }
}
