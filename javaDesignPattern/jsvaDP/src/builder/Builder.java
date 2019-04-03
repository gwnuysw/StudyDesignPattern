package builder;

public abstract class Builder {
	private Builder builder;
	public abstract void makeTitle(String title);
	public abstract void makeString(String str);
	public abstract void makeItems(String[] items);
	public abstract void close();
	public void tpmethod(Builder builder) {
		this.builder = builder;
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
