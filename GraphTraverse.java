import java.util.ArrayList;

/**
 * @author Cam
 *
 */
public class GraphTraverse {

	private EdgeList eList = new EdgeList();
	
	public void printEdges(ArrayList<Record> list) {
		boolean first = true;
		int weightSum = 0;
		
		for (Record r : list) {
			if (first == true) //skip the first path
				first = false;
			else {
				Edge e = new Edge(r.getLastVert(), r.getPenultVert(), r.getLastWeight());
				eList.addEdge(e);
				weightSum += r.getLastWeight();
			}
		}
		
		System.out.println(eList.toString());
		System.out.println(weightSum);
	}
	
}
