public class pattern40 {
    public static void main(String[] args) {
        //ABCDE
        // BCDE
        //  CDE
        //   DE
        //    E
        int n=5;
        for(int i=1;i<=5;i++)
        {
            for(int j=1;j<i;j++)
            {
                System.out.print(" ");
            }
            for(int j=i;j<=n;j++)
            {
                System.out.print((char)(j+64));
            }
            System.out.println();
        }
    }
}
