
/**
 * Edge containing 2 vertices and an edge weight
 * @author Cam
 * @version 1.0, 7/22/2012
 */
public class Edge {

	private Vertex v, v2;
	private int weight;
	
	public Edge(Vertex v, Vertex v2, int weight) {
		this.v = v;
		this.v2 = v2;
		this.weight = weight;
	}
	
	/**
	 * 
	 */
	public String toString() {
		return v + "<->" + v2 + "    " + weight + "\n";
	}

	/**
	 * @return the v
	 */
	public Vertex getV() {
		return v;
	}

	/**
	 * @param v the v to set
	 */
	public void setV(Vertex v) {
		this.v = v;
	}

	/**
	 * @return the v2
	 */
	public Vertex getV2() {
		return v2;
	}

	/**
	 * @param v2 the v2 to set
	 */
	public void setV2(Vertex v2) {
		this.v2 = v2;
	}

	/**
	 * @return the weight
	 */
	public int getWeight() {
		return weight;
	}

	/**
	 * @param weight the weight to set
	 */
	public void setWeight(int weight) {
		this.weight = weight;
	}
	
}
