import org.junit.jupiter.api.Assertions;
import org.junit.Test;
public class TestJunit {
	@Test
	public void boardTest() {
		Board b=new Board();
		System.out.println("=====TESTCASE ONE EXECUTED=====");
		Assertions.assertEquals(null,b.createBoard(-10));
		
	}
	@Test
	public void cglTestOne(){
		Board b = new ConwaysGameOfLife();
		System.out.println("=====TESTCASE TWO EXECUTED=====");
		Assertions.assertEquals("..........\n...**.....\n...**.....\n..........\n..........\n..***.....\n..**......\n...**.....\n..........\n..........\n",((ConwaysGameOfLife) b).generateNextGeneration(b.createBoard(10),1));
	}
	@Test
	public void cglTestTwo() {
		Board b = new ConwaysGameOfLife();
		System.out.println("=====TESTCASE THREE EXECUTED=====");
		Assertions.assertEquals("..........\n...**.....\n...**.....\n..........\n...**.....\n....*.....\n..*.**....\n...***....\n....**....\n..........\n",((ConwaysGameOfLife) b).generateNextGeneration(b.createBoard(10),2));
		
	}
}
