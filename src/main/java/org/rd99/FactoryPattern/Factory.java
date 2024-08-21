// class Point{

//     private double x,y;

//     //Confusing if u want to pass x,y vs rho/theta
//     private Point(double x, double y){
//         this.x = x;
//         this.y = y;
//     }
//     //errornous code
//     private Point (double rho, double theta){
//         x = rho * Math.cos(theta);
//         y = rho * Math.sin(theta);
//     }
// }
//So alternative is to use factory pattern
enum CoordinateSystem{
    CARTESIAN, POLAR
}
// class Point{
//     private double x,y;

//     private Point(double x, double y , CoordinateSystem cs){
//         //again tedious to pass x,y vs rho/theta
//         switch(cs):
//         {
//             case CARTESIAN:
//                 this.x = x;
//                 this.y = y;
//                 break;
//             case POLAR:
//                 this.x = x * Math.cos(y);
//                 this.y = x * Math.sin(y);
//                 break;
//         }
//     }
// }

//Factory
// class Point{
//     double x,y;
//     // client cannot invoke constructor of Point 
//     private Point(double x, double y){
//         this.x = x;
//         this.y = y;
//     }
//     //Factory method
//     public static Point newCartesianPoint(double x, double y){
//         return new Point(x,y);
//     }
//     public static Point newPolarCoordinates(double rho, double theta){
//         return new Point(rho * Math.cos(theta), rho * Math.sin(theta));
//     }

// }

//OR create a seperate factory class

class Point{
    double x,y;
    private Point(double x, double y){
        this.x = x;
        this.y = y;
    }
    public static class Factory{
        public static Point newCartesianPoint(double x, double y){
            return new Point(x,y);
        }
        public static Point newPolarCoordinates(double rho, double theta){
            return new Point(rho * Math.cos(theta), rho * Math.sin(theta));
        }
    }
}

class Factory{
    public static void main(String[] args) {
        Point point = Point.Factory.newPolarCoordinates(2, 3);
        System.out.println(point.x + " " + point.y);

    }
}