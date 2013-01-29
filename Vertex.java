import java.util.ArrayList;
import java.util.List;

/**
 * Vertex class for graph representation
 * @author Cam
 * @version 1.0, 7/16/2012
 */
public class Vertex {

	private String name;
	private boolean visited = false;
	private List<AdjNode> adjacencies;
	
	/**
	 * Constructor that sets name
	 * @param name Vertex's name
	 */
	public Vertex(String name) {
		this.setName(name);
		setVisited(false);
		adjacencies = new ArrayList<AdjNode>();
	}
	
	public class AdjNode {		
		private Vertex v;
		private int w;
		
		public AdjNode(Vertex v, int w) {
			this.v = v;
			this.w = w;
		}
		
		public Vertex getVertex() {
			return v;
		}
		public void setVertex(Vertex v) {
			this.v = v;
		}
		public int getWeight() {
			return w;
		}
		public void setWeight(int w) {
			this.w = w;
		}		
	}
	
	/**
	 * List of adjacent vertices and their edge weights
	 * @param v An adjacent vertex
	 * @param w The edge weight between these v's
	 */
	public void addAdjacent(Vertex v, int w) {
		adjacencies.add(new AdjNode(v, w));
	}
	
	/**
	 * Gets weight between current and input vertex
	 * @param v Vertex you want to get the weight to
	 * @return weight
	 */
	public int getAdjWeight(Vertex v) {
		for (int i = 0; i < adjacencies.size(); i++) {
			if (adjacencies.get(i).getVertex().getName().equals(v.getName())) {
				return adjacencies.get(i).getWeight();
			}
		}
		return (Integer)null;
	}
	
	/**
	 * Gets the adjacency list
	 * @return All adjacent vertices and weights
	 */
	public List<Vertex> getAdjacencies() {
		List<Vertex> list = new ArrayList<Vertex>();
		for (AdjNode n : adjacencies) {
			list.add(n.getVertex());
		}
		return list;
	}
	
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the visited
	 */
	public boolean isVisited() {
		return visited;
	}
	/**
	 * @param visited the visited to set
	 */
	public void setVisited(boolean visited) {
		this.visited = visited;
	}

	/**
	 * ToString override method
	 * @return String list of all adjacent vertexes
	 */
	public String toString() {
		StringBuilder sb = new StringBuilder();		
		sb.append(name);
		sb.append(" : ");
		for (AdjNode node : adjacencies) {
			sb.append(node.getVertex().getName() + "  " + node.getWeight() + " , ");
		}
		return sb.toString();
	}
	
}
