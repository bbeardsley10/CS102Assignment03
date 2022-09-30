package part4;

public class mainClass {
    
    public static void main(String[] args) {
        
        String myString = "ABC";

        if(myString.length() == 0)
        {
            System.out.println(myString);
            return;
        }

        for(int i = 0; i < myString.length(); i++)
        {
            char currentChar = myString.charAt(i);

            String output = myString.substring(0, i) + myString.substring(i + 1);

           // pri
            System.out.println(output);
        }
    }
}
