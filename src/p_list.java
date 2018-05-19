import java.util.*;

public class p_list {
    enum color_type {WHITE, GREY, BLACK};

    private color_type color;
    private int back;
    private int dis;
    private Vector dependent;

    public p_list(){
        this.color = color_type.WHITE;
        this.back = this.dis = -1;
        this.dependent = new Vector();
    }

    public void insert(int v){
        Vector v_node = new Vector(v);
        this.dependent.addElement(v_node);
    }

    public void print(int n){
        for(int i = 0; i < n; ++i){
            System.out.print(i + "->");
            for(int j = 0; j < this.dependent.size(); ++j)
                System.out.print(this.dependent.get(j));
            System.out.println();
        }
    }

}
