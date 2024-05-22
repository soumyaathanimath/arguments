package variable;

public class Arguments {

    //static void showList(int start, String ...S) {
        //for (int i = 0; i < S.length; i++) {
          //  System.out.println(start + ". " + S[i]);
        //    start++;
      //  }
    //}

    //public static void main(String[] args) {
    //    showList(5, "John", "Smith", "Ajay", "Ahmed", "Mark", "Suresh");
  //  }
//}

    /*static int max(int x,int y)
    {
        if(x>y)
            return x;
        else 
            return y;
    }*/
    
    static void inc(int x)
    {
        x++;
        System.out.println(x);
    }
    
    public static void main(String[] args) {
    
        /*int a=10,b=15;
        //System.out.println(max(a,b));
        
        MethodPractice mp=new MethodPractice();
        System.out.println(mp.max(a,b));*/
        
        int a=10,b=15;
        inc(a);
        System.out.println(a);
        
        
    }
    }
    
