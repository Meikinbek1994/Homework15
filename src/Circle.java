public class Circle {

    private static double PI;
    private static double radius;




    public Circle(double PI, double radius){
        this.PI=PI;
        this.radius=radius;
    }



    //Methods
    public static void area(){
        System.out.println("Area of the circle is: "+Math.PI*(radius*radius));
    }

    public static void circumference(){
        System.out.println("Circumference of the circle is: "+Math.PI*2*radius);
    }





}
