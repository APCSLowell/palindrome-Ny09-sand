public void setup()
{
  String lines[] = loadStrings("palindromes.txt");
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
  return (word.equals(reverse(word))); 

}
public String reverse(String str)
{
    String s = new String("");
    if (str.length()==0) {return "";} 
    for ( int i = str.length()-1; i >= 0 ; i --){
      s+=str.substring(i,i+1); 
      if (str.substring(i,i+1).equals(" ")){
        s+=" " ; 
      } 
    }
    return s;
}
