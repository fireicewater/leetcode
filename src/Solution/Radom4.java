package Solution;

import java.util.Random;

/**
 * Created by Administrator on 2017/1/3.
 */
public class Radom4 {

    public static void main(String[] args) {
        GetCode();
    }

    public static void GetCode() {
        Random random = new Random();
        for (int i = 0; i < 90; i++) {
            String fourRandom = random.nextInt(10000) + "";
            int randLength = fourRandom.length();
            if(randLength<4){
                for(int j=1; j<=4-randLength; j++)
                    fourRandom = "0" + fourRandom ;
            }
            System.out.println("RBK-AMBASSADOR-25-"+fourRandom);
        }

    }
}
