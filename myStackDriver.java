import java.util.Scanner;

public class myStackDriver {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.print("Input:");
            String userInput = input.nextLine();
            // Initializes a stack
            MyStack letters = new MyStack(userInput.length());
            // Converts user input to lower case
            userInput = userInput.toLowerCase();
            // Splits up the string into individual letters
            String[] lettersInString = userInput.split("");
            // Iterate over every letter and push it to the stack
            for(String s: lettersInString){
                letters.push(s);
            }

            StringBuilder str = new StringBuilder();

            // Keep on looping until the stack is empty
            while(!letters.empty()){
                // Appends the letter on top of the stack into a string builder
                str.append(letters.peek());
                // Pops the letter on top of the stack
                letters.pop();
            }

            // Converts the string builder into a string
            String reverseString = str.toString();

            if(reverseString.equals(userInput)){
                System.out.println("THAT IS A PALINDROME!");
            } else{
                System.out.println("THAT IS NOT A PALINDROME!");
            }
        }
    }
