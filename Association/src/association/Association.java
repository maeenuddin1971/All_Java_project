package association;

public class Association {
    public static void main(String[] args) {
        sadia wife=new sadia();
        rafiq husband=new rafiq();
        System.out.println(wife.getName()+" husband-wife "+husband.getName());
    }
    
}
class sadia
{
    String name="sadia";
    int age;
    
    public String getName()
    {
        return this.name;
    }
    public int getAge()
    {
        return this.age;
    }
    
}
class rafiq
{
    String name="rafiq";
    int age=27;
    
    public String getName()
    {
        return this.name;
    }
    public int getAge()
    {
        return this.age;
    }
}
