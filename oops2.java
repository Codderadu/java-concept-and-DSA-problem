class account{
    public String name;
    protected String email;
    private String password;
public String getinfo(){
    return this.password;
}
public void setinfo(String pass)
{
    this.password=pass;
}
}
public class oops2{
    public static void main(String[] args)
    {
         account ac1=new account();
         ac1.setinfo("adin@133");
        System.out.println( ac1.getinfo());
    }    
}
