public class pattern118 {
    public static void main(String[] args) {
        /*        1   ERROR
                 222
                33333
               4444444
              555555555
         */
        int n=5;
        for(int i=1;i<=n;i++)
        {
            for(int j=i;j<n;j++)
            {
                System.out.print(" ");
            }
            for(int j=i;j<=(i*2)-1;j++)
            {
                System.out.print(n-i+1);
            }
            System.out.println();
        }

    }
}
