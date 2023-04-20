
public class AAAAN_quantifiers{
    public static void main(String[] arg)
    {
        String str1="hello";
        System.out.println(str1.matches(".*")); //repetetion of characters any no of times

        String str2="abm";
        System.out.println(str2.matches("[abc].*")); 

        String str3 = "xabc";
        System.out.println(str3.matches("[abc].*"));

        String str4="acccccccc";// false
        System.out.println(str4.matches("[abc].{3,7}"));//atleast 3 but not more than 7

        String str5="rsarthak49@gmail.com";
        System.out.println(str5.matches("\\W.*gmail.*"));///THIS ONE IS VERY IMPORTANT 

    } 
}