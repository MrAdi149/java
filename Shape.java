public class Shape {

    int l,b;

    public void getArea(int l, int b){
        
    }
    
}

class Rectangle extends  Shape{
    @Override
    public void getArea(int l, int b){
        int area =  l*b;
        System.out.println("After calculating area: " + area);
    }
}
