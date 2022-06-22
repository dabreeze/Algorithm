public class StringManip {
    public static void main(String[] args) {

        String pallindrom = "How are you doing today";
        // turn this string arround.

        int len = pallindrom.length();
        char[] tempString = new char[len];
        char[] anotherString = new char[len];

        // convert to a char array first

        for(int i = 0; i<len; i++)
        {
            tempString[i] = pallindrom.charAt(i);
        }
        // Reverse the char array
        for(int j=0; j<len; j++)
        {
            anotherString[j] = tempString[(len-1)-j];
        }
        // convert back to a string
        String newString = new String(anotherString);

        System.out.println(newString);







    }
}
