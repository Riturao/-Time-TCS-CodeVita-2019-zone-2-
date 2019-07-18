//This is The Coding Area
import java.util.*;
import java.io.*;
import java.lang.*;
import java.math.*;
//program written by ritu rao patibandla

class Time{
  static void main(String args[]){
  int i,n,output;
  double k1,j,m,m1,m2,subang,angle1,angle2,t,t1,t2,angle,tmin,tmax;
  
  Scanner rottime= new Scanner(System.in);
  Scanner lat= new Scanner(System.in);
  i=rottime.nextInt();
  j=lat.nextDouble();
  k1=(i*j)/360;
  m=k1-Math.floor(k1);
  m2= (m*60);
  m1= Math.floor(k1);
   subang=m2/2;
   angle1=m1*30;
   angle2=m2*6;
   tmin=Math.min(angle1,angle2);
   tmax=Math.max(angle1,angle2);
   System.out.println(tmin);
   t=tmax-tmin;
   t1=180-t;
   if (t>t1){
     angle=t1+subang;
   }
   else {
    angle=t1-subang; 
   }
 System.out.println(angle);
 }
}