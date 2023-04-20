public class AAAAK_Strings {
    public static void main(String[] arg)
    {
        //different methods of printing string.
          String str1=new String("JAVA ");//new("JAVA")object in heap memory+literal ("JAVA") in pool memory
          String str2="java";// only "java" literal in pool memory
          char c[]={'j','a','v','a','a'};
          byte a[]={65,66,67,68,69,70};
          System.out.println(str1);
          System.out.println(str2);
          System.out.println(c);
          String str3=new String(c);
          System.out.println(c);
          String str4=new String(a);
          System.out.println(str4);
          String str5=new String(a,2,2);
          System.out.println(str5);

          String str6="Java";
          String str7="lava";
           System.out.println(str6==str7); //false will be the output
            
    }
}
