/*;
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author beaner
 */
public class lookupTable {
    int[][] lT=new int[106][63];
    public void lookupTable(){
        
    }
    /*
    setup of lookupTable
    */
    public void lookupTablepop()
    {
        for(int i=0;i<106;i++)
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
        
        lT[2][0] = 6;
        
        lT[3][12] = 7;
        lT[3][43] = 8;
        
        lT[4][4] = 9;
        lT[4][5] = 10;
        lT[4][8] = 11;
        lT[4][9] = 12;
        lT[4][10] = 13;
        lT[4][11] = 14;
        lT[4][45] = 15;
        lT[4][48] = 16;
        lT[4][49] = 17;
        
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
        
        lT[15] = fill(lT[15], -7);
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
        lT[23][6] = 44;
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
        lT[36][6] = 44;
        lT[36][24] = 45;
        lT[36][25] = 46;
        lT[36][26] = 47;
        lT[36][47] = 62;
        lT[36][56] = 63;
        lT[36][57] = 49;
        lT[36][59] = 50;
        lT[36][60] = 51;
        
        lT[37][38] = 64;
        
        lT[38][2] = 42;
        lT[38][14] = 43;
        lT[38][23] = 61;
        lT[38][6] = 44;
        lT[38][24] = 45;
        lT[38][25] = 46;
        lT[38][26] = 47;
        lT[38][47] = 65;
        lT[38][56] = 63;
        lT[38][57] = 49;
        lT[38][59] = 50;
        lT[38][60] = 51;
        
        lT[39] = fill(lT[39], -21);
        
        lT[40][2] = 66;
        
        lT[41][2] = 67;
        
        lT[42] = fill(lT[42], -42);
        
        lT[43] = fill(lT[43], -46);
        
        lT[44] = fill(lT[44], -43);
        
        lT[45] = fill(lT[45], -44);
        
        lT[46] = fill(lT[46], -45);
        
        lT[47][2] = 42;
        lT[47][14] = 43;
        lT[47][6] = 44;
        lT[47][24] = 45;
        lT[47][25] = 46;
        lT[47][26] = 47;
        lT[47][60] = 68;
        
        lT[48][20] = 69;
        
        lT[49] = fill(lT[49], -36);
        lT[49][29] = 70;
        lT[49][27] = 71;
        lT[49][28] = 72;
        lT[49][31] = 73;
        lT[49][30] = 74;
        lT[49][32] = 75;
        lT[49][33] = 76;
        lT[49][34] = 77;
        lT[49][58] = 78;
        lT[49][61] = 79;
        
        lT[50] = fill(lT[50], -38);
        lT[50][37] = 80;
        lT[50][35] = 81;
        lT[50][36] = 82;
        lT[50][62] = 83;
        
        lT[51] = fill(lT[51], -40);
        
        lT[52][22] = 84;
        
        lT[53] = fill(lT[53], -30);
        
        lT[54][38] = 85;
        
        lT[55][2] = 18;
        lT[55][12] = 7;
        lT[55][15] = 20;
        lT[55][16] = 21;
        lT[55][17] = 22;
        lT[55][19] = 23;
        lT[55][21] = 24;
        lT[55][18] = 25;
        lT[55][43] = 26;
        lT[55][54] = 86;
        lT[55][55] = 30;
        
        lT[56] = fill(lT[56], -15);
        lT[56][7] = 87;
        lT[56][51] = 88;
        
        lT[57][40] = 89;
        
        lT[58][40] = 90;
        
        lT[59][40] = 91;
        
        lT[60][40] = 92;
        
        lT[61] = fill(lT[61], -35);
        
        lT[62] = fill(lT[62], -6);
        
        lT[63] = fill(lT[63], -34);
        
        lT[64] = fill(lT[64], -5);
        lT[64][2] = 4;
        lT[64][44] = 93;
        
        lT[65] = fill(lT[65], -33);
        
        lT[66][40] = 94;
        
        lT[67][40] = 95;
        
        lT[68] = fill(lT[68], -47);
        
        lT[69][2] = 18;
        lT[69][12] = 7;
        lT[69][15] = 20;
        lT[69][16] = 21;
        lT[69][17] = 22;
        lT[69][19] = 23;
        lT[69][21] = 24;
        lT[69][18] = 25;
        lT[69][43] = 26;
        lT[69][54] = 96;
        lT[69][55] = 30;
        
        lT[70] = fill(lT[70], -50);
        
        lT[71] = fill(lT[71], -48);
        
        lT[72] = fill(lT[72], -49);
        
        lT[73] = fill(lT[73], -52);
        
        lT[74] = fill(lT[74], -51);
        
        lT[75] = fill(lT[75], -53);
        
        lT[76] = fill(lT[76], -54);
        
        lT[77] = fill(lT[77], -55);
        
        lT[78][2] = 42;
        lT[78][14] = 43;
        lT[78][6] = 44;
        lT[78][24] = 45;
        lT[78][25] = 46;
        lT[78][26] = 47;
        lT[78][57] = 97;
        lT[78][59] = 50;
        lT[78][60] = 51;
        
        lT[79][2] = 42;
        lT[79][14] = 43;
        lT[79][6] = 44;
        lT[79][24] = 45;
        lT[79][25] = 46;
        lT[79][26] = 47;
        lT[79][59] = 98;
        lT[79][60] = 51;
        
        lT[80] = fill(lT[80], -58);
        
        lT[81] = fill(lT[81], -56);
        
        lT[82] = fill(lT[82], -57);
        
        lT[83][2] = 42;
        lT[83][14] = 43;
        lT[83][6] = 44;
        lT[83][24] = 45;
        lT[83][25] = 46;
        lT[83][26] = 47;
        lT[83][60] = 99;
        
        lT[84][2] = 18;
        lT[84][12] = 7;
        lT[84][15] = 20;
        lT[84][16] = 21;
        lT[84][17] = 22;
        lT[84][19] = 23;
        lT[84][21] = 24;
        lT[84][18] = 25;
        lT[84][43] = 26;
        lT[84][54] = 100;
        lT[84][55] = 30;
        
        lT[85] = fill(lT[85], -20);
        
        lT[86] = fill(lT[86], -24);
        
        lT[87][6] = 101;
        
        lT[88] = fill(lT[88], -12);
        
        lT[89] = fill(lT[89], -16);
        
        lT[90] = fill(lT[90], -17);
        
        lT[91] = fill(lT[91], -18);
        
        lT[92] = fill(lT[92], -19);
        
        lT[93] = fill(lT[93], -4);
        
        lT[94] = fill(lT[94], -27);
        
        lT[95] = fill(lT[95], -28);
        
        lT[96][13] = 102;
        
        lT[97] = fill(lT[97], -37);
        lT[97][33] = 76;
        lT[97][34] = 77;
        lT[97][61] = 79;
        
        lT[98] = fill(lT[98], -39);
        lT[98][37] = 80;
        lT[98][35] = 81;
        lT[98][36] = 82;
        lT[98][62] = 83;
        
        lT[99] = fill(lT[99], -41);
        
        lT[100][13] = 103;
        
        lT[101] = fill(lT[101], -14);
        
        lT[102][19] = 104;
        
        lT[103][22] = 105;
        
        lT[104] = fill(lT[104], -31);
        
        lT[105] = fill(lT[105], -32);
    }
    /*
    fills row if default value is used
    */
    public int[] fill(int[] row,int num)
    {
        for(int i = 0; i < row.length; i++)
        {
            row[i] = num;
        }
        return row;
    }
    /*
    print the lookup table
    */
    public void print()
    {
        for(int x=0;x<106;x++)
        {
            for(int y=0; y<63;y++)
            {
                System.out.print(lT[x][y]+" ");
            }
            System.out.println();
        }
    }
    public int fuck(int x, int y)
    {
        //System.out.println("query lookup table at "+x+" "+y);
        return lT[x][y];
    }
    /*
    return the new state
    param(current state, symbol in)
    */
    public int rState(int cur, int sym)
    {
        return(lT[cur][sym]);
    }
}
