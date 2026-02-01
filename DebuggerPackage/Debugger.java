package DebuggerPackage;

class Debugger {
    public static void main(String[] args){
        int[] heights = {1,1,4,2,1,3};
        System.out.print("The Answer : "+ heightChecker(heights));
    }
    public static int heightChecker(int[] heights) {
        int[] count = new int[101];
        for (int height : heights) {
            count[height]++;
        }
        int mismatches = 0;
        int index = 0;
        for (int height : heights) {
            while (count[index] == 0) {
                index++;
            }
            if (height != index) {
                mismatches++;
            }
            count[index]--;
        }
        return mismatches;
    }
}