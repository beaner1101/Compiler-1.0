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
        rS.push(EOF);
        rS.push(endState);
    }
    public void parse(int in)
    {
        
    }
}
