
public class Main {

    public static void main(String[] args) {

        int rastgeleSayı =9;
        int[] yatay = new int[8];
        for(int i=0;i<8;i++){
            boolean kontrol= false;
            while(!kontrol) {
                kontrol=true;
                rastgeleSayı =  (int)(Math.random()*9);
                //System.out.println(rastgeleSayı);
                for(int j=0;j<8; j++){
                    if(rastgeleSayı==yatay[j]){
                        kontrol= false;

                    }
                }
            }
            //System.out.println("---"+rastgeleSayı);
            yatay[i]=rastgeleSayı;
        }
        for(int i=0;i<8;i++){

            //System.out.println(yatay[i]);
        }


        for(int i=1;i<=8;i++){
            System.out.println();
            for(int j=1;j<=8;j++){

                if (yatay[i-1]!=j) {
                    System.out.print("0 ");
                }else{
                    System.out.print("K ");
                }
            }
        }



    }
}
