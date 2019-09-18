public class Derivative{
    public Derivative(String t){
        t = "";
    }
    public static String getDev(String t){
        int l = t.length();
        String coe = "";
        for(int i = 0; i < l; i++){
            if(!t.substring(i, i+1).equals("x")||
            !t.substring(i, i+1).equals("*")){
                coe = coe + t.substring(i,i+1);
                
            }else if(t.substring(i, i+1).equals("x")||
            t.substring(i, i+1).equals("*")){
                return coe;
            }
            
        }
        return coe;
    }
    public static void main(String[] args){
        System.out.println(getDev("123xx"));
    }
    
}
