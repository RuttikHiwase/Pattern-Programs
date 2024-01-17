class pattern{
    public static void main(String[] args) {
        //11111
        //2222
        //333
        //44
        //5
        int n=5;
        for(int i=1;i<=5;i++) {
            for (int j = i; j <= n; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}