
package com.mycompany.project.xo;

public class Player {
    private String name;
    private char op;

    public Player() {
    }

    public Player(String name, char op) {
        this.name = name;
        this.op = op;
    }
    //====Getters========
    public String getName() {
        return name;
    }

    public char getOp() {
        return op;
    }
    //====Setters=============
    public void setName(String name) {
        this.name = name;
    }

    public void setOp(char op) {
        this.op = op;
    }
    
    
}
