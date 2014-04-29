/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package compiler;
import java.util.*;
/**
 *
 * @author beaner
 */
public class Parser {
    Stack rS=new Stack();
    String state;
    int endState,EOF;    
    public Parser()
    {
        endState=0;
        EOF=-1;
        rS.push(-1);
        rS.push(0);
    }
    public void parse(Symbol in)
    {
        
    }
}
