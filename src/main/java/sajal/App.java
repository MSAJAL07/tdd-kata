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
            String num[]= str.split(",");
            return sum(num);
            
        }
    }





    public static void main( String[] args )
    {
        App app = new App();

        System.out.println( "Hello World!  " + app.Add("2,3") );
    }
}
