public class pattern123 {
    public static void main(String[] args) {
        /*
                5
               454
              34543
             2345432
            123454321
         */
        int n=5;
        for(int i=1;i<=n;i++)
        {
            for(int j=i;j<n;j++)
            {
                System.out.print("  ");
            }
            for(int j=n-i+1;j>=n;j--)
            {
                System.out.print(j);
            }
            /*for(int j=n-1;j>=i;j--)
            {
                System.out.print("-");
            }
            */
            System.out.println();
        }
    }
}
