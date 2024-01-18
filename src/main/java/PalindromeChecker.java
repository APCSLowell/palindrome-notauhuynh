import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.Scanner; // Import the Scanner class to read text files

public class PalindromeChecker {
public void tester()
{
  //String lines[] = loadStrings("palindromes.txt");
  String[] lines = new String[6]; 
    try{
        File myFile = new File("palindromes.txt");
        Scanner myReader = new Scanner(myFile);
        int counter = 0;
        while (myReader.hasNextLine()) {
            String data = myReader.nextLine();
            lines[counter] = data;
            counter++;
        }
        myReader.close();
    }
    catch (FileNotFoundException e) {
        System.out.println("An error occurred.");
        e.printStackTrace();
    }
  System.out.println("there are " + lines.length + " lines");
  for (int i=0; i < lines.length; i++) 
  {
   
    if(palindrome(lines[i])==true)
    {
      System.out.println(lines[i] + " IS a palindrome.");
    }
    else
    {
      System.out.println(lines[i] + " is NOT a palindrome.");
    }
  }
}
public boolean palindrome(String word)
{
    word = noCapitals(word);
    //System.out.println(lines[i]);
    word = noSpaces(word);
    //System.out.println(lines[i]);
    word = onlyLetters(word);
    //System.out.println(lines[i]);
  if(reverse(word).equals(word)){
    return true;
  } else
  return false;
}
public String reverse(String str)
{
    String sNew = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            sNew = sNew + str.substring(i, i + 1);
        }
        return sNew;
}
public static String noCapitals(String str){
      return str.toLowerCase();
}
public static String noSpaces(String str){
  String s = "";
  for(int i = 0; i < str.length(); i++){
   if(str.charAt(i) !=' '){
    s = s + str.charAt(i);
    }
  }
  return s;
}
public static int numLetters(String str){
  int count = 0;
  for(int i = 0; i < str.length(); i++){
    if(Character.isLetter(str.charAt(i))){
      count++;
    }
  }
  return count;
}
public static String onlyLetters(String str){
  String s = "";
  for(int i = 0; i < str.length(); i++){
    if(Character.isLetter(str.charAt(i))){
      s = s + str.charAt(i);
    }
  }
  return s;
}
}
