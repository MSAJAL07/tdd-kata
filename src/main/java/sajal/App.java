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
           if(Integer.parseInt(number)< 1000) res+=Integer.parseInt(number); 
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
                if(str.matches("//\\[(.*)\\]\n(.*)")){
                    int x = str.indexOf("[");
                    int y = str.indexOf("]");
                    d = str.substring(x+1,y);
                    str = str.substring(str.indexOf("\n")+1);
                  str =  str.replaceAll("\\*\\*\\*", ",");
                  d= ",";
                }else{
                    d = Character.toString(str.charAt(2));
                    str = str.substring(4);
                }
               
            }
            String num[]= str.replaceAll("\n", d).split(d);
            return sum(num);
            
        }
    }





    public static void main( String[] args )
    {
        App app = new App();

        System.out.println( "Hello World!  " + app.Add("//[***]\n1***2***3") );
    }
}
