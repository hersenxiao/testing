package junit;
import org.junit.Test;
import static org.junit.Assert.*;

public class triangletest {
	private triangle triangle = new triangle();
	@Test
	public void testNottriangel(){
		assertEquals(triangle.getError(),triangle.type(0, 2, 3));
	}
	@Test
	public void testScalene(){
		assertEquals(triangle.getScalene(),triangle.type(3, 2, 4));
	}
	@Test
	public void testIsosceles(){
		assertEquals(triangle.getIsosceles(),triangle.type(3, 2, 3));
	}
	@Test
	public void testEquilateral(){
		assertEquals(triangle.getEquilateral(),triangle.type(3, 3, 3));
	}
}
