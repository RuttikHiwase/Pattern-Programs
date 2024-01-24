public class pattern16 {
    public static void main(String[] args) {
        //a
        //ab
        //abc
        //acbd
        //abcde
        int n=5;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print((char)(j+96));
            }
            System.out.println();
        }
    }
}
