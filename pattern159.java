public class pattern159 {
    public static void main(String[] args) {
        /*
        543212345
        4321 1234
        321   123
        21     12
        1       1
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
                for (int j = n-i+1; j>=1; j--)
                    System.out.print(j);
                for (int j = 2; j <= ((i - 1) * 2) ; j++)
                    System.out.print(" ");
                for (int j =1; j<=n-i+1; j++)
                    System.out.print(j);
            }
            System.out.println();
        }

    }
}
