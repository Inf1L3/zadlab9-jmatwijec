/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.oopl9;

import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author student
 */
public class Slownik {
    public Slownik(){
        HashMap<String, String> tlumaczenia = new HashMap<String, String>();
        tlumaczenia.put("I", "Ja");
        tlumaczenia.put("You", "Ty");
        tlumaczenia.put("He", "On");
        tlumaczenia.put("She", "Ona");
        tlumaczenia.put("It", "Ono");
        tlumaczenia.put("We", "My");
        tlumaczenia.put("You", "Wy");
        tlumaczenia.put("One", "Jeden");
        tlumaczenia.put("Two", "Dwa");
        tlumaczenia.put("Three", "trzy");
        tlumaczenia.put("Four", "cztery");
        tlumaczenia.put("Five", "piec");
        tlumaczenia.put("Six", "szesc");
        tlumaczenia.put("Seven", "siedem");
        tlumaczenia.put("Eight", "osiem");
        tlumaczenia.put("Nine", "dziweic");
        //github https://gist.github.com/mr-fool/8091562#file-internetdictionary-L26
        		//Prompting the user to type a word
		Scanner keyboard = new Scanner(System.in);
		String input = "q";
		
		//Prompting the user to type a word
		do {
			System.out.println("\n Enter the word you should to look up.\n Press q to quit");
		
			input = keyboard.nextLine();
			//Formating the user input so it can be compared
			input = input.toLowerCase(); //Changing it to lower case
			input = input.replace(" ",""); //Removing the whitespace
			/**
			 * @param Taking user input and matching it with the definition 
			 * */
			if ( tlumaczenia.containsKey(input) ) {
				String definition = tlumaczenia.get(input);
				System.out.println("input: \n" + definition);
			}
			else {
				System.err.println("Word not found");
			}
	}while (! input.equalsIgnoreCase("q") );
    }
}
