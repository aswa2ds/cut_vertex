//import java.util.Scanner;
import java.util.*;
import java.lang.NullPointerException;

public class cut_vertex {

    private static p_list[] create(int num){
        p_list[] arr = new p_list[num];
        int u, v;
        Scanner sc = new Scanner(System.in);
        while(sc.hasNextInt()){
            u = sc.nextInt();
            v = sc.nextInt();
            arr[u].insert(v);
            arr[v].insert(u);
        }
        return arr;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num;
        while(sc.hasNextInt()){
            num = sc.nextInt();
            p_list[] vertex_list = create(num);
            vertex_list[0].print(num);
            //System.out.print("head!");
            //print(vertex_list, num);
        }
    }
}
