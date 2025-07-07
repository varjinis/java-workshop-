public class Stringexample {
    public static void main(String[] args) {
        String firstname = "raja";
        String shortname = "raja";
        String buddyname =  new String ( "raja");
        System.out.println(firstname == shortname);
        System.out.println(firstname == buddyname);    
        

        String sentence ="this program shows how can we split a string into muliple";
        String words[] = sentence.split(" ");
        System.out.println(words.length);
    
    }
}