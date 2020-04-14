public class Product
{
   private String name;
   private float price;
   private int id;

   public Product()
   {

     setName("Coca Cola");
	 setPrice(10);
	 setId(id);
    
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
	
		 public String getId()
    {
       return id;
    }

    public void setId(float id)
    {
       this.id = id;
    }
    


}