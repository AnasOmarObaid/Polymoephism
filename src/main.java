
import javax.swing.*;
 
public class main {
static Circale circale  ;  
static Rectangle rectangle;
static Polymor polymor1 = new Polymor();  
static Polymor polymor2 = new Polymor();  
static  String input2;
static String args[] = new String[10];

//-----------------------------------------------------
 public static void main(String args[]){  
     MainMune();
  }
 //----------------------------------------------------------
    
 private static void MainMune() {
       
      while(true)
       {
        String mainM = " Chose Your Number"+"\n"+" 1- Draw Shape"+"\n"+" 2- Compute Area"+"\n"+"3- Print Information"+"\n"+"4- exit";
     String asks = " Please Enter The Shape\n"+" a- Circal"+"\n"+" b- Rectangle"+"\n"+" c- Return Mune";
        String input = JOptionPane.showInputDialog(null,mainM);
       
           int parse = Integer.parseInt(input);
          
         switch(parse){
            
             case 1 :                
                     break;
     
             case 2 : computeArea();break;
             
             case 3 : PrintInformation();break;
             
             case 4 : System.exit(0);break;
             
             default : JOptionPane.showMessageDialog(null, " Enter 1 or 2 or 3 or 4");
                
         }
         
         input2 = JOptionPane.showInputDialog(null,asks);
                     switch(input2){
                     case "a" : calcCiracle();break;
                     case "b" : calcRectangle();break;
                     case "c" :  main(args); break;
                     default : JOptionPane.showMessageDialog(null, " Enter a or b ");
                     } 
        }
    }
//------------------------------------------------------    
    private static void calcCiracle() {
       
        String color = JOptionPane.showInputDialog(null, "Pleas Enter The Color Of Circle");
        String input1 = JOptionPane.showInputDialog(null, "Pleas Enter The Radues Of Circle");
        double radues = Double.parseDouble(input1);
         circale = new Circale(color, radues);
    }
//--------------------------------------------------
    

private static void calcRectangle() {
        String color = JOptionPane.showInputDialog(null, "Pleas Enter The Color Of Rectangle");
        String input1 = JOptionPane.showInputDialog(null, "Pleas Enter The Wedthe Of Rectangle");
       
        double Wedthe = Double.parseDouble(input1);
          String in = JOptionPane.showInputDialog(null, "Pleas Enter The Heathe Of Rectangle");
          double Heathe = Double.parseDouble(in);         
         rectangle = new Rectangle(color,Wedthe,Heathe);
    }
//------------------------------------------------------
private static void computeArea() {
      
    String asks  = JOptionPane.showInputDialog(null," What The Shape Do You Want To Print compute Area"+"\n"+"a- Circal"+"\n"+"b- Reactangle");
    if(asks.equals("a")){
        polymor1.polyArea(circale);
       } else if(asks.equals("b")) {
           polymor2.polyArea(rectangle);
       }
    }
//------------------------------------------------------    
private static void PrintInformation() {
 String asks  = JOptionPane.showInputDialog(null," What The Shape Do You Want To Print PrintInformation"+"\n"+"a- Circal"+"\n"+"b- Reactangle");
    
    if(asks.equals("a")){
        polymor1.polyAll(circale);
       } else if(asks.equals("b")) {
       polymor2.polyAll(rectangle);
       }
    }    
}