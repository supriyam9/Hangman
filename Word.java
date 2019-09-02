//Supriya Maddineni

   public class Word
   {
      private String myWord;
      private double[] FArray;
      public Word(String word)
      {
         /*int pos1 = address.indexOf("@");
         int pos2 = address.indexOf(".");
         myHostName = address.substring(pos1+1, pos2);
         myExtension = address.substring(pos2+1);
         myUserName = address.substring(0,pos1);*/
         
         myWord = word;
         System.out.println(myWord);
         
      }
      public String getWord()
      {
         return myWord;
      }
      public String toString()
      {
         return myWord;
      }
      
   }