public class PalindromeNumber {

    public static void main(String[] args) {

        System.out.println(solution(-121));

    }
    public static boolean solution(int x){

        String str_x = String.valueOf(x);

        String str_x_rev = new StringBuilder(str_x).reverse().toString();

        return  str_x.equals(str_x_rev);
    }
}
