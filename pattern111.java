public class pattern111 {
    public static void main(String[] args) {
        /*ERRO2
12345
2345
345
45
5
45
345
2345
12345
        */
        int n=5;
        for(int i=1;i<=(n*2)-1;i++)
        {
            if(i<=n)
            {
                for(int j=i;j<=n;j++)
                {
                    System.out.print(j);

                }
            }
            else
                for(int j=(n*2)-i;j>=n;j--)
                {
                    System.out.print((n*2)-j);
                }
            System.out.println();
        }

    }
}
