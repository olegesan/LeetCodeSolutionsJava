package isPerfectSquare;

public class MainPerfectSquare {
    public static void main(String[] args) {

//        System.out.println(isPerfectSquare(Integer.MAX_VALUE));
        for(int i = 0; i <= Integer.MAX_VALUE; i++){
                if(isPerfectSquare(i)){
                    System.out.println(i+" is a perfect square.");
                }
        }
    }

    public static boolean isPerfectSquare(int num) {
        if(num==0 || num == 1){
            return true;
        }
        int left = 0, right = num;
        while(left <= right){
            int mid = left + (right - left)/2;
            if(mid*mid == num){
                return true;
            }else if((mid > num / mid)){
                right = mid - 1;
            }else{
                left = mid + 1;
            }
        }
        return false;
    }
}
