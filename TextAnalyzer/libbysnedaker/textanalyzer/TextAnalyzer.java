//Libby Snedaker June 4, 2019

package libbysnedaker.textanalyzer;

public class TextAnalyzer {
	
	private StringBuilder textBlock = new StringBuilder();
	
	public static final int ADD_TO_FRONT = 1;
	public static final int ADD_TO_BACK = 2;
	public static final String DEFAULT_TEXT_BLOCK ="No user text available.";
	
	public TextAnalyzer (String nextText) {
		setTextBlock(nextText);
	}

	public String addSubString(String addedText, int frontOrBack) {
		
		if (frontOrBack == ADD_TO_FRONT) {
			textBlock.insert(0, addedText);
		}
		else if  (frontOrBack == ADD_TO_BACK) { 
			textBlock.append(addedText);
		}
		return textBlock.toString();
		
	}
	
	public int getNumberOfConsonants () {
		int countConsonant = 0;
		for (int i = 0; i < textBlock.toString().length(); i++)
		{
			if (textBlock.toString().charAt(i) == 'b' || textBlock.toString().charAt(i) == 'B' || textBlock.toString().charAt(i) == 'c' || textBlock.toString().charAt(i) == 'C' 
					|| textBlock.toString().charAt(i) == 'd' || textBlock.toString().charAt(i) == 'D' || textBlock.toString().charAt(i) == 'f' || textBlock.toString().charAt(i) == 'F' 
					|| textBlock.toString().charAt(i) == 'g' || textBlock.toString().charAt(i) == 'G' || textBlock.toString().charAt(i) == 'h'  || textBlock.toString().charAt(i) == 'H' 
					|| textBlock.toString().charAt(i) == 'j' || textBlock.toString().charAt(i) == 'J' || textBlock.toString().charAt(i) == 'k' || textBlock.toString().charAt(i) == 'K' 
					|| textBlock.toString().charAt(i) == 'l' || textBlock.toString().charAt(i) == 'L' || textBlock.toString().charAt(i) == 'm'  || textBlock.toString().charAt(i) == 'M' 
					|| textBlock.toString().charAt(i) == 'n' || textBlock.toString().charAt(i) == 'N' || textBlock.toString().charAt(i) == 'p' || textBlock.toString().charAt(i) == 'P' 
					|| textBlock.toString().charAt(i) == 'q' || textBlock.toString().charAt(i) == 'Q' || textBlock.toString().charAt(i) == 'r'  || textBlock.toString().charAt(i) == 'R'
					|| textBlock.toString().charAt(i) == 's' || textBlock.toString().charAt(i) == 'S' || textBlock.toString().charAt(i) == 't' || textBlock.toString().charAt(i) == 'T' 
					|| textBlock.toString().charAt(i) == 'v' || textBlock.toString().charAt(i) == 'V' || textBlock.toString().charAt(i) == 'w'  || textBlock.toString().charAt(i) == 'W' 
					|| textBlock.toString().charAt(i) == 'x' || textBlock.toString().charAt(i) == 'X' || textBlock.toString().charAt(i) == 'y'  || textBlock.toString().charAt(i) == 'Y' 
					|| textBlock.toString().charAt(i) == 'z' || textBlock.toString().charAt(i) == 'Z')
			{  
				countConsonant++;
			}
		}
		return countConsonant; 
	}
	
	public int getNumberOfVowels() {
		int countVowel = 0;
		for (int i = 0; i < textBlock.toString().length(); i++)
		{
			if (textBlock.toString().charAt(i) == 'a' || textBlock.toString().charAt(i) == 'A' || textBlock.toString().charAt(i) == 'e' || textBlock.toString().charAt(i) == 'E' 
				|| textBlock.toString().charAt(i) == 'i' || textBlock.toString().charAt(i) == 'I' || textBlock.toString().charAt(i) == 'o' || textBlock.toString().charAt(i) == 'O' 
				|| textBlock.toString().charAt(i) == 'u' || textBlock.toString().charAt(i) == 'U')
			{
			countVowel++;
			}
		}
		return countVowel;
	}
	
	public int getNumberOfWords () {
		String [] textBlockString = textBlock.toString().split(" ");
		return textBlockString.length;
	}

	public String getTextBlock () {
		 return textBlock.toString();
	}
	
	public void setTextBlock(String newText) {
		if (newText != null) {
			textBlock = new StringBuilder(newText);
		}
	}

}
