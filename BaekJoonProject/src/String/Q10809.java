package String;

public class Q10809 {

	public static void main(String[] args) {
		String str = "beakjoon";
		char ch = 'a';
		char chAr[] = new char[str.length()];
		int cnt=0;
		/*for(int i=0;i<str.length();i++) {
			cnt++;
			chAr[i] = (char)str.charAt(i);
			System.out.println(chAr[i]);
			//System.out.println(str.charAt(i));
			//if(ch.equals(str.charAt(i))) {
			//}
		}*/
		//System.out.println(chAr[2]);
		int get =chAr[2];
	//	System.out.println(get);
		char set = (char)122;
		//System.out.println(set);
		char setAr[] = new char[26];
		int setNum[] = new int[26];
		for(int k=97;k<=122;k++) {
			setAr[k-97] = (char) k;
			setNum[k-97]= -1;
			//System.out.println("setAr[k-97] : "+ setAr[k-97]);
			for(int i=0;i<str.length();i++) {
				cnt = 0;
				++cnt;
				chAr[i] = (char)str.charAt(i);
				//System.out.println(chAr[i]);
				if(chAr[i]==setAr[k-97]) {
					//System.out.println("»Ð : " + (i+1));
					setNum[k-97] = i;
				}
			}//System.out.println("setNum[k-97] : "+setNum[k-97]);
			System.out.print(" "+setNum[k-97]);
		}
	}

}
