public class pattern110 {
    public static void main(String[] args) {
        /*
        55555
        4444
        333
        22
        1
        22
        333
        4444
        55555
         */
        int n=5;
        for(int i=1;i<=(n*2)-1;i++)
        {
            if(i<=n)
                for(int j=i;j<=n;j++)
                {
                    System.out.print(n+1-i);
                }
            else
                for(int j=n;j<=i;j++)
                {
                    System.out.print(i-n+1);

            }
            System.out.println();
        }
    }
}
