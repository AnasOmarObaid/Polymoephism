import javax.swing.*;
 


class Rectangle extends Shape{
    
double area;  
 double h;
 double w;
  
 public Rectangle(){}
  public Rectangle(String color, double h, double w){
 super(color);
 this.h = h;
 this.w = w;
 }
 public double getArea()
 {
 return this.h * this.w;
 
 }
 public void setArea(double h, double w)
 {
 this.h = h ;
 this.w = w;
 
 }
 
 @Override
    public void printArea()
    {
    
    JOptionPane.showMessageDialog(null," The Area Of The Rectangle "+" = "+this.getArea());
    
    }
    

@Override
    public void printInfo()
    {
    
    JOptionPane.showMessageDialog(null,"\n The Color Rectangle Is "+getColor() +" The Haight Is"+this.h+"\n"+" The Wigthe Is "+this.w+"\n"+"The Area Of Rectangle Is "+"\n"+this.getArea());
    
    }
 
 }
