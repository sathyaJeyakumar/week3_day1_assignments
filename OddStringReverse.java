package week3_day1_assignments;

public class OddStringReverse {

	public static void main(String[] args) {
		
		OddStringReverse wcoOddStringREverse = new OddStringReverse();
		String test = "I am a software tester";
		String SRevTest = "";
		String[] wcaTest = test.split(" ");
		
		for (int i =0;i<=wcaTest.length-1; i++) {
			if(i%2 == 1) {
				System.out.println(wcaTest[i]);
				SRevTest = SRevTest + " "+ wcoOddStringREverse.StrRev(wcaTest[i]);
			}
			else
			{
				SRevTest = SRevTest + " "+ wcaTest[i];
			}
		}
		
		System.out.println("Reversing odd words : "+ SRevTest);
		
	}
	public String StrRev(String str)
	{
		// convert String to character array
        // by using toCharArray
        char[] str1 = str.toCharArray();
        String str2 = "";
 
        for (int i = str1.length - 1; i >= 0; i--)
        {
        	//System.out.print(str1[i]+"*");
        	 str2 = str2+String.valueOf(str1[i]);
        }
            
       //System.out.println("str2"+ str2);
        return str2;
    }
	

}
	
	

