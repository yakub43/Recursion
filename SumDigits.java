public class SumDigits {
    public static void main(String[] args) {
        int ans = SumOfDigits(1342);
        System.out.println(ans);
    }

    public static int SumOfDigits(int n){
        if (n == 0){
            return 0;
        }
        return (n % 10)+ SumOfDigits(n / 10);
    }
}
