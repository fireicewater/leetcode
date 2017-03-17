package Solution;

import java.util.Map;

/**
 * The Hamming distance between two integers is the number of positions at which the corresponding bits are different.
 * 
 * Given two integers x and y, calculate the Hamming distance.
 * 
 * 0 ≤ x, y < 231.
 *
 *
 *
 * 
 * Output: 2
 * 
 * Explanation:
 * 1 (0 0 0 1)
 * 4 (0 1 0 0)
 *     ↑ ↑
 *
 * The above arrows point to positions where the corresponding bits are different.
 *
 *
 * 它就是将一个字符串变换成另外一个字符串所需要替换的字符个数
 */

public class HammingDistance{

    /**
     * Input: x = 1, y = 4
     * Integer.bitCount 方法 计算二进制数1的数量
     * ^ 为异或的标示 统计二进制中所有与的操作同阶中返回0 或1
     *
     * @param x
     * @param y
     * @return
     */
    public  int hammingDistance(int x,int y){
       return Integer.bitCount(x^y);
    }


}
