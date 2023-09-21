package com.example.operateurstelephoniques;

public class Operator {
    private int  codeOfSee, color, numberOfDigits;
    private String name ,codeOfCharge;

    public Operator() {
    }

    public Operator(String name, String  codeOfCharge, int codeOfSee, int color, int numberOfDigits) {
        this.codeOfCharge = codeOfCharge;
        this.codeOfSee = codeOfSee;
        this.color = color;
        this.numberOfDigits = numberOfDigits;
        this.name = name;
    }

    public String getCodeOfCharge() {
        return codeOfCharge;
    }

    public void setCodeOfCharge(String      codeOfCharge) {
        this.codeOfCharge = codeOfCharge;
    }

    public int getCodeOfSee() {
        return codeOfSee;
    }

    public void setCodeOfSee(int codeOfSee) {
        this.codeOfSee = codeOfSee;
    }

    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }

    public int getNumberOfDigits() {
        return numberOfDigits;
    }

    public void setNumberOfDigits(int numberOfDigits) {
        this.numberOfDigits = numberOfDigits;
    }

    @Override
    public String toString() {
        return "Operator{" +
                "codeOfCharge=" + codeOfCharge +
                ", codeOfSee=" + codeOfSee +
                ", color=" + color +
                ", numberOfDigits=" + numberOfDigits +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

