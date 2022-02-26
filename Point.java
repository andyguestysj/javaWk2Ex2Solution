class Point {
  double x;
  double y;

  public void set(double x, double y)  {
    this.x = x;
    this.y = y;
  }

  public double distance(Point other) {
    // distance is the square route of the sum of the squares of the differences in each dimension    
    double x_offset = this.x - other.x;
    double y_offset = this.y - other.y;

    return (Math.sqrt((x_offset*x_offset)+(y_offset*y_offset)));
  }

  public void add(Point other) {
    this.x += other.x;
    this.y += other.y;
  }

  public Point clone(){
    Point clonedPoint = new Point();
    clonedPoint.x = this.x;
    clonedPoint.y = this.y;
    return clonedPoint;
  }


}