package javaTest;

class Point{
    int xPos, yPos;
    
    public Point(int x, int y) {
        xPos = x;
        yPos = y;
    }
    public void showPosition() {
        System.out.printf("[%d,%d]",xPos,yPos);
    }
    public boolean equals(Object obj) {
    Point cmp=(Point)obj;
    if(xPos==cmp.xPos && yPos==cmp.yPos)
        return true;
    else
        return false;
    }
}

class Rectangle{
    Point upperLeft, lowerRight;
    
    public Rectangle(int x1, int y1, int x2, int y2) {
        upperLeft=new Point(x1, y1);
        lowerRight=new Point(x2, y2);
    }
    
    public void showPosition() {
        System.out.println("직사각형 위치정보...");
        System.out.println("좌 상단: ");
        upperLeft.showPosition();
        System.out.println("");
        System.out.println("우 하단: ");
        lowerRight.showPosition();
        System.out.println("\n");
    }
    
    public boolean equals(Object obj) {
        Rectagle cmp
    }
}

class EncapsulationEquals {

}
