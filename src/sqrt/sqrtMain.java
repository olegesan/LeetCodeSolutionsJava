package sqrt;

public class sqrtMain {
    public static void main(String[] args) {
        System.out.println(slowSqrt(1));
        int test = 2147395599
                ;
//        for(int i = 1; i < 10000000; i++){
//            if(stillSlowSqrt(i) != binarySqrt(i) ){
//                System.out.println("false at "+i);
//            }
//        }
        System.out.println(stillSlowSqrt(test));
        System.out.println(binarySqrt(test));
    }

    public static int binarySqrt(int x){
        if(x==1)return 1;
        long l = 0;
        long r = x/2;
        while(l<r){
            long m = l+(r-l)/2;
            if(m*m==x || (m*m<x && (m+1)*(m+1) > x)){
                return (int)m;
            }else if (m*m>x){
                r = m-1;
            }else{
                l = m+1;
            }
        }
        return (int)l;
    }
    public static int stillSlowSqrt(int x){
        int init = 1;
        while(init*init < x && init*init>0){
            init*=2;
        }
        init/=2;
        while(init*init <= x && init*init >= 0){
            init+=1;
        }
        if(init*init==x){
            return init;
        }
        return init-1;
    }
    public static int slowSqrt(int x){
        int init = 1;
        while (init*init <= x && init*init > 0){
            init+=1;
        }
        if(init*init==x){
            return init;
        }
        return init-1;
    }
}
