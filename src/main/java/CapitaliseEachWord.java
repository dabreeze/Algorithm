import java.util.Arrays;

public class CapitaliseEachWord {

    public static void main(String[] args) {

        String word = "have you eating today at all";
        // capitalize each word
        String capitalizeWord = new String();
        String[] newWord = word.split(" ");

        for(String aWord : newWord)
        {
            String firstWord = aWord.substring(0,1);
            String lastWord = aWord.substring(1);
            capitalizeWord += firstWord.toUpperCase()+lastWord+ " ";

        }
        System.out.println(capitalizeWord);








    }
}
