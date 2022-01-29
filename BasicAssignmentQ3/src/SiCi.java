
public class SiCi {
	public double simpleInterest(double principal,int time,double interest)
	{
		double simple;
		
		simple=(principal*time*interest)/100;
		
		return simple;
	}
	
	
    public double compoundInterest(double principal,int time,double interest)
    {
    
    	double compound;
    	double temp;
    	
    	temp=principal*(Math.pow((1+(interest/100)),time));
    	compound=temp-principal;
    	
    	return compound;
    }

}
