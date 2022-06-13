class PascalsTriangle{
    public static void main(String args[]){
        for(int i=1;i<6;i++){
            for(int j=5-i;j>0;j--){System.out.print(" ");}
            System.out.println((int)Math.pow((Math.pow(10, i)-1)/9,2));
        }
    }
}