public class Derivative{
    public Derivative(String t){
        t = "";
    }
    public static String getDev(String t){
        int l = t.length();
        String coe = "";
        String exp = "";
        String ret = "";
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
        double a = Double.parseDouble(coe);
        double b = Double.parseDouble(exp);
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



