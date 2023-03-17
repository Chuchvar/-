import java.util.Arrays;

public class Five {
    public static void main(String[] args) {
        int a,b,c;
        for (a=0;a<24;a++){
            b=a/10;
            c=a-(10*b);
            System.out.println(a+":"+b+c);
            if((c*10+b)<60) if(0<(c*10+b))System.out.println(a+":"+c+b);
            }
        }
    }
