import java.util.ArrayList;
public class derivative{
	public String getTerm(String t, int num){
		int h = 0;
		ArrayList<String> terms = new ArrayList<String>();
		for(int i = 0; i < t.length(); i++){
			if(t.substring(i, i+1).equals("+")||t.substring(i, i+1).equals("-")){
				terms.add(t.substring(h, i));
				h = i;
			}
		}
		if(t.lastIndexOf("+")>t.lastIndexOf("-")&&t.lastIndexOf("+")>0){
			terms.add(t.substring(t.lastIndexOf("+"), t.length()));
		}else if(t.lastIndexOf("+")<t.lastIndexOf("-")&&t.lastIndexOf("-")>0){
			terms.add(t.substring(t.lastIndexOf("-"), t.length()));
		}
	}
}