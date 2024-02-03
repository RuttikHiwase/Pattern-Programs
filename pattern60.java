public class pattern60 {
    public static void main(String[] args) {
        /*
        5   9   12   14   15
        4   8  11    13
        3   7  10
        2   6
        1
         */
        int n=5;
        int count=n;
        for(int i=n;i>=1;i--)
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
