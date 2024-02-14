public class pattern117 {
    public static void main(String[] args) {
    /*
             *
            *A*
           *B*C*
          *D*E*F*
         *G*H*I*J*

     */
        int n=5;
        int count=1;
        for(int i=1;i<=n;i++)
        {
            for(int j=i;j<n;j++)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=(i*2)-1;j++)
                if(j%2!=0)
                {
                    System.out.print("*");
                }
            else
                    System.out.print((char)(count++ +64));

        System.out.println();
    }}}

