
public class UniqueNumbers {
    public static void main(String[] args) {
        int[] arrNum = {1, 2, 2, 1, 1, 5, 6, 5, 6};
        
        
        int maxNum = arrNum[0];
        for (int i = 1; i < arrNum.length; i++) {
            if (arrNum[i] > maxNum) {
                maxNum = arrNum[i];
            }
        }
        
        int[] freqArr = new int[maxNum + 1];
        
        for (int num : arrNum) {
            freqArr[num]++;
        }
        
        System.out.println("Unique Numbers and their frequencies =>");
        for (int i = 0; i < freqArr.length; i++) {
            if(freqArr[i] > 0) {
                System.out.println(i + ": " + freqArr[i] + " times");
            }
        }
    }
}