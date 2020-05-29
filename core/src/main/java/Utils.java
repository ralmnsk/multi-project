import java.util.Arrays;

public class Utils {
    static boolean isAllPositiveNumbers(String... str){
        if ( str == null ){
            return false;
        }
        for (String s:str){
            if (!StringUtils.isPositiveNumber(s) ){
                return false;
            }
        }
        return true;
    }
}
