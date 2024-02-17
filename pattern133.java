public class pattern133 {
    public static void main(String[] args) {
        /*
                1
               222
              33333
             4444444
            555555555
             4444444
              33333
               222
                1
         */
        int n=5;
        for(int i=1;i<=n;i++)
        {
            for(int j=i;j<n;j++)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=(i*2)-1;j++)
            {
                System.out.print(i);
            }
            System.out.println();
        }
        for(int i=2;i<=n;i++)
        {
            for(int j=1;j<i;j++)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=((n-i+1)*2)-1;j++)
            {
                System.out.print(n-i+1);
            }
            System.out.println();
        }
    }
}
