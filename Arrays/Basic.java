public class Basic {
    public static void update(int marks[] ,int unchangable ){
        unchangable =10;
       for (int i =0; i < marks.length; i++) {
        marks[i] = marks[i] + 1;
  }
    }

    public static void main (String args[] ) {
        int marks[] = {98, 99, 100};
        int unchangable =5;
        update( marks, unchangable);
        System.out.println(unchangable);
        //print our marks 
        for(int i =0 ; i < marks.length ; i++) {
            System.out.print(marks[i] + " ");    
        }
        System.out.println();
    }
}