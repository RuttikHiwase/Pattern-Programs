public class pattern25 {
    public static void main(String[] args) {
        //    A
        //   BB
        //  CCC
        // DDDD
        //EEEEE
        int n=5;
        for(int i=1;i<=5;i++)
        {
            for(int j=5;j>i;j--)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++)
            {
                System.out.print((char)(i+64));
            }
            System.out.println();
        }
    }
}
