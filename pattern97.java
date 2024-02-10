public class pattern97 {
    public static void main(String[] args) {
        /*5
          44
          333
          2222
          11111
          2222
          333
          44
          5
         */
        int n=5;
        for(int i=1;i<=(n*2)-1;i++)
        {
            if(i<=n)
            {
                for(int j=1;j<=i;j++)
                {
                    System.out.print(n-i+1);
                }
            }
            else
                for(int j=1;j<=(n*2)-i;j++)
                {
                    System.out.print(n-((n*2)-i)+1);
                }
            System.out.println();
        }
    }
}
