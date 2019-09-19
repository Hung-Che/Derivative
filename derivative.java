public class Derivative{
    public Derivative(String t){
        t = "";
    }
    public static String getDev(String t){
        int l = t.length();
        String coe = "";
        String exp = "";
        for(int i = 0; i < l; i++){
            if(!t.substring(i, i+1).equals("x")&&
            !t.substring(i, i+1).equals("*")){
                coe = coe + t.substring(i,i+1);
            }else{
                break;
            }
        }
        for(int j = l; j >= 0; j--){
            if(!t.substring(j-1,j).equals("^")){
                exp = t.substring(j-1, j) + exp;
            }else{
                break;
            }
        }
        double a = Double.parseDouble(coe);
        double b = Double.parseDouble(exp);
        return a*b + " * x ^ " + (b - 1);
    }
