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
        endState=0;
        EOF=-1;
        s.push(EOF);
        s.push(endState);
    }
    public void parse(int in)
    {
        s.push(in);
    }
}
