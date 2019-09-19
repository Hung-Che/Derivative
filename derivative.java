public class Derivative{
    public Derivative(String t){
        t = "";
    }
    public static String getDev(String t){
        String ret = "";
        double a = getCoeff(t);
        double b = getExpon(t);
        if(a*b==0){
            ret = "0";
        }else if(b-1==0){
            ret = a*b + "" ;
        }else if(b-1==1){
            ret = a*b + " * x ";
        }else{
            ret = a*b + " * x ^ " + (b - 1);
        }
        return ret;
    }
    public static double getCoeff(String t){
        int l = t.length();
        String coe = "";
        if(t.indexOf("x")!=0){
            for(int i = 0; i < l; i++){
                if (!t.substring(i, i + 1).equals("x") &&
                    !t.substring(i, i + 1).equals("*")) {
                    coe = coe + t.substring(i, i + 1);
                } else {
                    break;
                }
            }
        }else if(t.indexOf("x")==0){
            coe = "1";
        }
        return Double.parseDouble(coe);
    }    
    public static double getExpon(String t){
        int l = t.length();
        String exp = "";
        if(t.indexOf("^")==-1&&t.indexOf("x")==-1){
            exp = "0";
        }else if(t.indexOf("^")==-1&&t.indexOf("x")!=-1){
            exp = "1";
        }else{
            for(int j = l; j > 0; j--){
                if(!t.substring(j-1,j).equals("^")){
                    exp = t.substring(j-1, j) + exp;
                }else{
                    break;
                }
            }
        }
        return Double.parseDouble(exp);
    }
}
