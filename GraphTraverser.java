import java.util.ArrayList;

/**
 * @author Cam
 *
 */
public class GraphTraverser {
	
	ArrayList<Record> list = new ArrayList<Record>();
	
	public ArrayList<Record> traverse(DataStructure<Record> ds, AdjacencyList graph, String startName) {
		graph.reset();
		ds.add(new Record(graph.findVertex(startName)));
		
		while (ds.isEmpty() == false) {
			Record r = ds.remove();
			list.add(r);
			Vertex v = r.getLastVert();
			if (v.isVisited() == false) {
				v.setVisited(true);
				for (Vertex m : v.getAdjacencies()) {
					if (m.isVisited() == false)
						ds.add(new Record(r, m));
				}
			}
		}
		return list;
	}
	
	/**
	 * print all the paths in a given ArrayList<Record>.
	 */
	public void printPaths() {
		for (Record rec : list) {
			System.out.print(rec.toString());
		}
	}
	
}
