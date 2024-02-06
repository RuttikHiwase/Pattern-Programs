public class pattern62 {
    public static void main(String[] args) {
        /*11   7    4   2   1
          12   8    5   2
          13   9    4
          14   10
          15
         */
        int n=5;
        int count=(n*(n+1)/2)-n+1;
        for(int i=1;i<=n;i++)
        {    int c=count++;
            for(int j=n;j>=i;j--)
            {
                System.out.print(c+"\t");
                c-=j-1;
            }
            System.out.println();
        }
    }
}
