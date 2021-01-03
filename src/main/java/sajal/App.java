package sajal;

/**
 * Hello world!
 *
 */
public class App 
{
   

    public int Add(String str){
        if (str == "") return 0;
        else{
            String num[]= str.split(",");
            if(num.length==1)
                return Integer.parseInt(num[0]);
            else
                return Integer.parseInt(num[0]) + Integer.parseInt(num[1]);
            
        }
    }





    public static void main( String[] args )
    {
        App app = new App();

        System.out.println( "Hello World!  " + app.Add("2,3") );
    }
}
