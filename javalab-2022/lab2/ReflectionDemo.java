import java.lang.reflect.*;
public class ReflectionDemo{
    public static void main(String args[]){
        try {
            Class c=Class.forName("java.util.Stack");
            Method methods[]=c.getDeclaredMethods();

            for (int i=0;i<methods.length;i++)
            System.out.println(methods[i].toString());
        } catch (Exception e) {
            System.err.println(e);
        }
    }
}