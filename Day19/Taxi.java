import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
class TestClass {
    public static double classic(double cs,double cb,double cm,double cd,double distance){
    return cb+((distance/cs)*cm)+cd*distance;
     
    }
    public static double online(double oc,double of,double od,double distance){
         if(distance<=of)
         {
            return oc;
         }else
         {
           return oc+(distance-of)*od;
         }
    }
    public static void main(String args[] ) throws Exception {
        //BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        double distance = Double.parseDouble(br.readLine());
        String s = br.readLine();
        String arr[]= s.split(" ");
        double oc = Double.parseDouble(arr[0]);
        double of= Double.parseDouble(arr[1]);
        double od= Double.parseDouble(arr[2]);
        String s1 = br.readLine();
        String arr1[]= s1.split(" ");
        double cs= Double.parseDouble(arr1[0]);
        double cb= Double.parseDouble(arr1[1]);
        double cm= Double.parseDouble(arr1[2]);
        double cd= Double.parseDouble(arr1[3]);
        double classFare=classic(cs,cb,cm,cd,distance);
        double OnlineFare=online(oc,of,od,distance);
        if(classFare<OnlineFare) {
        System.out.println("Classic Taxi");
        }else
        {
           System.out.println("Online Taxi"); 
        }
    }
}
////
//