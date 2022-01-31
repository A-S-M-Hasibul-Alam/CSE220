import java.util.*; 
public class MyReader{ 
    //modify following line so that this method can throw Exception 
    int readInteger( ) throws EitaIntegerNoiException{ 
        Scanner k = new Scanner(System.in); 
       
        int answer; 
        
        String s = k.nextLine(); 
        if (s.contains(".")){
          EitaIntegerNoiException n = new EitaIntegerNoiException();
          throw n;
        }
        else{
          answer = Integer.parseInt(s);
          return answer;
           
        } 
         
    } 
}