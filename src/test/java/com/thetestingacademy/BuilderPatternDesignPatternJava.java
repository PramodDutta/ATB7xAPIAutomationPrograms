package com.thetestingacademy;

public class BuilderPatternDesignPatternJava {
    // Change return type of each method as Class type
    // "this" always points to current/calling object. Returning the same to
    // have same reference

    public BuilderPatternDesignPatternJava Floor1(){
        System.out.println("Stag 1 is Done");
        return this;
    }

    public BuilderPatternDesignPatternJava Floor2(String parm){
        System.out.println("Stag 2 is Done");
        return this;
    }

    public BuilderPatternDesignPatternJava Floor3(){
        System.out.println("Stag 3 is Done");
        return this;
    }

    public static void main(String[] args) {
        BuilderPatternDesignPatternJava bp = new BuilderPatternDesignPatternJava();
        bp.Floor1().Floor2("pramod").Floor3();

    }



}
