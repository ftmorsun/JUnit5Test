package junit5tutorial;

public class C02FirstTwoLastTwoCharsSame {
	
	public boolean checkIfFirstTwoLastTwoCharsSame(String str)
	{
		if (str.length()<=1) {
			return false;
		} else if (str.length()==2)
		{
			return true;
		}
		
		String first=str.substring(0,2);
		String last=str.substring(str.length()-2);
		return first.equals(last);
	}

}
