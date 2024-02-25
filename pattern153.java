public class pattern153 {
    public static void main(String[] args) {
        /*
        EdCbAbCdE
         dCbAbCd
          CbAbC
           bAb
            A
         */
        int n=5;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++) {
                System.out.print(" ");
            }
            for(int j=n-i+1;j>=1;j--)
            {
                if(j%2!=0)
                    System.out.print((char)(j+64));
                else
                    System.out.print((char)(j+96));
            }
            for(int j=2;j<=n-i+1;j++)
            {
                if(j%2!=0)
                    System.out.print((char)(j+64));
                else
                    System.out.print((char)(j+96));
            }
            System.out.println();

        }
    }
}
