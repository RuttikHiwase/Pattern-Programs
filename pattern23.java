public class pattern23 {
    public static void main(String[] args) {
        //    5
        //   45
        //  345
        // 2345
        //12345
        int n=5;
        for(int i=5;i>=1;i--)
        {
            for(int j=i;j>1;j--)
            {
                System.out.print(" ");
            }
            for(int j=i;j<=n;j++)
            {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
