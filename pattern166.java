public class pattern166 {
    public static void main(String[] args) {
        /*
        5       5
        44     44
        333   333
        2222 2222
        11111111
         */
        int n=5;
        for(int i=1;i<=n;i++)
        {
            if(i==n)
            {
                for(int j=1;j<=(n*2)-1;j++)
                {
                    System.out.print(n-i+1);
                }

            }
            else{
                for(int j=1;j<=i;j++)
                    System.out.print(n-i+1);
                for(int j=1;j<=((n-i)*2)-1;j++)
                    System.out.print(" ");
                for(int j=1;j<=i;j++)
                    System.out.print(n-i+1);}
            System.out.println();
        }

    }
}
