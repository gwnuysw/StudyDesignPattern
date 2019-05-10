package ChainOfResponsibility;

public class NoSupport extends Support {
    public NoSupport(String name) {
        super(name);
    }
    protected boolean resolve(Trouble trouble) {     // �ذ��� �޼ҵ�
        return false;                              // �ڽ��� �ƹ��͵� ó������ �ʴ´�
    }
}
