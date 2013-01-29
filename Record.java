import java.util.ArrayList;
import java.util.List;


/**
 * 
 * @author Cam
 * @version 1.0, 7/16/2012
 */
public class Record {

	private List<Vertex> list;
	private int pathDist = 0;
	private int lastWeight;
	
	/**
	 * test meth
	 */
	public static void main (String[] args) {
		Vertex a = new Vertex("A");
		Vertex f = new Vertex("F");
		Vertex t = new Vertex("T");
		Vertex b = new Vertex("B");
		Vertex c = new Vertex("C");
		a.addAdjacent(f,1);
		f.addAdjacent(t, 10);
		t.addAdjacent(b, 2);
		b.addAdjacent(c, 3);
		
		Record r = new Record(a); 
		Record r2 = new Record(r, f);
		Record r3 = new Record(r2, t);
		Record r4 = new Record(r3, b);
		Record r5 = new Record(r4, c);
		
		r.addVert(f);
		r.addVert(t);
		r.addVert(b);
		r.addVert(c);
		
		System.out.println(r.toString());
		System.out.println(r2.toString());
		System.out.println(r3.toString());
		System.out.println(r4.toString());
		System.out.println(r5.toString());
	}
	
	public Record(Vertex v) {
		list = new ArrayList<Vertex>();
		list.add(v);
	}
	
	public Record(Record r) {
		list = new ArrayList<Vertex>(r.getList());
		//for (int i = 0;i < r.list.size();i++)
		//	list.add(r.list.get(i));
		pathDist = r.getPathDist();
        lastWeight = r.getLastWeight();
	}
	
	public Record(Record r, Vertex v) {
		this(r);
		addVert(v);
	}
	
	public void addVert(Vertex v) {
		lastWeight = getLastVert().getAdjWeight(v);
		pathDist += lastWeight;
		list.add(v);
	}

	/**
	 * @return the path list
	 */
	public List<Vertex> getList() {
		return list;
	}

	/**
	 * @return the last edge wight
	 */
	public int getLastWeight() {
		return lastWeight;
	}
	/**
	 * @return the pathDist
	 */
	public int getPathDist() {
		return pathDist;
	}

	/**
	 * @return the number of vertexes
	 */
	public int getVertNum() {
		return list.size();
	}
	
	/**
	 * @return the the last vertex in the path
	 */
	public Vertex getLastVert() {
		return list.get(list.size() - 1);
	}
	
	/**
	 * @return the penultimate vertex in the path
	 */
	public Vertex getPenultVert() {
		return list.get(list.size() - 2);
	}
	
	/**
	 * @return String representation of the path
	 */
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Path: ");
		for (Vertex v : list) {
			sb.append(v.getName());
			sb.append(" -> ");
		}
		sb.append("    Distance: " + pathDist);
		sb.append("\n");
		return sb.toString();
	}
	
}
