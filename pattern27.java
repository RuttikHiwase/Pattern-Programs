public class pattern27 {
    public static void main(String[] args) {
        //    A
        //   AB
        //  ABC
        // ABCD
        //ABCDE
        int n=5;
        for(int i=1;i<=5;i++)
        {
            for(int j=n;j>i;j--)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++)
            {
                System.out.print((char)(j+64));
            }
            System.out.println();
        }
    }
}
