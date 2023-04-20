import javax.lang.model.util.ElementScanner14;

public class AAAAO_findTheGmailIDisOngmailOrNot {
    
   public static void main(String [] arg){
    
    String str1="rsarthak49@gmail.com";
     
    int i=str1.lastIndexOf("@");
   // System.out.println(i);

    String substring=str1.substring(0,i); 
    System.out.println(substring);
    
    
    String domain=str1.substring(i+1,str1.length());
    
    System.out.println(domain);
    System.out.println(domain.startsWith("gmail"));

   

   
    
   } 
}
