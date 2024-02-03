public class pattern37 {
    public static void main(String[] args) {
        //54321
        // 5432
        //  543
        //   54
        //    5
        int n=5;
        for(int i=1;i<=5;i++)
        {
            for(int j=i;j>1;j--)
            {
                System.out.print(" ");
            }
            for(int j=n;j>=i;j--)
            {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
