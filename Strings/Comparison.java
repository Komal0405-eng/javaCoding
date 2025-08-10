public class Comparison {
public static void main( String args[]){
  String s1 = "HARSHAL";
  String s2 = "HARSHAL";
  String s3 = new String("HARSHAL");
  if(s1 == s2){
    System.out.println("Strings are equal");
  } else {
    System.out.println("Strings are not equal");
  }
  if( s2 == s3){
    System.out.println("Strings are equal");
  } else {
    System.out.println("Strings are not equal");
  }
  if( s3 == s1){
    System.out.println("strings are equal");
  } else {
    System.out.println("Strings are not equal");
  }
}

}