public class pattern103 {
    public static void main(String[] args) {
        /*1
          1A
          1B1
          1C1D1
          1E1F1*/
        int n=5; char c='A';
        for(int i=1;i<=5;i++)
        {
            for(int j=1;j<=i;j++)
            {
                if(j%2!=0)
                {
                    System.out.print(1);
                }
                else
                    System.out.print(c++);

            }
            System.out.println();
        }
    }
}
