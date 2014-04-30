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
    int[][] lT=new int[106][63];
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
        
        lT[5] = fill(lT[5], -2);
        
        lT[6] = fill(lT[6], 0);
        
        lT[7][2] = 18;
        lT[7][12] = 7;
        lT[7][14] = 19;
        lT[7][15] = 20;
        lT[7][16] = 21;
        lT[7][17] = 22;
        lT[7][19] = 23;
        lT[7][21] = 24;
        lT[7][18] = 25;
        lT[7][43] = 26;
        lT[7][52] = 27;
        lT[7][53] = 28;
        lT[7][54] = 29;
        lT[7][55] = 30;
        
        lT[8][0] = 31;
        
        lT[9] = fill(lT[9], -10);
        
        lT[10] = fill(lT[10], -11);
        
        lT[11][39] = 32;
        
        lT[12][39] = 33;
        
        lT[13][39] = 34;
        
        lT[14][39] = 35;
        
        lT[15] = fill(lT[16], -7);
        lT[15][3] = 36;
        lT[15][46] = 37;
        
        lT[16] = fill(lT[16], -8);
        
        lT[17] = fill(lT[17], -9);
        
        lT[18][3] = 38;
        
        lT[19][38] = 39;
        
        lT[20][39] = 40;
        
        lT[21][39] = 41;
        
        lT[22] = fill(lT[22], -29);
        
        lT[23][2] = 42;
        lT[23][14] = 43;
        lT[23][49] = 44;
        lT[23][24] = 45;
        lT[23][25] = 46;
        lT[23][26] = 47;
        lT[23][56] = 48;
        lT[23][57] = 49;
        lT[23][59] = 50;
        lT[23][60] = 51;
        
        lT[24][2] = 42;
        lT[24][14] = 43;
        lT[24][6] = 44;
        lT[24][24] = 45;
        lT[24][25] = 46;
        lT[24][26] = 47;
        lT[24][56] = 52;
        lT[24][57] = 49;
        lT[24][59] = 50;
        lT[24][60] = 51;
        
        lT[25][2] = 53;
        
        lT[26] = fill(lT[26], -26);
        
        lT[27][13] = 54;
        
        lT[28] = fill(lT[28], -22);
        lT[28][38] = 55;
        
        lT[29] = fill(lT[29], -23);
        
        lT[30] = fill(lT[30], -25);
        
        lT[31] = fill(lT[31], -1);
        
        lT[32] = fill(lT[32], -13);
        lT[32][6] = 56;
        lT[32][50] = 57;
        
        lT[33] = fill(lT[33], -13);
        lT[33][6] = 56;
        lT[33][50] = 58;
        
        lT[34] = fill(lT[34], -13);
        lT[34][6] = 56;
        lT[34][50] = 59;
        
        lT[35] = fill(lT[35], -13);
        lT[35][6] = 56;
        lT[35][50] = 60;
        
        lT[36][2] = 42;
        lT[36][14] = 43;
        lT[36][23] = 61;
        lT[36][8] = 44;
        lT[36][24] = 45;
        lT[36][25] = 46;
        lT[36][26] = 47;
        lT[36][47] = 62;
        lT[36][56] = 53;
        lT[36][57] = 49;
        lT[36][59] = 50;
        lT[36][60] = 51;
        
        lT[37][33] = 64;
    }
    
    public int[] fill(int[] row,int num)
    {
        for(int i = 0; i < row.length; i++)
        {
            row[i] = num;
        }
        return row;
    }
}
