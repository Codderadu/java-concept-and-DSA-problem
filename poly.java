class shape{
    String col;
}
class triangle extends shape{

    public void print(String col)
    {
    System.out.println(this.col);
    }
}
public class poly {
    public static void main(String[] args) {
       triangle st=new triangle();
       st.col="green";
       st.print(st.col);

    }
    
}
