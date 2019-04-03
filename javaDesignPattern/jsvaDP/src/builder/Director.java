package builder;

public class Director {
    private Builder builder;
    public Director(Builder builder) {        // Builder의 Subclass의 인스턴스가 주어지므
        this.builder = builder;             // builder 필드에 저장해둔다.
    }
    public void construct() {               		// 문서구축.
        builder.makeTitle("Greeting");              // 타이틀.
        builder.makeString("morning and afternoon");  //문자열. 
        builder.makeItems(new String[]{            //개별 항목.
            "good morning",
            "hello",
        });
        builder.makeString("at night"); // 별도의 문자열.
        builder.makeItems(new String[]{ // 별도의 개별 항목.
            "hello",
            "good night",
            "take care",
        });
        builder.close();  // 문서를 완성 시킨다.
    }
}
