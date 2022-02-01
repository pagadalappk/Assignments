
public class Assignment2Q3 {
	
	public int getCash(){return 0;}

	public static void main(String[] args) {

		//public int totalCashInBank(ArrayList<Integer> cash){}
	    
		SavingsAccount save = new SavingsAccount();
		
		CurrentAccount cur = new CurrentAccount();
		
		System.out.println("The total cash in the bank is "+(cur.getCash()+save.getCash()));
	}

}
