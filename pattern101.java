public class pattern101 {
    public static void main(String[] args) {
        /*5
          45
          345
          2345
          12345
          2345
          345
          45
          5
         */
        int n=5;
        for(int i=1;i<=(n*2)-1;i++)
        {
            if(i<=n)
            {
                for(int j=1;j<=i;j++)
                {
                    System.out.print(n-i+j);
                }

            }
            else
                for(int j=(n*2)-i;j>=1; j--)
                {
                    System.out.print(n-j+1);
                }
            System.out.println();
        }
    }
}
