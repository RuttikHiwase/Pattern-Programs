public class pattern149 {
    public static void main(String[] args) {
        /*
        123454321
         2345432
          34543
           454
            5
         */
        int n=5;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<i;j++){
                System.out.print(" ");
            }
            for(int j=i;j<=n;j++)
            {
                System.out.print(j);
            }
            for(int j=n-1;j>=i;j--)
            {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
