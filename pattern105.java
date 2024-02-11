public class pattern105 {
    public static void main(String[] args) {
        /*A
          aB
          AbC
          aBcD
          AbCdE
         */
        int n=5;
        for(int i=1;i<=n;i++)
        {int c=1;
            for(int j=i;j>=1;j--)
            {
                if(j%2!=0)
                {
                    System.out.print((char)((c++)+64));
                }
                else
                    System.out.print((char)((c++)+96));
            }
            System.out.println();
        }
    }
}
