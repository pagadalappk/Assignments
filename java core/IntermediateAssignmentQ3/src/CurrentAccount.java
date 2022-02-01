
public class CurrentAccount {
	
	int totalDeposits = 10000;
    int creditLimit = 2000;
    public int getCash() {
    	
    	int total=totalDeposits+creditLimit;
    	
    	return total;
    }

}
