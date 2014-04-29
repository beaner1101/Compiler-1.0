/*;
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package compiler;

/**
 *
 * @author beaner
 */
public class lookupTable {
    int[][] lT=new int[63][106];
    public lookupTable()
    {
        for(int i=0;i<lT.length;i++)
        {
            lT[i] = fill(lT[i], 9999);
        }
        
        lT[0] = fill(lT[0], -3);
        lT[0][1] = 1;
        lT[0][41] = 2;
        lT[0][42] = 3;
        
        lT[1] = fill(lT[1], -5);
        lT[1][2] = 4;
        lT[1][44] = 5;
        
        lT[2][13] = 6;
        
        lT[3][12] = 7;
        lT[3][43] = 8;
        
        lT[4][4] = 9;
        lT[4][5] = 10;
        
    }
    
    public int[] fill(int[] row,int num){
        for(int i = 0; i < row.length; i++){
            row[i] = num;
        }
        return row;
    }
}
