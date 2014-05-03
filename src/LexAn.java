/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.*;
/**
 *
 * @author beaner
 */
public class LexAn {
    symbolTable sT=new symbolTable();
    public LexAn()
    {
    }
    public void scan(String in)
    {
        String temp="";
        int x=0;
        while(x<in.length())
        {
            if(in.charAt(x)==' ')
            {
                String trim = temp.trim();
                boolean cond=reservedWord(trim);
                if(!cond)
                {
                    sT.add(new Symbol(trim));
                }
            }
            else
                temp+=in.charAt(x);
        }
    }
    public boolean reservedWord(String in)
    {
        String[] rL=new String[40];
        
        int[] rLT=new int[]{0, 18, 39, 40, 35, 33, 7, 34, 36, 38, 1, 2,
        4, 5, 8, 9, 10, 11, 12, 13, 15, 16, 17, 19, 20, 21, 22, 23, 49, 
        24, 25, 26, 37, 3, 29, 27, 28, 31, 30, 32}; 
        rL[0]="$";
        rL[1]="&";
        rL[2]="(";
        rL[3]=")";
        rL[4]="*";
        rL[5]="+";
        rL[5]=",";
        rL[6]="-";
        rL[7]="/";
        rL[8]=";";
        rL[9]="DECLARE";
        rL[10]="id";
        rL[11]="BOOLEAN";
        rL[12]="CHAR";
        rL[13]="NUMBER";
        rL[14]="INT";
        rL[15]="SMALLINT";
        rL[16]="POSITIVE";
        rL[17]="BEGIN";
        rL[18]="END";
        rL[19]="NULL";
        rL[20]="DBMS_OUTPUT.PUT_LINE";
        rL[21]="DBMS_OUTPUT.PUT";
        rL[22]="DBMS_OUTPUT.NEW_LINE";
        rL[23]="IF";
        rL[24]="THEN";
        rL[25]="WHILE";
        rL[26]="LOOP";
        rL[27]="c";
        rL[28]="num";
        rL[29]="TRUE";
        rL[30]="FALSE";
        rL[31]="NOT";
        rL[32]="MOD";
        rL[33]=":=";
        rL[34]="=";
        rL[35]=">";
        rL[36]=">=";
        rL[37]="<";
        rL[38]="<=";
        rL[39]="<>";
        for(int x=0;x<39;x++)
        {
            if(in.equals(rL[x]))
            {
                return true;
            }
        }
        return false;
    }
}
