import java.util.ArrayList;
public class derivative{
	public String getTerm(String t, int num){
	    Power p = new Power();
		int h = 0;
		String str = "";
		ArrayList<String> terms = new ArrayList<String>();
		for(int i = 0; i < t.length(); i++){
			if(t.substring(i, i+1).equals("+")||t.substring(i, i+1).equals("-")){
				terms.add(p.getDev(t.substring(h, i),num));
				h = i;
			}
		}
		if(t.lastIndexOf("+")>t.lastIndexOf("-")&&t.lastIndexOf("+")>0){
			terms.add(p.getDev(t.substring(t.lastIndexOf("+"), t.length()), num));
		}else if(t.lastIndexOf("+")<t.lastIndexOf("-")&&t.lastIndexOf("-")>0){
			terms.add(p.getDev(t.substring(t.lastIndexOf("-"), t.length()), num));
		}
		if(terms.get(0).substring(0,1).equals("+")){
		    String t1 = terms.get(0).substring(1, terms.get(0).length());
		    terms.remove(0);
		    terms.add(0,t1);
		}
		for(int i = 0; i < terms.size(); i++){
		    if(!terms.get(i).equals("0")){
		        str = str + terms.get(i);
		    }
		}
		return (!str.equals(""))?(str):("0");
	}
}