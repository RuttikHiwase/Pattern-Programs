public class pattern28 {
    public static void main(String[] args) {
        //    A
        //   BA
        //  CBA
        // DCBA
        //EDCBA
        int n=5;
        for(int i=1;i<=5;i++)
        {
            for(int j=i;j<n;j++)
            {
                System.out.print(" ");
            }
            for(int j=i;j>=1;j--)
            {
                System.out.print((char)(j+64));
            }
            System.out.println();
        }
    }
}
