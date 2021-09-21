package lab1;

public class Rectangle {
    public double width;
    public double  height;
    Rectangle()
    {
        height = 1;
        width = 1;
    }
    Rectangle(double w, double h){
        this.width = w;
        this.height = h;

    }
     public double getWidth(){
         return width;

     }
     public double getHeight(){
       return height;
     }
     public void setWidth(double w){
         this.width = w;
     }
     public void setHeight(double h){
         this.height = h;
     }
     double getArea()
    {
        return (height * width);
    }
    double getPerimeter()
    {
        return (2 * (height + width));
    }
    public static void main(String[] args){
        Rectangle rect1 = new Rectangle();
        System.out.println("талбай="+rect1.getArea());
        System.out.println("периметр="+rect1.getPerimeter());
      
        
    
    }
}





