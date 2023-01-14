class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> List = new HashSet<>();
        ArrayList<Integer> iList = new ArrayList<>();
        for(int i=0;i<nums1.length;i++){
            List.add(nums1[i]);
        }
        for(int i=0;i<nums2.length;i++){
            if(List.contains(nums2[i])){
                iList.add(nums2[i]);
            }
        }
        int[] arr = new int[iList.size()];
        int index = 0;
        for (Integer value: iList) {
            arr[index++] = value;
        }
        return arr;
    }
}
