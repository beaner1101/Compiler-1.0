/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.*;
import java.util.*;
/**
 *
 * @author beaner
 */
public class LexAn {
    Scanner s = new Scanner(System.in);
    symbolTable sT=new symbolTable();
    Stack sck = new Stack();
    Stack stck=new Stack();
    int x=0;
    String[] rL;
    String temp="";
    Error e=new Error();
    public LexAn()
    {
        rL=new String[41]; 
        rL[0]="$";
        rL[1]="DECLARE";
        rL[2]="id";
        rL[3]=":=";
        rL[4]="BOOLEAN";
        rL[5]="CHAR";
        rL[6]="num";
        rL[7]=",";
        rL[8]="NUMBER";
        rL[9]="INT";
        rL[10]="SMALLINT";
        rL[11]="POSITIVE";
        rL[12]="BEGIN";
        rL[13]="END";
        rL[14]="NULL";
        rL[15]="DBMS_OUTPUT.PUT_LINE";
        rL[16]="DBMS_OUTPUT.PUT";
        rL[17]="DBMS_OUTPUT.NEW_LINE";
        rL[18]="&";
        rL[19]="IF";
        rL[20]="THEN";
        rL[21]="WHILE";
        rL[22]="LOOP";
        rL[23]="c";
        rL[24]="TRUE";
        rL[25]="FALSE";
        rL[26]="NOT";
        rL[27]=">";
        rL[28]=">=";
        rL[29]="=";
        rL[30]="<=";
        rL[31]="<";
        rL[32]="<>";
        rL[33]="+";
        rL[34]="-";
        rL[35]="*";
        rL[36]="/";
        rL[37]="MOD";
        rL[38]=";";
        rL[39]="(";
        rL[40]=")";
    }
    public void file()
    {
        //System.out.println("Enter the path: ");
        //String path=s.nextLine();
        String path="/home/beaner/Desktop/t";
        String hold;
        File input=new File(path);
        try
        {
            BufferedReader reader=new BufferedReader(new FileReader(path));
            while ((hold=reader.readLine()) != null)
            {
                if(hold!=null)
                    temp+=hold+"\n";
            }
            temp += "$";
        }
        catch(IOException x)
        {
            System.err.format("IOException: %s%n", x);
        }
    }
    //process each individual token for parser
    public int scan(String in)
    {
        in+=" ";
        String tmp="";
        while(x<in.length())
        {
            if(in.charAt(x)==' '||in.charAt(x)=='\n'||in.charAt(x)=='\t'||x+1==in.length())
            {
                String trim = tmp.trim();
                System.out.println(trim);
                int cond=reservedWord(trim);
                //if token does not exist in the reserved words or grammar list
                if(cond == -1)
                {
                    Symbol sym=new Symbol(null,trim,null);
                    if(sT.check(sym))
                    {
                        e.printE(3);
                    }
                    else
                    {
                        sT.add(sym);
                    }
                }else{
                    return cond;
                }
                //returns int value of the token
               
                tmp="";
            }
            else
            {
                tmp+=in.charAt(x);
            }
            x++;
        }
        return -9999;
    }
    /*
    list of reserved words
    returns true if entry exists
    */
    public int reservedWord(String in)
    {
        for(int x=0;x<39;x++)
        {
            if(in.equals(rL[x]))
            {
                return x;
            }
        }
        return -1;
    }
}
