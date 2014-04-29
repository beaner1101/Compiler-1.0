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
public class symbolTable {
    ArrayList sT=new ArrayList<Symbol>();
    public symbolTable()
    {
        
    }
    public void add(Symbol n)
    {
        sT.add(n);
    }
}
