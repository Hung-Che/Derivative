public class Power{
    public String getDev(String t, int n){
        String a = t;
        String b = "";
        for(int i = 0; i < n; i++){
            b = getDev(a);
            a = b;  
        }
        return b;
    }
    public String getDev(String t){
        String ret = "";
        double a = getCoeff(t);
        double b = getExpon(t);
        String coef = (a*b>0)?("+"+a*b):(""+a*b); 
        if(a*b==0){
            ret = "0";
        }else if(b-1==0){
            ret = coef + "" ;
        }else if(b-1==1){
            ret = coef + "*x";
        }else{
            ret = coef + "*x^" + (b - 1);
        }
        return ret;
    }
    public double getCoeff(String t){
        int l = t.length();
        String coe = "";
        String a = "";
        String b = "";
        if(t.indexOf("*x")!=-1||t.indexOf("x")!=-1){
            int index = (t.indexOf("*x")<0)?t.indexOf("x"):t.indexOf("*x");
            if(t.indexOf("/")<index&&t.indexOf("/")>0){
                a = t.substring(t.indexOf("(")+1,t.indexOf("/"));
                b = t.substring(t.indexOf("/")+1,t.indexOf(")"));
                coe = "" + Double.parseDouble(a) / Double.parseDouble(b);
            }else{
                coe = t.substring(0,index);
            }
        }else if(t.indexOf("*x")==-1||t.indexOf("x")==-1){
            coe = "1";
        }
        return Double.parseDouble(coe);
    }    
    public double getExpon(String t){
        int l = t.length();
        String exp = "";
        String a = "";
        String b = "";
        if(t.indexOf("^")==-1&&t.indexOf("x")==-1){
            exp = "0";
        }else if(t.indexOf("^")==-1&&t.indexOf("x")!=-1){
            exp = "1";
        }else if(t.lastIndexOf("/")>t.indexOf("^")&&t.indexOf("^")>0){
            a = t.substring(t.lastIndexOf("(")+1,t.lastIndexOf("/"));
            b = t.substring(t.lastIndexOf("/")+1,t.lastIndexOf(")"));
            exp = "" + Double.parseDouble(a) / Double.parseDouble(b);
        }else{
            exp = t.substring(t.indexOf("^")+1, t.length());
        }
        return Double.parseDouble(exp);
    }
}
