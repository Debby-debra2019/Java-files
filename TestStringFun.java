
// Deborah Aguer
//COMP 1731 LAB7
//11/03/20





public class TestStringFun
{
    public static void main(String[] args) 
    {
        String test1 = "Okay";
        String test6 = "";
        String test7 = "neveroddoreven";
        String test8 = "never odd or even";
        System.out.println(StringFun.isPalindrome(test1));
        System.out.println(StringFun.isPalindrome(test6));
        System.out.println(StringFun.isPalindrome(test7));
        System.out.println(StringFun.isPalindrome(test8));

        String test2 = "Funny";
        String test3 = "melancholy";
        String test9 = "purple";

        System.out.println("Your manipulation is " + StringFun.manipulate(test2));
        System.out.println("Your manipulation is " +StringFun.manipulate(test3));
        System.out.println("Your manipulation is " +StringFun.manipulate(test9));

        String test4 = "bet";
        String test5 = "car";
        System.out.println("Your interwoven string is " + StringFun.interweave(test4, test5));

        String test10 = "cop";
        String test11 = "tea";
        System.out.println("Your interwoven string is " + StringFun.interweave(test10, test11));

        String test12 = "purple";
        String test13 = "you";
        System.out.println("Your interwoven string is " + StringFun.interweave(test12, test13));





    }  

}