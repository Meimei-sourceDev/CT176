package Buoi1;
public class DanhSach {
    public static void main(String[] args) {
        if(args.length == 0){
            System.out.println("No input file detected");
            return;
        }
        double MAX = Double.NEGATIVE_INFINITY;
        double res = 0;
        boolean hasValidNum = false;

        for(String arg : args){
            try{
                double val = Double.parseDouble(arg);
                res+=val;
                if(val > MAX){
                    MAX = val;
                }
                hasValidNum = true;
            }catch(NumberFormatException e){
                hasValidNum = false;
            }
        }
        if(hasValidNum){
            System.out.println("SUM: " + res);
            System.out.println("MAX: " + MAX);
        }else{
            System.out.println("No valid number");
        }
    }
}