public class pattern158 {
    public static void main(String[] args) {
        /*
        543212345
        5432 2345
        543   345
        54     45
        5       5
         */
        int n=5;
        for(int i=1;i<=n;i++)
        {
            if(i==1)
            {
                for(int j=n;j>=1;j--)
                    System.out.print(j);
                for(int j=2;j<=n;j++)
                 System.out.print(j);
            }
            else {
                for (int j = 5; j >= i; j--)
                    System.out.print(j);
                for (int j = 2; j <= ((i - 1) * 2) ; j++)
                    System.out.print(" ");
                for (int j = i; j<=n; j++)
                    System.out.print(j);
            }
            System.out.println();
        }

    }
}
