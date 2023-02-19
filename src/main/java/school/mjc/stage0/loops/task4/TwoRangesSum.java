package school.mjc.stage0.loops.task4;

public class TwoRangesSum {
    public void printSumOfTwoRanges(int numberToSkip, int lastInRow) {

        if (lastInRow < 0) {
            System.out.println("last number in row is negative");
        } else if (lastInRow < numberToSkip){
            System.out.println("number to skip is bugger then the last");
        } else {
            int skipSum = 0;
            int countedSum = 0;
            for (int i = 0; i < lastInRow + 1; i++) {
                if (i <= numberToSkip){
                    skipSum = skipSum + i;
                } else countedSum = countedSum + i;
            }
            System.out.println("skipped sum is " + skipSum);
            System.out.println("counted sum is " + countedSum);
        }
    }
}
