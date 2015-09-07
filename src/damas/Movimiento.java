
package damas;

/**
 *
 * @author KerKox
 */
public class Movimiento {

    public Movimiento() {
        
        
        

    }
    
    public boolean MoveValid(int x, int y){
            boolean answer=false;
            /**
             *    Y   Y   Y   Y   Y   Y   Y   Y
             * X 00 |01| 02 |03| 04 |05| 06 |07|
             * X |10| 11 |12| 13 |14| 15 |16| 17
             * X 20 |21| 22 |23| 24 |25| 26 |27| 
             * X |30| 31 |32| 33 |34| 35 |36| 37
             * X 40 |41| 42 |43| 44 |45| 46 |47|
             * X |50| 51 |52| 53 |54| 55 |56| 57
             * X 60 |61| 62 |63| 64 |65| 66 |67|
             * X |70| 71 |72| 73 |74| 75 |76| 77
             * 
             *     Y   Y   Y   Y   Y   Y   Y   Y
             * X    |01|    |03|    |05|    |07|
             * X |10|    |12|    |14|    |16| 
             * X    |21|    |23|    |25|    |27| 
             * X |30|    |32|    |34|    |36| 
             * X    |41|    |43|    |45|    |47|
             * X |50|    |52|    |54|    |56| 
             * X    |61|    |63|    |65|    |67|
             * X |70|    |72|    |74|    |76| 
             */
            
            
            if(x%2==0){
                if(((y%2)-1)==0){
                answer=true;
                
            }
            }else{
                if(y%2==0){
                    answer=true;
                }
            }
            
            return answer;
        }
    

}
