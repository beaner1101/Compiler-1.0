/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author beaner
 */
public class Error {
    public void Error(){
        
    }
    public void printE(int x)
    {
        if(x==0)
        {
            System.out.println("Reached end while parsing");
            System.exit(0);
        }
        if(x==1)
        {
            System.out.println("Type mismatch");
            System.exit(1);
        }
        if(x==2)
        {
            System.out.println("Dude, what is this crap?!");
            System.exit(13);
        }
    }
}
