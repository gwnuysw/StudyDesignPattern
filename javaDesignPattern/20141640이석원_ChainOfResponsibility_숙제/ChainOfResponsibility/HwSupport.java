package ChainOfResponsibility;

public class HwSupport extends Support{

	public HwSupport(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}
	@Override
	protected boolean resolve(Trouble trouble) {
		// TODO Auto-generated method stub
		return calcPrimeNumber(trouble.getNumber());
		
	}
	protected boolean calcPrimeNumber(int max) {
		int i;
		for(i = 2;i <= max; i++) {
			if(max%i == 0) {
				break;
			}
		}
		if(i >= max) {
			return true;
		}
		else {
			return false;
		}
	}
}
