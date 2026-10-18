class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        List<Integer> ls1 = Arrays.stream(nums1).boxed().toList();
        List<Integer> ls2 = Arrays.stream(nums2).boxed().toList();
        HashSet<Integer> s1 = new HashSet<>(ls1);
        HashSet<Integer> s2 = new HashSet<>(ls2);
        s1.retainAll(s2);
        int[] arr = new int[s1.size()];
        int i = 0;
        for (int num : s1) {
            arr[i++] = num;
        }
        return arr;
    }
}