//import java.util.Scanner;
import java.util.*;
import java.lang.NullPointerException;

public class cut_vertex {
    enum color_type {WHITE, GRAY, BLACK};
    enum node_type {HEAD, NODE};

    public static class n_list{
        int dependence;
        node_type type;
        n_list next;
        public n_list(int dependence){
            this.type = node_type.NODE;
            this.dependence = dependence;
            this.next = null;
        }
        public n_list(){
            this.type = node_type.HEAD;
            this.dependence = -1;
            this.next = null;
        }
    };
    public static class p_list{
        color_type color;
        n_list dependence = new n_list();
        int back;
        int discoverTime;
        public p_list(){
            this.back = this.discoverTime = 0;
            this.dependence = new n_list();
        }
    };

    public static p_list[] create(int n){
        p_list[] arr = new p_list[n];
        Scanner sc = new Scanner(System.in);
        //System.out.print("head!");
        while(sc.hasNextInt()){
            int u = sc.nextInt(), v = sc.nextInt();
            n_list u_node = new n_list(v);
            n_list v_node = new n_list(u);
            n_list p;
            if(arr[u].dependence == null)
                System.out.println("null!");
            //System.out.print("head!");
            for(p = arr[u].dependence; p.next != null; p = p.next);
            p.next = u_node;
            for(p = arr[v].dependence; p.next != null; p = p.next);
            p.next = v_node;
        }
        return arr;
    }

    public static void print(p_list[] arr, int n){
         for(int i = 0; i < n; ++i){
             System.out.print(i + " -> ");
             for(n_list p = arr[i].dependence; p != null; p = p.next){
                 if(p.type == node_type.HEAD)
                     System.out.print("head!");
                 if(p.type == node_type.NODE)
                     System.out.print(p.dependence + " ");
             }
             System.out.println();
         }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num;
        while(sc.hasNextInt()){
            num = sc.nextInt();
            p_list[] vertex_list = create(num);
            System.out.print("head!");
            print(vertex_list, num);
        }
    }
}
