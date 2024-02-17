public class pattern137 {
    public static void main(String[] args) {
        /*
                 5
                454
               34543
              2345432
             123454321
              2345432
               34543
                454
                 5*/
         int n=5;
         for(int i=1;i<=n;i++)
         {
             for(int j=i;j<n;j++)
             {
                 System.out.print(" ");
             }
             for(int j=n-i+1;j<=n;j++)
             {
                 System.out.print(j);
             }
             for(int j=n+1-2;j>=n-i+1;j--)
             {
                 System.out.print(j);
             }
             System.out.println();
         }
         for(int i=2;i<=n;i++)
         {
             for(int j=1;j<i;j++)
             {
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
