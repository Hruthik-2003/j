package lab_work;
public class PeakElement {

    public static int findPeakElement(int[] arr) {
        int n = arr.length;
        if (n == 1) {
            return arr[0];
        }
        if (n == 2) {
            if (arr[0] > arr[1]) {
                return arr[0];
            }else{
                return arr[1];
            }
        } else {
            
        }
    }
    public static void main(String[] args) {
        int[] arr = { 10, 20, 13, 27, 4, 3 };
        int result=findPeakElement(arr);
    }
}
