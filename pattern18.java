public class pattern18 {
    public static void main(String[] args) {
        //e
        //de
        //cde
        //bcde
        //abcde
        int n=5;
        for(int i=n;i>=1;i--)
        {
            for(int j=i
                ;j>=1;j--)
            {
                System.out.print((char)(i+96));
            }
            System.out.println();
        }
    }
}
