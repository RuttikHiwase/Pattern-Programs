public class pattern155 {
    public static void main(String[] args) {
        /*
        123454321
        1234 4321
        123   321
        12     21
        1       1
         */
        int n=5;
        for(int i=1;i<=n;i++)
        {
            if(i==1)
            {
                for(int j=1;j<=n;j++)
                System.out.print(j);
                for(int j=n-i;j>=1;j--)
                    System.out.print(j);
            }
            else {
                for (int j = 1; j <= n - i + 1; j++)
                    System.out.print(j);
                for (int j = 1; j <= ((i - 1) * 2) - 1; j++)
                    System.out.print(" ");
                for (int j = n - i + 1; j >= 1; j--)
                    System.out.print(j);
            }
            System.out.println();
        }
    }
}
