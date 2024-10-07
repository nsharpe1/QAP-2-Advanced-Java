import java.io.*; 
import java.util.*;

public class TestMyLine {
    public static void main(String[] args) {
        MyLine l1 = new MyLine(1,2,3,4);
        System.out.println("Begin = " + l1.getBegin());
        System.out.println("End = " + l1.getEnd());
        System.out.println("Begin (x) = " + l1.getBeginX());
        System.out.println("Begin (y) = " + l1.getBeginY());
        System.out.println("End (x) = " + l1.getEndX());
        System.out.println("End (y) = " + l1.getEndY());
        System.out.println("Begin (x and y) = " + Arrays.toString(l1.getBeginXY()));
        System.out.println("End (x and y) = " + Arrays.toString(l1.getEndXY()));
        System.out.println("Length = " + l1.getLength());
         System.out.println("Gradient = " + l1.getGradient());
        System.out.println(l1);
    }
}
