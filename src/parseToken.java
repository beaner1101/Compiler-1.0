/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author beaner
 */
public class parseToken {

    int name;
    String value;

    public parseToken(int n, String v) {
        name = n;
        value = v;
    }

    public int getName() {
        return name;
    }

    public String getValue() {
        if (value != null) {
            return value;
        }
        return null;
    }
}
