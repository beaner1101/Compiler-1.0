/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.*;
import java.math.*;
/**
 *
 * @author beaner
 */
public class Parser {
    Stack<Integer> s=new Stack();
    String state;
    int endState,EOF,curState,ltValue, nextState; 
    lookupTable lT=new lookupTable();
    grammarTable gT=new grammarTable();
    Error e = new Error();
    LexAn l = new LexAn();
    public Parser()
    {
    }
    //token
    //state
    /*
    initial setup of parser
    */
    public void pSetup()
    {
        curState=0;
        endState=0;
        EOF = -1;
        s.push(EOF);
        s.push(endState);
    }
    //106->state x 63->token
    public void something()
    {
        gT.populate();
        lT.lookupTablepop();
        l.file();
        while(l.x<l.temp.length()-1)
        {
            int nextIn=l.scan(l.temp);
            nextState=lT.fuck(curState,nextIn);
            if(nextState==0)
            {
                accept();
            }
            else if(nextState<0)
            {
                while(nextState < 0){
                reduce(Math.abs(nextState));
                nextState = lT.fuck(curState, nextIn);
                }
                shift(nextState, nextIn);
            }
            else if(nextState<999&&nextState>0)
            {
                shift(nextState,nextIn);
            }
            else
            {
                System.out.println("Parse error");
                System.exit(0);
            }
            
            if(curState == 6){
                System.out.println("Accept");
            }
        }
    }
    /*
    code for reduction
    */
    public void reduce(int x)
    {
        int[] z=gT.getRule(x);
        for(int shit=0;shit<z.length-1;shit++)
        {
            s.pop();
            if(s.pop()==z[shit])
            {
                continue;
            }
            else
            {
                System.out.println("Parse error");
                System.exit(0);
            }
        }
        curState = s.peek();
        s.push(z[z.length-1]);
        curState=lT.fuck(curState, s.peek());
        s.push(curState);
    }
    /*
    code for shift
    */
    public void shift(int x, int y)
    {
        s.push(y);
        s.push(x);
        curState = x;
    }
    /*
    code for goto
    */
    public void goTo(int x, int y)
    {
        s.push(x);
    }
    /*
    code has been successfully accepted
    */
    public void accept()
    {
        System.out.println("Code has been accepted.");
    }
}
/*
Thoughts
*/
//int newS=Math.abs(lT[][]);