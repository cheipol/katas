import org.junit.*;
import java.util.*;
import static org.junit.Assert.*;

public class DoorTest {
    @Test

    public void toggleDoor() {
        boolean expected = true;
        boolean actual = Door.toggleDoor(false);
        assertEquals(expected, actual);
    }
    @Test
    public void toggleRow() {
        Boolean[] expected = new Boolean[100];
        Arrays.fill(expected, Boolean.FALSE);
        Boolean[] actual = new Boolean[100];
        Arrays.fill(actual, Boolean.TRUE);
        actual = Door.toggleDoorsEach(actual,1);
        assertEquals(expected, actual);
    }
    @Test
    public void toggleAndToggle(){
        Boolean[] actual = new Boolean[4];
        Arrays.fill(actual, Boolean.FALSE);
        Boolean[] expected = new Boolean[]{Boolean.FALSE,Boolean.TRUE,Boolean.FALSE,Boolean.FALSE};
        actual = Door.toggleAndToggle(actual);
        assertEquals(expected, actual);
        
    }
    @Test
    public void solution(){
        Boolean[] doors = new Boolean[100];
        Arrays.fill(doors, Boolean.FALSE);
        Door.printArray(doors);
        doors = Door.toggleAndToggle(doors);
        Door.printArray(doors);
    }    


}