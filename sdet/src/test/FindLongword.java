package test;


public class FindLongword 
{
	//Parsing the String need to process
	static String s= "The Cow jumped over the moon";
    //Since returning Value in Integer creating method as Long
    static long longword(String s) 
    {
    	//Using Split removing the space and storing the value in Array
    	 String [] word = s.split(" ");
 String maxlethWord = "";
 //Logic for checking which string length is maximum
 for(int i = 0; i < word.length; i++){
         if(word[i].length() >= maxlethWord.length()){
               maxlethWord = word[i];
         } 
 }
 
 //Printing the result
 System.out.println("The Max lenght of the word is :::"+maxlethWord.length());
  System.out.println("The Max lenght  word is :::"+maxlethWord);
  int leng= (int)maxlethWord.length();
  //Returning the interger
return leng; 
    
    //return(maxlethWord.length());
}
    public static void main(String[] args) {
        longword(s); // Display the string.
    }
}