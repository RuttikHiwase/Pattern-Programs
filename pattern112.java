public class pattern112 {
    public static void main(String[] args) {
        /*
         12345
         1234
         123
         12
         1
         12
         123
         1234
         12345*/
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
                for(int j=n;j<=i;j++)
                {
                    System.out.print(j);
                }
            System.out.println();
        }
    }
}
