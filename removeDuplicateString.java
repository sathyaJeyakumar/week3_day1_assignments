package week3_day1_assignments;

public class removeDuplicateString {

	public static void main(String[] args) {
		// TODO Auto-generated method stubWe learn Java basics as part of java sessions in java week1
		String psText = "We learn Java basics as part of java sessions in java week1";
		String psExpectedOutput = "";
		String[] pcaSplitOutput = psText.split(" ");
			
				
		for(int i=0; i<=pcaSplitOutput.length-1; i++) {
			for(int j= i+1; j<=pcaSplitOutput.length-1;j++) {
				
				if(pcaSplitOutput[i].equals(pcaSplitOutput[j])) {
					pcaSplitOutput[j] = "remove";
				}
			}
		}
		// Convert to String
		for(String word: pcaSplitOutput) {
			if(word != "remove") 
			{
				psExpectedOutput = psExpectedOutput + word + " ";
			}
		}
		System.out.println(psExpectedOutput);
	}

}
