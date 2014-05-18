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
public class symbolTable {

    ArrayList sT = new ArrayList<Symbol>();

    public symbolTable() {

    }

    public void add(Symbol n) {
        sT.add(n);
    }

    public boolean check(Symbol n) {
        if (sT.contains(n)) {
            return true;
        }
        return false;
    }

    public void p() {
        for (int i = 0; i < sT.size(); i++) {
            System.out.println(sT.get(i).toString());
        }
    }
}
