package Sept8;

import java.util.ArrayList;
import java.util.List;

class Solution { // Need to review this
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> arrayStorage = new ArrayList();
        List<Integer> row = new ArrayList();
        // for each row we need to do 
        for (int i = 0; i < numRows; i++) {
            // as long as j(size of row array), is more than 0,
            // set row at j, to sum of the previous rows at j and j-1
            for (int j = row.size()-1; j >= 1; j--) {
                row.set(j, row.get(j) + row.get(j-1));
            }
            // add 1 at end since it always needs that
            row.add(1);
            // add the row as a new list to the main 
            arrayStorage.add(new ArrayList(row));
        }
        return arrayStorage;

    }
}