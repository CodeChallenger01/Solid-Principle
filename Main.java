class Rectangle{
    int width;
    int height;
    public void setWidth(int width){
        this.width = width;
    }
    public void setHeight(int height) {
        this.height = height;
    }
    public int getWidth() {
        return this.width;
    }
    public int getHeight() {
        return this.height;
    }
    public int getArea() {
        return this.width * this.height;
    }
}
class Square extends Rectangle{
    public void setSquareSide(int side){
        width = side;
        height = side;
    }
}
/*Main Class of Java*/
public class Main {
    public static void main(String[] args) {
        Rectangle rectangleObj = new Rectangle();
        rectangleObj.setHeight(10);
        rectangleObj.setWidth(5);
        System.out.println("Area of Rectangle :" +rectangleObj.getArea());

        Square squareObj=new Square();
        squareObj.setSquareSide(5);
        System.out.println("Area of Square :" +squareObj.getArea());

    }
}

