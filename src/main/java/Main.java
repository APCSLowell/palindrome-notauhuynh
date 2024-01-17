

public class Main {
 
	public static void main(final String[] args) {
		PalindromeChecker sim = new PalindromeChecker();
        	sim.tester();
		String lines[] = "test", "rotator", "rewriter", "nurses run", "Madam, I'm Adam!", "A Man! A Plan! A Canal! Panama!";
 		 String present[] = "test", "rotator", "rewriter", "nurses run", "Madam, I'm Adam!", "A Man! A Plan! A Canal! Panama!";
		  System.out.println("there are " + lines.length + " lines");
  //System.out.println(noCapitals("ALLCAPS"));
  //System.out.println(noSpaces("S P A C E S"));
  //System.out.println(onlyLetters("!!!!!!!!!!!!a"));
  for (int i=0; i < lines.length; i++) 
  {
    lines[i] = noCapitals(lines[i]);
    //System.out.println(lines[i]);
    lines[i] =  noSpaces(lines[i]);
    //System.out.println(lines[i]);
    lines[i] = onlyLetters(lines[i]);
    //System.out.println(lines[i]);
    if(palindrome(lines[i])==true)
    {
      System.out.println(present[i] + " IS a palindrome.");
    }
    else
    {
      System.out.println(present[i] + " is NOT a palindrome.");
    }
  }
}
public static boolean palindrome(String word)
{
  if(reverse(word).equals(word)){
    return true;
  } else
  return false;
}
public static String reverse(String str)
{
    String sNew = new String();
    for(int i = str.length(); i > 0; i--){
     sNew = sNew + str.substring(i - 1, i);
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

