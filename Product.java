public class Product
{
   private String name;
   private float price;

   public Product()
   {

     setName("Coca Cola");
	 setPrice(10);
    
    }

    public String getName()
    {
       return name;
    }

    public void setName(String name)
    {
       this.name = name;
    }
    
	 public String getPrice()
    {
       return price;
    }

    public void setPrice(float price)
    {
       this.price = price;
    }
    


}