class Solution {
    public int countDaysTogether(String arriveAlice, String leaveAlice, String arriveBob, String leaveBob) {
        String[] arr1 = arriveAlice.split("-");
        String[] arr2 = leaveAlice.split("-");
        String[] brr1 = arriveBob.split("-");
        String[] brr2 = leaveBob.split("-");
        int[] days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        int aliceStart = Integer.parseInt(arr1[1]);
        int aliceEnd = Integer.parseInt(arr2[1]);
        int bobStart = Integer.parseInt(brr1[1]);
        int bobEnd = Integer.parseInt(brr2[1]);

        for (int i = 0; i < Integer.parseInt(arr1[0]) - 1; i++) {
            aliceStart += days[i];
        }

        for (int i = 0; i < Integer.parseInt(arr2[0]) - 1; i++) {
            aliceEnd += days[i];
        }

        for (int i = 0; i < Integer.parseInt(brr1[0]) - 1; i++) {
            bobStart += days[i];
        }

        for (int i = 0; i < Integer.parseInt(brr2[0]) - 1; i++) {
            bobEnd += days[i];
        }

        int start = Math.max(aliceStart, bobStart);
        int end = Math.min(aliceEnd, bobEnd);

        return Math.max(0, end - start + 1);
    }
}