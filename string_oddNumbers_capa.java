package week3_day1_assignments;

public class string_oddNumbers_capa {

	public static void main(String[] args) {
		String wsName = "changeme";
		char[] wsChangedName = wsName.toCharArray();
		String wsProcessedName = "";
				
		for(int i = 0; i<=wsChangedName.length - 1; i++)
		{
			Character wsName1 = Character.valueOf(wsChangedName[i]);
			
			if(i%2 == 1)
			{ 
				wsProcessedName = wsProcessedName+ Character.toUpperCase(wsName1);
			
			}
			else {
				wsProcessedName = wsProcessedName + wsName1;
			}
		
			
		}
		System.out.println("AFter string function, output will be "+ wsProcessedName);

}
}
