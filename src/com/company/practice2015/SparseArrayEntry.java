package com.company.practice2015;

public class SparseArrayEntry {
    private int row;
    private int col;
    private int value;

    public SparseArrayEntry(int r, int c, int v) {
        this.row = r;
        this.col = c;
        this.value = v;
    }

    public int getRow() {
        return this.row;
    }

    public void setRow(int row) { this.row = row; }

    public int getCol() {
        return this.col;
    }

    public void setCol(int col) { this.col = col; }

    public int getValue() {
        return this.value;
    }

    public void setValue(int value) { this.value = value; }

}
