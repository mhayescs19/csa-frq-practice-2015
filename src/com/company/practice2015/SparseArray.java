package com.company.practice2015;

import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Getter
public class SparseArray {
    private int numRows;
    private int numCols;
    private List<SparseArrayEntry> entries;

    public SparseArray() {
        this.entries = new ArrayList<>();
    }

    /**
     * (a)
     */
    public int getValueAt(int row, int col) {
        for (SparseArrayEntry entry : this.entries) {
            if (row == entry.getRow() && col == entry.getCol()) { // checks each entry in the list if the row an column value matches the listed pair
                return entry.getValue(); // if it exists, return that entry value
            }
        }

        return 0; // if no pairs match in the list, default return zero
    }

    /**
     * (b)
     */
    public void removeColumn(int col) {
        for (SparseArrayEntry entry : this.entries) { // first loop just to remove correct entries
            if (entry.getRow() == col) {
                this.entries.remove(entry); // finds current entry object (unique value) and removes it
            }
        }
        for (SparseArrayEntry entry : this.entries) { // second loop to test
            if (entry.getCol() > col) {
                entry.setCol(entry.getCol() - 1);
            }
        }
        this.numCols--; // decreases column size by one since one column is removed by method call
    }
}
