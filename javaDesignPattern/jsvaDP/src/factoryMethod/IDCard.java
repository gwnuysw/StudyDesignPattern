package factoryMethod;

public class IDCard extends Product{
    private String owner;
    private double authToken;
    IDCard(String owner) {
        System.out.println(owner + "의 카드를 만듭니다.");
        this.owner = owner;
        this.authToken = Math.random();
    }
    public void use() {
        System.out.println(owner + "의 카드를 사용합니다.");
    }
    public String getOwner() {
        return owner;
    }
    public double getauthToken() {
    	return authToken;
    }
}
