import org.junit.jupiter.api.Assertions;
import org.junit.Test;
public class TestJunit {
	@Test
	public void boardTest() {
		Board n = new ConwaysGameOfLife();
		System.out.println("------ TEST ONE EXECUTED ------");
		Assertions.assertEquals("..........\n...**.....\n...**.....\n..........\n..........\n..***.....\n..**......\n..**......\n..........\n..........\n",((ConwaysGameOfLife) n).generateNextGeneration(n.createBoard(10)));
	}
	

}
