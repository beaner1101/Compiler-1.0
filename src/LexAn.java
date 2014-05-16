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
    int scncnt=-1;
    String[] rL;
    String temp="";
    Error e=new Error();
    boolean size = false;
    boolean cflag=false;
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
        //System.out.print(temp);
    }
    public int scan(String in)
    {
        in+=" ";
        String tmp="";
        while(scncnt<in.length()-1)
        {
            scncnt++;
            if((in.charAt(scncnt)>='a'&&in.charAt(scncnt)<='z')||(in.charAt(scncnt)>='A'&&in.charAt(scncnt)<='Z')||in.charAt(scncnt)=='_'||in.charAt(scncnt)=='.'||(in.charAt(scncnt)>='0'&&in.charAt(scncnt)<='9'))
            {
                tmp+=in.charAt(scncnt);
                if(!((in.charAt(scncnt+1)>='a'&&in.charAt(scncnt+1)<='z')||(in.charAt(scncnt+1)>='A'&&in.charAt(scncnt+1)<='Z')||in.charAt(scncnt+1)=='_'||in.charAt(scncnt+1)=='.'))
                {
                    tmp=tmp.trim();
                    if(reservedWord(tmp.trim())!=-1)
                    {
                        
                        if(reservedWord(tmp)==8||reservedWord(tmp)==9||reservedWord(tmp)==10||reservedWord(tmp)==11)
                        {
                            size=true;
                        }
                        else if(reservedWord(tmp)==5)
                        {
                            cflag=true;
                        }
                        if(!(tmp.charAt(0)>='a'&&tmp.charAt(0)<='z')&&!(tmp.charAt(0)>='A'&&tmp.charAt(0)<='Z'))
                        {
                            System.out.println("Invalid variable: "+tmp);
                            System.exit(0);
                        }
                        if(tmp.charAt(0)>='A'&&tmp.charAt(0)<='Z')
                        {
                            //System.out.println(tmp.trim()+" "+reservedWord(tmp.trim())+" 117");
                            return reservedWord(tmp.trim());
                        } 
                    }
                    if(tmp.charAt(0)>='a'&&tmp.charAt(0)<='z')
                    {
                        //System.out.println(temp.trim()+" 2"+" 121");
                        return 2;
                    }
                }
                if(!(in.charAt(scncnt+1)>='0'&&in.charAt(scncnt+1)<='9')&&tmp.charAt(0)>='0'&&tmp.charAt(0)<='9')
                {
                    return 6;
                }
            }
            else if(in.charAt(scncnt)==':')
            {
                if(in.charAt(scncnt+1)=='=')
                {
                    scncnt++;
                    //System.out.println(":=");
                    return reservedWord(":=");
                }
                //System.out.println("FUCK!!!");
                return 7777;
            }
            else if(in.charAt(scncnt)=='>')
            {
                if(in.charAt(scncnt+1)=='=')
                {
                    //System.out.println(">="+" "+reservedWord(">="));
                    scncnt++;
                    return reservedWord(">=");
                }
                //System.out.println(">"+" "+reservedWord(">"));
                return reservedWord(">");
            }
            else if(in.charAt(scncnt)=='\'')
            {
                cflag=true;
                while(cflag)
                {
                    tmp+=in.charAt(scncnt);
                    scncnt++;
                    if(in.charAt(scncnt)=='\'')
                    {
                        cflag=false;
                        scncnt++;
                        return 23;
                    }
                }
            }
            else if(in.charAt(scncnt)=='=')
            {
                if(in.charAt(scncnt+1)=='=')
                {
                    size=false;
                    //System.out.println("=="+" "+reservedWord("=="));
                    scncnt++;
                    return reservedWord("==");                    
                }
                size=false;
                //System.out.println("="+" "+reservedWord("="));
                return reservedWord("=");
            }
            else if(in.charAt(scncnt)==')')
            {
                size=false;
                //System.out.println(")"+" "+reservedWord(")"));
                return reservedWord(")");
            }
            else if(in.charAt(scncnt)=='<')
            {
                if(in.charAt(scncnt+1)=='>')
                {
                    //System.out.println("<>"+" "+reservedWord("<>"));
                    return reservedWord("<>");
                }
                else if(in.charAt(scncnt+1)=='=')
                {
                    //System.out.println("<="+" "+reservedWord("<="));
                    scncnt++;
                    return reservedWord("<=");
                }
            }
            else
            {
                tmp+=in.charAt(scncnt);
                if(reservedWord(tmp.trim())!=-1)
                {
                    //System.out.println(tmp.trim()+" "+reservedWord(tmp.trim())+" 191");
                    return reservedWord(tmp.trim());
                }
            }
        }
        System.out.println("FUCK AGAIN!!!");
        return -9999;
    }
    //process each individual token for parser
    /*
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
                int cond=(reservedWord(trim));
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
                        if(sym.name.length()>0)
                        {
                            System.out.println(sym.name+" added");
                        if(sym.name.charAt(0)>='a'&&sym.name.charAt(0)<='z')
                        {
                            if(sym.name.contains("*")||sym.name.contains("/")||sym.name.contains("+")||sym.name.contains("-"))
                            {
                                System.out.println("Illegal name");
                                System.exit(0);
                            }
                            return 2;
                        }
                        else if (size)
                            return 50;
                        else 
                            return 6;
                        }
                    }
                }
                else
                {
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
    */
    /*
    list of reserved words
    returns true if entry exists
    */
    public int reservedWord(String in)
    {
        for(int x=0;x<41;x++)
        {
            if(in.equals(rL[x]))
            {
                return x;
            }
        }
        return -1;
    }
}
/*
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
                }
                else
                {
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
*/
