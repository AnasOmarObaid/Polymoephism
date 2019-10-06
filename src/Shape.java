
abstract class Shape {
    
String color;



public Shape(){}

  public Shape(String color)
  
  {
 
   this.color = color;
  
  
  }

public String getColor(){

return this.color;
}

public void setcolor(String color){

this.color = color;
}

public abstract void printArea();

public abstract void printInfo();

}
