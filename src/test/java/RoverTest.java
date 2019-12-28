import model.Direction;
import org.fest.assertions.api.Assertions;
import org.junit.Test;

public class RoverTest {

    @Test
    public void testLand() {
        Rover rover = new Rover();
        Area area = new Area(10, 10);
        rover.land(area, 5, 5, Direction.EAST);
        Assertions.assertThat(rover.getPosition()).isEqualTo("55E");
    }

    @Test
    public void moveForward() {
        Rover rover = new Rover();
        Area area = new Area(10, 10);
        rover.land(area, 5, 5, Direction.EAST);
        rover.moveForward();
        Assertions.assertThat(rover.getPosition()).isEqualTo("65E");
    }

    @Test
    public void turnLeftTest() {
        Rover rover = new Rover();
        Area area = new Area(10, 10);
        rover.land(area, 5, 5, Direction.EAST);
        rover.turnLeft();
        Assertions.assertThat(rover.getPosition()).isEqualTo("55N");
        rover.turnLeft();
        Assertions.assertThat(rover.getPosition()).isEqualTo("55W");
        rover.turnLeft();
        Assertions.assertThat(rover.getPosition()).isEqualTo("55S");
        rover.turnLeft();
        Assertions.assertThat(rover.getPosition()).isEqualTo("55E");
    }

    @Test
    public void turnLeftRight() {
        Rover rover = new Rover();
        Area area = new Area(10, 10);
        rover.land(area, 5, 5, Direction.EAST);
        rover.turnRight();
        Assertions.assertThat(rover.getPosition()).isEqualTo("55S");
        rover.turnRight();
        Assertions.assertThat(rover.getPosition()).isEqualTo("55W");
        rover.turnRight();
        Assertions.assertThat(rover.getPosition()).isEqualTo("55N");
        rover.turnRight();
        Assertions.assertThat(rover.getPosition()).isEqualTo("55E");
    }

    @Test
    public void turnRightTest() {
        Rover rover = new Rover();
        Area area = new Area(10, 10);
        rover.land(area, 5, 5, Direction.EAST);
        rover.moveForward();
        Assertions.assertThat(rover.getPosition()).isEqualTo("65E");
    }

}
