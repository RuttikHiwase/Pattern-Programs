public class pattern156 {
    public static void main(String[] args) {
        /*
        1111111111
        2222 2222
        333   333
        44     44
        5       5
         */
        int n=5;
        for(int i=1;i<=n;i++)
        {
            if(i==1)
            {
                for(int j=1;j<=((n*2)-1);j++)
                    System.out.print(1);
                ///for(int j=n-i;j>=1;j--)
                   // System.out.print(j);
            }
            else {
                for (int j = 2; j <= n - i + 2; j++)
                    System.out.print(i);
                for (int j = 2; j <= ((i - 1) * 2) ; j++)
                    System.out.print(" ");
                for (int j = n - i + 1; j >= 1; j--)
                    System.out.print(i);
            }
            System.out.println();
        }

    }
}
