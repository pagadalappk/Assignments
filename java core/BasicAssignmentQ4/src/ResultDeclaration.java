
public class ResultDeclaration {
	public String declareResults( double s1, double s2, double s3) 
	{
		
		if((s1>60) && (s2>60) && (s3>60))
		{
			return "Passed";
		}
		else if((s1>60 && s2>60) || (s1>60 && s3>60) || (s2>60 && s3>60))
		{
			return "Promoted";
		}
		else
		{
			return "Fail";
		}
		
	}
}
