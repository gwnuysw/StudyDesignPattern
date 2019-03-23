package factoryMethod;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class IDcardFactory extends Factory{
    private List owners = new ArrayList();
    private HashMap<String, Double> whoOwn = new HashMap<String, Double>();
    protected Product createProduct(String owner) {
        return new IDCard(owner);
    }
    protected void registerProduct(Product product) {
        owners.add(((IDCard)product).getOwner());
        whoOwn.put(((IDCard)product).getOwner(), ((IDCard)product).getauthToken());
    }
    public List getOwners() {
        return owners;
    }
    public double getOwnerCard(String owner) {
    	if(whoOwn.get(owner) != null) {
        	return whoOwn.get(owner);
    	}
    	else {
    		return 0;
    	}
    }
}
