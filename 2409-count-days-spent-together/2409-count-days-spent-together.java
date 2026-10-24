class Solution {
    public int countDaysTogether(String arriveAlice, String leaveAlice, String arriveBob, String leaveBob) {
        String[] arr1 = arriveAlice.split("-");
        String[] arr2 = leaveAlice.split("-");
        String[] brr1 = arriveBob.split("-");
        String[] brr2 = leaveBob.split("-");
        int[] days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        int as = Integer.parseInt(arr1[1]);
        int ae = Integer.parseInt(arr2[1]);
        int bs = Integer.parseInt(brr1[1]);
        int be = Integer.parseInt(brr2[1]);

        for(int i=0;i<Integer.parseInt(arr1[0])-1;i++){
            as +=days[i];
        }

        for(int i=0;i<Integer.parseInt(arr2[0])-1;i++) {
            ae +=days[i];
        }

        for(int i=0;i<Integer.parseInt(brr1[0])-1;i++) {
            bs += days[i];
        }

        for(int i=0;i<Integer.parseInt(brr2[0])-1;i++){
            be += days[i];
        }

        int start = Math.max(as, bs);
        int end = Math.min(ae, be);

        return Math.max(0, end-start+1);
    }
}