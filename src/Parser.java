/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.*;
/**
 *
 * @author beaner
 */
public class Parser {
    Stack s=new Stack();
    String state;
    int endState,EOF;    
    public Parser()
    {
    }
    public void pSetup()
    {
        endState=0;
        EOF = -1;
        s.push(EOF);
        s.push(endState);
    }
    public void parse(int in)
    {
        s.push(in);
        int x = (int)s.pop();
        System.out.println(x);
        if(x==0)
        {
            System.out.println("Accepted");
        }
        else if(x==-1)
        {
            System.out.println("Reached end while parsing");
        }
        else
            System.out.print("FUCK YOU DR. CHEEZIT!!!");
    }
}
