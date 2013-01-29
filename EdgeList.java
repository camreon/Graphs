import java.util.ArrayList;
import java.util.List;

/**
 * @author Cam
 *
 */
public class EdgeList {

	private List<Edge> list;
	
	public EdgeList() {
		list = new ArrayList<Edge>();
	}
	
	public void addEdge(Edge e) {
		list.add(e);
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		for (Edge e : list)
			sb.append(e.toString());
		return sb.toString();
	}
	
}
