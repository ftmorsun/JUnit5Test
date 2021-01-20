package junit5tutorial;

public class C01StringModifier {
	public String deleteAFirstTwo(String str)
	{
		if(str.length()<=2)
		{
			return str.replaceAll("A|a", "");
		}
		String first=str.substring(0,2);
		String after=str.substring(2);
		return first.replaceAll("A", "")+after;
	}

}
