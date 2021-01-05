package sajal;

/**
 * Hello world!
 *
 */
public class App 
{
   private int sum(String num[]){
       int res=0;
       for(String number : num)
           res+=Integer.parseInt(number);   
       return res;
   }

    public int Add(String str){
        if (str == "") return 0;
        else{
            String num[]= str.replaceAll("\n", ",").split(",");
            return sum(num);
            
        }
    }





    public static void main( String[] args )
    {
        App app = new App();

        System.out.println( "Hello World!  " + app.Add("1\n2,3\n4") );
    }
}
