public class pattern54 {
    public static void main(String[] args) {
         /* 5
            4  9
            3  8   12
            2  7   11  14
            1  6   10  15

          */
        int n=5;
        int count=n;
        for(int i=5;i>=1;i--)
        {
            int c=count--;
            for(int j=n;j>=i;j--)
            {
                System.out.print(c+"\t");
                c+=j;
            }
            System.out.println();
        }




    }
}
