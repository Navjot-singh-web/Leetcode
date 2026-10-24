class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<List<Integer>> result = new ArrayList<>();

        for (int i = 0; i <= rowIndex; i++) {
            List<Integer> row = new ArrayList<>();

            // First and last elements are always 1
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    row.add(1);
                } else {
                    row.add(result.get(i - 1).get(j - 1) +
                            result.get(i - 1).get(j));
                }
            }
            result.add(row);
        }
        if(result.size()!=0)
            return result.get(result.size()-1);
        return new ArrayList<>(List.of(1));
    }
}