import java.util.Scanner;

public class AAABA_armstrong {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String n = s.nextLine();

        int leng = n.length();
        double sum = 0;
        int i = leng - 1;
        while (i >= 0) {
        sum = sum + Math.pow(n.charAt(i) - '0'/*minus 0 is done in order to convert character into digit */, (double) leng);
        i--;
        }
        System.out.println(sum);
        if (n.equals(Integer.toString((int) sum))) {
            System.out.println("armstrong number");
        } else {
            System.out.println("not armstrong number");
        }
    }
}
