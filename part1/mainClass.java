package part1;

/**
 * mainClass
 */
public class mainClass {

    public static void main(String[] args) {
        
        String myString = "Saba";
        String myString2 = "John";

        boolean output = true;
        boolean output2 = true;

        for(int i = 0; i < myString.length(); i++)
        {
            for(int j = i + 1; j < myString.length(); j++)
            {
                if(myString.charAt(i) == myString.charAt(j)){
                    output = false;
                } 
            }
            
        }

        for(int i = 0; i < myString2.length(); i++)
        {
            for(int j = i + 1; j < myString2.length(); j++)
            {
                if(myString2.charAt(i) == myString2.charAt(j)){
                    output2 = false;
                } 
            }
            
        }

        System.out.println(myString + " -> " + output);
        System.out.println(myString2 + " -> " + output2);
    }
}