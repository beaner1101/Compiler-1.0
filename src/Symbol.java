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
public class Symbol {
    String name, type;
    Object value;
    public Symbol(String t, String n, Object v)
    {
        type=t;
        name=n;
        value=v;
    }
}
