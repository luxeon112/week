package week7;

import java.util.Scanner;

public class TextUserInterface {
    private Dictionary dictionary;
    private Scanner reader;
    public TextUserInterface(Scanner reader, Dictionary dictionary) {
        this.dictionary = dictionary;
        this.reader = reader;
        this.dictionary.add("quit", "quit the text user interface");
    }

    public void start(){
        System.out.println("Statement: ");
        System.out.println("quit - " + this.dictionary.translate("quit"));
        while(true){
            System.out.println("Statement: ");
            String input = reader.nextLine();
            if(this.dictionary.translate(input) == null){
                System.out.println("Unknown statement");
            } else {
                if(input.equals("quit")){
                    System.out.println("Cheers!");
                    break;
                }
            }
        }
    }
}