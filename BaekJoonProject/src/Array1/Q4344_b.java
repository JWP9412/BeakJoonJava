package Array1;

import java.util.Scanner;public class Q4344_b{public static void main(String[] args){Scanner s=new Scanner(System.in);int n=s.nextInt();while(n>0){long t=0;int l=s.nextInt();long a[]=new long[l];for(int x=0;x<l;x++){a[x]=s.nextLong();t+=a[x];}long r=t/l;int c=0;double v=0;for(int y=0;y<l;y++){if(a[y]>r){++c;}v = (double)c/l *100;}System.out.println(String.format("%.3f",((double)Math.round(v*1000))/1000 )+"%");n--;}}}
