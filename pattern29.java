public class pattern29 {
    public static void main(String[] args) {
        //    E
        //   ED
        //  EDC
        // EDCB
        //EDCBA
        int n=5;
        for(int i=5;i>=1;i--)
        {
            for(int j=1;j<i;j++)
            {
                System.out.print(" ");
            }
            for(int j=n;j>=i;j--)
            {
                System.out.print((char)(j+64));
            }
            System.out.println();
        }
    }
}
