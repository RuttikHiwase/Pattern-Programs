public class pattern113 {
    public static void main(String[] args) {


    /*
    54321
    5432
    543
    54
    5
    54
    543
    5432
    54321*/
        int n = 5;
        for (int i = 1; i <= (n * 2) - 1; i++) {
            if (i <= n) {
                for (int j = n; j >= i; j--) {
                    System.out.print(j);
                }

            } else
                for (int j = n; j <= i; j++) {
                    System.out.print((n * 2) - j);
                }
            System.out.println();
        }
    }
}