public class CountZeroes {
    static int count = 0;
    public static void main(String[] args) {
        System.out.println(countZero(302040));
        System.out.println(countZero2(302040));
    }

    public static int countZero(int n){
        if(n%10 == n){
            return count;
        }
        int rem = n % 10;
        if (rem == 0) {
            count++;
        }

        return countZero(n/10);
    }

    public static int countZero2(int n){
        return helper(n, 0);
    }

    private static int helper(int n, int c){
        if (n == 0){
            return c;
        }
        int rem = n % 10;
        if (rem == 0){
            return helper(n/10, c + 1);
        }
        return helper(n / 10, c);
    }
}
