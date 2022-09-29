package part2;

public class mainClass {
    
    public static void main(String[] args) {
        
        String myString = "madam";
        String myString2 = "test";

        boolean output = true;
        boolean output2 = true;

        for(int i = 0; i < myString.length() / 2; i++)
        {
            if(myString.charAt(i) != myString.charAt(myString.length()-1 -i))
            {
                output = false;
            }
        }

        for(int i = 0; i < myString2.length() / 2; i++)
        {
            if(myString2.charAt(i) != myString2.charAt(myString2.length()-1 -i))
            {
                output2 = false;
            }
        }
        System.out.println(myString + " -> " + output);
        System.out.println(myString2 + " -> " + output2);
    }
}
