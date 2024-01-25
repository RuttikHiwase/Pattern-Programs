public class pattern26 {
    public static void main(String[] args) {
        //    E
        //   DD
        //  CCC
        // BBBB
        //AAAAA
        int n=5;
        for(int i=5;i>=1;i--)
        {
            for(int j=i;j>1;j--)
            {
                System.out.print(" ");
            }
            for(int j=5;j>=i;j--)
            {
                System.out.print((char)(i+64));
            }
            System.out.println();
        }
    }
}
