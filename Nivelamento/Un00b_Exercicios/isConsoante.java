
class isConsoante {
	boolean isConsoante1 (String s, int n){
		boolean resp = true;
		if (n != s.length()){
			if (s.charAt(n)<'0' || s.charAt(n)>'9'){
				if ( isVogal(s.charAt(n))==true){
					resp= false;
				}
				else {
					resp=isConsoante1(s, n + 1);
				}
			}
			else {
				resp=false;
			}
		}
		return resp;
	}
	boolean isConsoante2 (String s, int i){
		boolean resp = true;
		if (i==s.length()){
			resp=true;
		}
		else if(isConsoante2(s.charAt(i))==false){
			resp=false;
		}
		else{
			resp=isConsoante2(s, i+1);
		}
		return resp;
	}

	boolean isVogal (char s[n]){
		/*
		b oolean resp = true;
		if (s.charAt(n)=='A' || s.charAt(n)=='E' || s.charAt(n)=='I' || s.charAt(n)=='O' || s.charAt(n)=='U'||
		    s.charAt(n)=='a' || s.charAt(n)=='e' || s.charAt(n)=='i' || s.charAt(n)=='o' || s.charAt(n)=='u'){
			resp=true;
		    }
		else{
			resp=false;
		}
		return resp;
		*/
	}
	public static void main (String[] args){
		System.out.println("ok");
	}
}
