import org.junit.jupiter.api.Assertions;
import org.junit.Test;
public class TestJunit {
	@Test
	public void boardTest() {
		int s[][] = {{1,2,3},{2,3,4}};
		Board b=new Board();
		System.out.println("=====TESTCASE ONE EXECUTED=====");
		Assertions.assertEquals(null,b.createBoard(-10,s));
		
	}
	@Test
	public void cglTestOne(){
		Board b = new Board();
		//b.createBoard(10);
		int s[][] = {{1,3},{1,4},{2,4},{5,3},{5,4},{6,2},{6,3},{7,5},{8,4}};
		ConwaysGameOfLife cgl = new ConwaysGameOfLife();
		System.out.println("=====TESTCASE TWO EXECUTED=====");
		Assertions.assertEquals("..........\n...**.....\n...**.....\n..........\n..........\n..***.....\n..**......\n...**.....\n..........\n..........\n",(cgl.generateNextGeneration(b.createBoard(10,s),1)));
	}
	@Test
	public void cglTestTwo() {
		Board b = new Board();
		//b.createBoard(10);
		int s[][] = {{1,3},{1,4},{2,4},{5,3},{5,4},{6,2},{6,3},{7,5},{8,4}};
		ConwaysGameOfLife cgl = new ConwaysGameOfLife();
		System.out.println("=====TESTCASE THREE EXECUTED=====");
		Assertions.assertEquals("..........\n...**.....\n...**.....\n..........\n...**.....\n....*.....\n..*.**....\n...***....\n....**....\n..........\n",(cgl.generateNextGeneration(b.createBoard(10,s),2)));
		
	}
	@Test 
	public void cglTestThree() {
		Board b = new Board();
		//b.createBoard(10);
		int s[][] = {{1,2,3},{2,3,4}};
		ConwaysGameOfLife cgl = new ConwaysGameOfLife();
		System.out.println("=====TESTCASE FOUR EXECUTED=====");
		Assertions.assertEquals("Iteration can't be performed.",(cgl.generateNextGeneration(b.createBoard(10,s),-3)));
	}
}
