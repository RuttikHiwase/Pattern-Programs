public class pattern42 {
    public static void main(String[] args) {
        //EDCBA
        // EDCB
        //  EDC
        //   ED
        //    E
        int n=5;
        for(int i=1;i<=5;i++)
        {
            for(int j=i;j>1;j--)
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
