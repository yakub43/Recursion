public class ProductOfDigits {
    public static void main(String[] args) {
        int ans = digitsProduct(1432);
        System.out.println(ans);
    }
    public static int digitsProduct(int n){
        if (n % 10 == n){
            return n;
        }
        return (n % 10) * digitsProduct(n/10);
    }
}
