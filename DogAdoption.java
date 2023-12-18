import java.util.Scanner;
class Dog{
	private String name;
	private String breed;
    private String color;
    private double height;
    private String type;
    public  Dog(String name,String breed,String color,double height,String type){
      this.name=name;
      this.breed=breed;
      this.color=color;
      this.height=height;
      this.type=type;

    }
    public String getName(){
    	 return name;
    }
    public String getBreed(){
    	 return breed;
    }
    public String getColor(){
    	 return color;
    }
    public double getHeight(){
    	 return height;
    }
    public String getType(){
    	 return type;
    }	
}
public class DogAdoption{
	public static void main(String args[]){
		Scanner s=new Scanner(System.in);
		Dog snoopy=new Dog("snoopy","pomeranian","white",1.0,"guarddog");

		Dog rocky=new Dog("rocky","labrador","brown",3.0,"snifferdog");

		Dog snowy=new Dog("snowy","germanshepherd","black",4.0,"shephrerddog");
        System.out.println("enter prefered breed:");
        String pbreed=s.next();
        System.out.println("enter prefered color:");
        String pcolor=s.next();
        System.out.println("enter prefered height:");
        double pheight=s.nextDouble();
        System.out.println("enter prefered type:");
        String ptype=s.next();
        Dog recommendedDog=findRecommendedDog(snoopy,rocky,snowy,pbreed,pcolor,pheight,ptype);
        if(recommendedDog!=null){
        	System.out.println("recommended dog is "+ recommendedDog.getName());
        }
        else{
        	System.out.println("no such a dog");
        }
	}
	private static Dog findRecommendedDog(Dog snoopy,Dog rocky,Dog snowy,String pbreed,String pcolor,double pheight,String ptype){
		if(snoopy.getBreed().equalsIgnoreCase(pbreed) && 
			snoopy.getColor().equalsIgnoreCase(pcolor) &&
			snoopy.getHeight()>=(pheight) &&
			snoopy.getType().equalsIgnoreCase(ptype)  
	          ){
		 return snoopy;
		}
		else if(rocky.getBreed().equalsIgnoreCase(pbreed) && 
			rocky.getColor().equalsIgnoreCase(pcolor) &&
			rocky.getHeight()>=(pheight) &&
			rocky.getType().equalsIgnoreCase(ptype)  
	          ){
		 return rocky;

		}
		else if(snowy.getBreed().equalsIgnoreCase(pbreed) && 
			snowy.getColor().equalsIgnoreCase(pcolor) &&
			snowy.getHeight()>=(pheight) &&
			snowy.getType().equalsIgnoreCase(ptype)  
	          ){
		 return snowy;
	    }
	    else{
	    	return null;
	    }
	}

}