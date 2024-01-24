public class pattern19 {
    public static void main(String[] args) {
        //    5
        //   44
        //  333
        // 2222
        //11111
        int n=5;
        for(int i=5;i>=1;i--)
        {
            for(int j=1;j<i;j++)
            {
                System.out.print(" ");
            }
            for(int j=i;j<=n;j++)
            {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
