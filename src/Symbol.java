/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author beaner
 */
public class Symbol {

    String name;
    int type;

    public Symbol(String n, int t) {
        name = n;
        type = t;
    }

    public String getName() {
        return name;
    }

    public int getType() {
        return type;
    }
}
