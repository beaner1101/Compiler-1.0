/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package compiler;

/**
 *
 * @author beaner
 */
public class Scanner {
    public Scanner()
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
                temp.trim();
            }
            else
                temp+=in.charAt(x);
        }
    }
}
