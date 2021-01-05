package sajal;

/**
 * Hello world!
 *
 */
public class App 
{
   private int sum(String num[]){
       int res=0;
       String neg = "";
       for(String number : num){
           if(Integer.parseInt(number)< 0) neg = neg+" "+number;
           res+=Integer.parseInt(number); 
       }
       if(neg != ""){
        throw new IllegalArgumentException("Negatives not allowed:" + neg);
       }
              
       return res;
   }

    public int Add(String str){
        if (str == "") return 0;
        else{
            String d = ",";
            if(str.matches("//(.*)\n(.*)")){
                d = Character.toString(str.charAt(2));
                System.out.println(d);
                str = str.substring(4);
                System.out.println(str);
            }
            String num[]= str.replaceAll("\n", d).split(d);
            return sum(num);
            
        }
    }





    public static void main( String[] args )
    {
        App app = new App();

        System.out.println( "Hello World!  " + app.Add("1\n2,3\n4") );
    }
}
