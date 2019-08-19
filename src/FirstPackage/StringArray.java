package FirstPackage;

public class StringArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] arrLanguage = {"C","C++","Java","C#"};

		for (int i=0;i<arrLanguage.length;i++){
			System.out.println(arrLanguage[i]);
		}
		
		String[] arrLanguage1 = {"C","C++","Java","C#"};

		for (String s1 : arrLanguage1)
		{	System.out.println(s1);}
		
		
		
	}

}
