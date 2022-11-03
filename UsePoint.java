class UsePoint {
  public static void main(String[] args) {
    Point p1 = new Point(3, 5);
    Point p2 = new Point(8, 11);
    Point p3 = p1.shiftXCreate(7);

    System.out.println("p1: " + p1);
    System.out.println("p2: " + p2);
    System.out.println("p3 :" + p3);
    System.out.println(p1.measureDistance(p2));
    System.out.println(Point.measureDistanceStatic(p1, p2));
  }
}