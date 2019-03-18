import java.util.Arrays;
import java.util.Comparator;

public class Test1  {
public static void main(String[]args){
        String s="a4, b1, c2, d0";
        String[] arr=s.split(", ");
        java.util.List<String> arrs= Arrays.asList(arr);
        arrs.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                int i1=Integer.parseInt(o1.substring(1));
                int i2=Integer.parseInt(o2.substring(1));
                return i1-i2;
            }
        });
        for(String string: arrs){
            System.out.println(string);
        }
    }
}
