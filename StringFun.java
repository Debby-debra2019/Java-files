
// Deborah Aguer
//COMP 1731 LAB7
//11/03/20



public class StringFun
{
    public static boolean isPalindrome(String str)
    {
        if (str.equals(""))
        {
            return true;
        }
        else
        {
            String revStr = "";
            int len = str.length();

            for (int i = len -1; i >= 0; i --)
            {
                revStr = revStr + str.charAt(i);
            }

            System.out.println(" Our reverse String is " + revStr);

            if (revStr.equals(str))
            {
                return true;
            }
            else{
                return false;
            }
        }
    }
    public static String manipulate(String str)
    {
        int len = str.length();
        if (len%2 == 0)
        {
            int splitspot = (len/2)-1;
            String firstHalf = str.substring(0, splitspot+1);
            String secondHalf = str.substring(splitspot+1);
            return secondHalf+firstHalf;
        }
        else
        {
            String revStr = "";
            for (int i = len -1; i >= 0; i --)
            {
                revStr = revStr + str.charAt(i);
            }
            return revStr;


        }
            
    }

    public static String interweave(String str1, String str2)
    {
        int len1 = str1.length();
        int len2 = str2.length();
        if (len1 != len2)
        {
            return null;
        }
        else
        {
            String str3 = "";
           for(int i = 0; i< len1; i++)
           {
                char ch1 = str1.charAt(i);
                char ch2 = str2.charAt(i);
                str3 = str3 +ch1 +ch2;
           } 

           return str3;   

        }
    }
}