/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author beaner
 */
public class grammarTable {
    int[][] gT;
    public grammarTable()
    {
        
    }
    /*
    populate the grammarTable
    */
    public void populate()
    {
        gT = new int[][]{
            {0},                        //0
            {0, 43, 42, 41},         //1
            {44, 1, 42},             //2
            {42},                    //3
            {44, 38, 46, 45, 2, 44}, //4
            {44},                    //5
            {47, 3, 46},             //6
            {46},                    //7
            {48, 45},                //8
            {6, 45},                 //9
            {4, 45},                 //10
            {5, 48},                 //11
            {51, 8, 50},             //12    
            {50},                     //13
            {8, 7, 51},              //14
            {51},                    //15
            {40, 50, 39, 49},         //16
            {40, 50, 39, 9, 49},      //17
            {40, 50, 39, 10, 49},     //18
            {40, 50, 39, 11, 49},     //19
            {38, 13, 52, 12, 43},    //20
            {38, 14, 52},               //21
            {53, 52},            //22
            {54, 53},                //23
            {54, 38, 53, 53},                //24
            {55, 54},        //25
            {43, 54},                //26
            {40, 2, 39, 15, 54},                //27
            {40, 2, 39, 16, 54},     //28
            {17, 54},     //29    
            {2, 18, 54},                //30
            {19, 13, 54, 20, 56, 19, 54},             //31
            {22, 13, 54, 22, 56, 21, 54},                            //32
            {47, 3, 2, 55},                            //33
            {56, 47},                            //34
            {23, 47},                           //35
            {57, 56},                            //36
            {57, 58, 57, 56},                            //37
            {59, 57},                            //38
            {59, 61, 57, 57},                            //39
            {60, 59},                            //40
            {60, 62, 59, 59},                            //41
            {2, 60},                            //42
            {6, 60},                            //43
            {24, 60},                            //44
            {25, 60},                            //45
            {14, 60},                            //46
            {60, 26, 60},                            //47
            {27, 58},                            //48
            {28, 58},                            //49
            {29, 58},                            //50
            {30, 58},                            //51
            {31, 58},                            //52
            {32, 58},                            //53
            {33, 61},                            //54
            {34, 61},                //55
            {35, 62},                           //56
            {36, 62},                            //57
            {37, 62}                            //58
        };
        
        
    }
    
    public int[] getRule(int x){
        return gT[x];
    }
}
