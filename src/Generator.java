/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.*;
import java.io.*;

/**
 *
 * @author beaner
 */
public class Generator {

    Stack<Integer> lB = new Stack();
    Stack<Integer> bP = new Stack();
    Stack<String> gS = new Stack();
    ArrayList<quad> q = new ArrayList();
    int cnt = 0;
    int temps = 0;
    String op1, op2, op3;
    String v;
    public Generator() {

    }
    /*
    
     */

    public void list(String in) {
        System.out.println(in);
        gS.push(in);
    }

    public void cases(int in) {
        String opCode;
        op1=op2=op3=opCode="";
        System.out.println(in);
        switch (in) {
            case 0:
                q.add(new quad("HLT","","",""));
                try {
                        File file = new File("/home/beaner/Desktop/out.txt");
			if (!file.exists()) {
				file.createNewFile();
			}
                        FileWriter fw = new FileWriter(file);
			BufferedWriter bw = new BufferedWriter(fw);
                        for(int i=0;i<q.size();i++){
                            bw.write(i+" "+q.get(i).operation+" "+q.get(i).q1+", "+q.get(i).q2+", "+q.get(i).q3+'\n');
                        }
			bw.close();
                } catch (IOException e) {
			e.printStackTrace();
		}
                break;
            case 4:
                op1 = gS.pop();
                op3 = gS.pop();
                if (op1.charAt(0) >= '0' && op1.charAt(0) <= '9') {
                    String v = "#" + op1;
                    op1 = v;
                } else if (op1.charAt(0) >= 'a' && op1.charAt(0) <= 'z') {
                    op1 = "#" + (int) op1.charAt(0);
                } else if (op1.compareTo("TRUE") == 0) {
                    op1 = "#1";
                } else if (op1.compareTo("FALSE") == 0) {
                    op1 = "#0";
                } else {
                    System.out.println("Code gen error.");
                    System.exit(-1);
                }
                q.add(new quad("STO", op1, op2, op3));
                cnt++;
                break;
            case 27:
                op2 = gS.pop();
                q.add(new quad("SYS", "#-1", op2, op3));
                cnt++;
                q.add(new quad("SYS", "#0", op2, op3));
                cnt++;
                break;
            case 28:
                op2 = gS.pop();
                q.add(new quad("SYS", "#-1", op2, op3));
                cnt++;
                break;
            case 29:
                q.add(new quad("SYS", "#0", op2, op3));
                cnt++;
                break;
            case 30:
                op3 = gS.pop();
                q.add(new quad("SYS", "#1", op2, op3));
                cnt++;
                break;
            case 31:
                lB.pop();
                q.get(bP.pop()).patch("#"+cnt);
                break;
            case 32:
                q.add(new quad("JMP", "", "", "#"+lB.pop()));
                q.get(bP.pop()).patch("#"+cnt);
                break;
            case 33:
                op1 = gS.pop();
                op3 = gS.pop();
                if (op1.charAt(0) >= '0' && op1.charAt(0) <= '9') {
                    op1 += "#" + op1;
                } else if (op1.charAt(0) >= 'a' && op1.charAt(0) <= 'z') {
                    op1 = "#" + (int) op1.charAt(0);
                } else if (op1.compareTo("TRUE") == 0) {
                    op1 = "#1";
                } else if (op1.compareTo("FALSE") == 0) {
                    op1 = "#0";
                } else {
                    System.out.println("Code gen error.");
                    System.exit(-1);
                }
                q.add(new quad("STO", op1, op2, op3));
                cnt++;
                break;
            case 37:
                op2=gS.pop();
                opCode=gS.pop();
                op1=gS.pop();
                if(opCode.equals(">")){
                    opCode="JGT";
                }
                else if(opCode.equals(">=")){
                    opCode="JGE";
                }
                else if(opCode.equals("<")){
                    opCode="JLT";
                }
                else if(opCode.equals("=")){
                    opCode="JEQ";
                }
                else if(opCode.equals("<>")){
                    opCode="JNE";
                }
                q.add(new quad(opCode, op1, op2, "#"+(cnt+3)));
                lB.push(cnt);
                cnt++;
                q.add(new quad("STO", "#0", "", "T"));
                cnt++;
                q.add(new quad("JMP", "", "", "#"+(cnt+2)));
                cnt++;
                q.add(new quad("STO", "#1", "", "T"));
                cnt++;
                q.add(new quad("JNE", "#1", "T", ""));
                bP.push(cnt);
                cnt++;
                break;
            case 39:
                op2 = gS.pop();
                opCode = gS.pop();
                op1 = gS.pop();
                temps++;
                op3 = "temp" + temps;
                if (opCode.equals("+")) {
                    opCode="ADD";
                }
                else{
                    opCode="SUB";
                }
                q.add(new quad(opCode, op1, "", op3));
                gS.push(op3);
                cnt++;
                break;
            case 41:
                op2 = gS.pop();
                opCode = gS.pop();
                op1 = gS.pop();
                temps++;
                op3 = "temp" + temps;
                if (opCode.equals("*")) {
                    opCode="MUL";
                }
                else if(opCode.equals("/")){
                    opCode="DIV";
                }
                else if(opCode.equals("MOD")){
                    opCode="MOD";
                }
                q.add(new quad(opCode, op1, op2, op3));
                gS.push(op3);
                cnt++;
                break;
        }
    }
}
