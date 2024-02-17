public class pattern139 {
    public static void main(String[] args) {
        /*
          543212345
           4321234
            32123
             212
              1
             212
            32123
           4321234
          543212345
         */
        int n=5;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(" ");
            }
            for(int j=n-i+1;j>=1;j--)
            {
                System.out.print(j);
            }
            for(int j=2;j<=n-i+1;j++)
            {
                System.out.print(j);
            }
            System.out.println();
        }
        for(int i=2;i<=n;i++)
        {
            for(int j=i-1;j<n;j++)
            {
                System.out.print(" ");
            }
            for(int j=i;j>=1;j--)
            {
                System.out.print(j);
            }
            for(int j=2;j<=i;j++)
            {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
