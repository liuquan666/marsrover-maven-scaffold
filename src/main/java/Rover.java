import model.Direction;

public class Rover {
    private Integer startX;
    private Integer startY;
    private Area area;
    private Direction direction;


    public void land(Area area, Integer startX, Integer startY, Direction direction) {
        this.startX = startX;
        this.startY = startY;
        this.area = area;
        this.direction = direction;
        this.validated();
    }

    public String getPosition() {
        return String.format("%s%s%s", startX, startY, direction.getDesc());
    }

    public void moveForward() {
        if (Direction.EAST.getDesc().equals(direction.getDesc())) {
            this.startX++;
        }
        if (Direction.WEST.getDesc().equals(direction.getDesc())) {
            this.startX--;
        }
        if (Direction.NORTH.getDesc().equals(direction.getDesc())) {
            this.startY++;
        }
        if (Direction.SOUTH.getDesc().equals(direction.getDesc())) {
            this.startY--;
        }

        this.validated();
    }


    public void turnLeft() {
        switch (direction) {
            case EAST:
                this.direction = Direction.NORTH;
                break;
            case SOUTH:
                this.direction = Direction.EAST;
                break;
            case WEST:
                this.direction = Direction.SOUTH;
                break;
            case NORTH:
                this.direction = Direction.WEST;
                break;
            default:
                break;
        }
    }

    public void turnRight() {
        switch (direction) {
            case EAST:
                this.direction = Direction.SOUTH;
                break;
            case SOUTH:
                this.direction = Direction.WEST;
                break;
            case WEST:
                this.direction = Direction.NORTH;
                break;
            case NORTH:
                this.direction = Direction.EAST;
                break;
            default:
                break;
        }
    }


    private void validated() {
        if (startX > area.getPoint().getX()) {
            throw new IllegalArgumentException("长度不在区域内");
        }

        if (startX > area.getPoint().getY()) {
            throw new IllegalArgumentException("宽度不在区域内");
        }
    }


}
