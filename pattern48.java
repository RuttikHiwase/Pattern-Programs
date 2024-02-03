public class pattern48 {
    public static void main(String[] args) {
        /* 1  2  3  4  5
           6  7  8  9
           10 11 12
           13 14
           15
         */
        int n=5;
        int count=1;
        for(int i=5;i>=1;i--)
        {
            int c=count;
            for(int j=i;j>=1;j--)
            {
                System.out.print(c+"\t");
                c++;
            }count+=i;
            System.out.println();
        }
    }
}
