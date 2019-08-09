//Libby Snedaker June 4, 2019
package libbysnedaker.textanalyzer;

import java.util.Scanner;

public class TextAnalyzerApplication {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("1 - Create the text");
		System.out.println("2 - Change the existing text");
		System.out.println("3 - Display statistics for existing text");
		System.out.println("4 - Add new text to existing text");
		System.out.println("5 - Display existing text");
		System.out.println("6 - Exit");
		
		int x = input.nextInt();
		input.nextLine();
		TextAnalyzer textAnalyzer = null;
		
		while (x != 6) {
			
			if (x == 1) {
				System.out.println("Enter the text: ");
				String s = input.nextLine();
				textAnalyzer = new TextAnalyzer(s);
			}
			
			else if (x == 2) {
				if (textAnalyzer != null) {
					System.out.println("Enter the new text: ");
					String newText = input.nextLine();
					textAnalyzer.setTextBlock(newText);
				}
					else {
						System.out.println("You must create the text first.");	
					}
			}
			
			else if (x == 3) {
				if (textAnalyzer != null) {
					System.out.println("Number of consonants: " + textAnalyzer.getNumberOfConsonants());
					System.out.println("Number of vowels: " + textAnalyzer.getNumberOfVowels());
					System.out.println("Number of words: " +  textAnalyzer.getNumberOfWords());
				}
				else {
					System.out.println("You must create the text first.");	
				}
			}
			
			else if (x == 4) {
				if (textAnalyzer != null) {
					System.out.println("Enter the text to add: ");
					String addedText = input.nextLine();
					System.out.println("Enter 1 to add text to beginning or 2 to add to ending.");
					int y = input.nextInt();
					input.nextLine();
					
					if (y == 1) {
						textAnalyzer.addSubString(addedText, 1);
					}
					else { 
						textAnalyzer.addSubString(addedText, 2);
					}	
				}
				else {
					System.out.println("There is no text to add to.");	
				}
			}
				
			else if (x == 5) {
				if (textAnalyzer != null) {
					System.out.println(textAnalyzer.getTextBlock());
				}
				else {
					System.out.println("There is no text to display.");
				}
			}
			
			System.out.println("1 - Create the text");
			System.out.println("2 - Change the existing text");
			System.out.println("3 - Display statistics for existing text");
			System.out.println("4 - Add new text to existing text");
			System.out.println("5 - Display existing text");
			System.out.println("6 - Exit");
			x = input.nextInt();
			input.nextLine();
			
		}
		System.out.println("Thanks for using the text analyzer!");
	}
}