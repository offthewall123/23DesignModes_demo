package Test_Template_method;

public class StratetyTEST {
    public static void main(String[] args) {
        String exp="8+8";
        AbstractCalculator cal=new Plus();
        int result=cal.calculate(exp,"[+]");
        //字符串中带有“*”时，用“*”分隔字符串成数组是不正确的
        System.out.println(result);
    }
}
