import java.util.*;
public class assignment1{ 
static int idn =1;
static class Item 
{
   int ItemId;
   String Name;
   String Description;
   Integer price;
	Item( String a , String d , int p)
	{ 
 	  this.ItemId =idn++;
   	  this.Name =a;
   	  this.Description = d;
  	  this.price =p;
 	}
	Item(){}
}

 private static HashMap<Item,Integer> ans = new HashMap<>();

       	public static void main(String[]args){
  		Scanner Sc = new Scanner (System.in);
		HashMap<Integer,Item> market = new HashMap<>();

          	 Item a = new Item("apple","Kashmiri apple", 100);
                 Item b = new Item("banana","Kashmiri banana", 500);
		 Item c = new Item("apple","box", 1040);
                 
                 market.put(a.ItemId,a);
		 market.put(b.ItemId,b);
		 market.put(c.ItemId,c);

 		 int j =0;
		 int qty =0;
 			 while(j<1){
				System.out.println("press 1:addtoCart , 2 : displayQty , 3 : update quantity , 4 : display Bill, 5 : Delete , 6 : To End Loop");
    				int num = Sc.nextInt();
                                Item curr = a;
 					if(num!=4) {
   					System.out.println("press 1 : apple ,2 : banana , 3 : box"  );
					int xID = Sc.nextInt();
                                        curr =  market.get(xID);
    					 if(num ==1 || num ==3) {
						System.out.println("Number of Quantity");
   						qty = Sc.nextInt();
						
						}
		
					}
       				switch (num) {
                                  case 1 : addToCart(curr,qty); break;
				  case 2 : System.out.println(displayQty(curr)); break;
                                  case 3 : updateQty(curr,qty); break;
    				  case 4 : System.out.println(display()); break;
				   case 5 : deleteItem(curr); break;
				  default : j++; 
				}
         
 
			    }
        }


	public static void addToCart(Item item ,Integer quantity)
	 {
  	   if(ans.containsKey(item)) System.out.println("Already Added");
   	  else {
     		 ans.put(item,quantity); 
         	}
 	}


 	public static Integer displayQty(Item item)
 	{
 	  return ans.get(item);
 	}


	public static void updateQty(Item item , Integer Quantity)
	{
 		ans.put(item,Quantity);
 		System.out.println("Quantity Updated");
	}


	public static void deleteItem(Item item)
	{
  	 ans.remove(item);
	}


	public static double display()
	{ 
	 	double a =0;
  		 for(Item i: ans.keySet())
		{
   	 	double nn = i.price*ans.get(i);
        	 a+=nn;
 		}
 		return a; 
	} 


}
