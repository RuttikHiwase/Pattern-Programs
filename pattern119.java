public class pattern119 {
    public static void main(String[] args) {
        /*
                5
               444
              33333
             2222222
            111111111
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
                System.out.print(n-i+1);
            }
            System.out.println();
        }

    }
}
