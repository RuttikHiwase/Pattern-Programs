public class pattern160 {
    public static void main(String[] args) {
        /*
        ABCDEDCBA
        BCDE EDCB
        CDE   EDC
        DE     ED
        E       E  */

        int n=5;
        for(int i=1;i<=n;i++)
        {
            if(i==1)
            {
                for(int j=1;j<=n;j++)
                    System.out.print((char)(j+64));
                for(int j=n-i;j>=1;j--)
                    System.out.print((char)(j+64));
            }
            else {
                for (int j = i; j <= n ; j++)
                    System.out.print((char)(j+64));
                for (int j = 2; j <= ((i - 1) * 2) ; j++)
                    System.out.print(" ");
                for (int j = n; j >= i; j--)
                    System.out.print((char)(j+64));
            }
            System.out.println();
        }

    }
}
