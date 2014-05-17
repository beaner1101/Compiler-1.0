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
public class Generator {
    Stack iS=new Stack<Integer>();
    Stack nS=new Stack<Integer>();
    Stack gS=new Stack<String>();  
    ArrayList q = new ArrayList<quad>();
    int cnt = 0;
    public Generator(){
        
    }
    /*
    
    */
    public void list(String in){
        gS.push(in);
        System.out.println(gS.get(cnt));
        cnt++;
    }
    public void cases(int in)
    {
        switch(in){
            case 0:
                break;
            case 4:
                break;
            case 27:
                break;
            case 28:
                break;
            case 29:
                break;
            case 30:
                break;
            case 31:
                break;
            case 32:
                break;
            case 33:
                break;
            case 37:
                break;
            case 39:
                break;
            case 41:
                break;
        }
            
    }
}
