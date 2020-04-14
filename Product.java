public class Product
{
   private String name;
   private boolean onStock = true;
   public Product()
   {
     setName("Coca Cola");
    }
    public String getName()
    {
       return name;
    }

    public void setName(String name)
    {
       this.name = name;
    }
}