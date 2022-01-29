
public class TaxAmount 
{
	public double calculateTaxAmount(int ctc)
	{
		double tax=0;
	if(ctc>=0&&ctc<=180000)
		{
			return 0;
			
		}
	else if(ctc>=18100 && ctc<=300000)
		{
			
			tax=(ctc*10)/100;
		}
	else if(ctc>=300000 && ctc<=500000)
		{
		
			tax=(ctc*20)/100;
		}
	else if(ctc>=500001 && ctc<=1000000)
		{
		
			tax=(ctc*30)/100;;
		}
	return tax;
		
	}
}
