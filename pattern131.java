public class pattern131 {
    public static void main(String[] args) {
        /*ERROR
        /*ERROR
                 *
                ***
               *****
              *******
             *********
              *******
               *****
                ***
                 *
         */
        int n=5;
        for(int i=1;i<=n;i++) {
            for (int j = i; j < n; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            for (int j = i - 1; j >= 1; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=2;i<=n;i++)
        {
            for(int j=1;j<i;j++)
            {
                System.out.print(" ");
            }for(int j=1;j<=n-i+1;j++)
                {
                    System.out.print("*");
                }
                for(int j=n-i;j>=1;j--){
                    System.out.print("*");}

            System.out.println();
        }
    }
}
