
import javax.swing.JOptionPane;


class Circale extends Shape {
 
    
    double radues;
    double area;
      
    public Circale(){}
    
     
     public Circale(String color, double radues){
    super(color);
    this.radues = radues;
    }

    public double getArea() {
        return this.radues * this.radues * Math.PI ;
    }

    public void setArea(double radues) {
        this.radues = radues ;
       
    }

    public double getRadues() {
        return radues;
    }

    public void setRadues(double radues) {
        this.radues = radues;
    }
    
    
    @Override
    public void printArea()
    {
    
    JOptionPane.showMessageDialog(null," The Area Of The Radues "+getRadues()+" = "+getArea());
    
    }
    

@Override
    public void printInfo()
    {
    
    JOptionPane.showMessageDialog(null,"\n The Color Circale Is "+getColor() +"\n"
            +" The Radues Is "+getRadues()+"\n"+"The Area Of Circal Is "+getArea());
    
    }
}
