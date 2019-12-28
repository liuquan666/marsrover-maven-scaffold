import model.Point;

public class Area {
    private Point point;
    private Integer area;

    public Area(Integer x, Integer y) {
        this.point = new Point(x, y);
        area = this.point.getX() * this.point.getY();
    }

    public Integer getArea(Point point) {
        this.area = point.getX() * this.point.getY();
        return this.area;
    }

    public Point getPoint() {
        return point;
    }
}
