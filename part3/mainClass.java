package part3;

public class mainClass {
    
    public static void main(String[] args) {
        
        String text = "hello everyone. let's write some useful Java code today. we will begin with strings.";
        StringBuilder output = new StringBuilder(text.length());


        boolean capitalizeLetter = true;
        for(int i = 0; i < text.length(); i++)
        {
            char currentChar = text.charAt(i);

            if(currentChar == '.')
            {
                capitalizeLetter = true;
            }
            else if(capitalizeLetter && Character.isAlphabetic(currentChar)){

                currentChar = Character.toUpperCase(currentChar);
                capitalizeLetter = false;
            }

            output.append(currentChar);
        }
        System.out.println(output);
    }
}
