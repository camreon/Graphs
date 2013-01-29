import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * List of adjacent vertices
 * @author Cam
 * @version 1.0, 7/16/2012
 */
public class AdjacencyList {

	public List<Vertex> list = new ArrayList<Vertex>();
	
	/**
	 * test meth
	 */
	public static void main (String[] args) throws IOException {
		AdjacencyList a = new AdjacencyList("book1.txt");
		System.out.println(a.toString());
	}
	
	/**
	 * Constructor that reads in text file and creates the list
	 * @param fn Filename
	 */
	public AdjacencyList(String fn) throws IOException {
		BufferedReader reader = new BufferedReader(new FileReader(fn));
		String line = null;
		while ((line = reader.readLine()) != null) {
			
			boolean currAdded = false, adjAdded = false;
		    Vertex currV = new Vertex(Character.toString( line.charAt(0) ));
		    Vertex adjV = new Vertex(Character.toString( line.charAt(2) ));
		    int w =  Integer.parseInt( line.substring(4) );
		    
		    for (int i = 0; i < list.size(); i++) {
			    //add duplicate
		    	if (list.get(i).getName().equals(currV.getName())) {
		    		list.get(i).addAdjacent(adjV, w);
		    		currAdded = true;
		    	}
				//reverse addition
		    	if (list.get(i).getName().equals(adjV.getName())) {
		    		list.get(i).addAdjacent(currV, w);
		    		adjAdded = true;
		    	}
		    }
		    if (currAdded == false) {
			    //add new
		    	currV.addAdjacent(adjV, w);
				list.add(currV);
		    }
		    if (adjAdded == false) {
				//rev add
				adjV.addAdjacent(currV, w);
				list.add(adjV);
		    }
		    
		}		
	}
	
	/**
	 * Locates vertex in the list based on its name
	 * @param name Name of the vertex you're looking for
	 * @return The found vertex or null if non-existent
	 */
	public Vertex findVertex(String name) {
		if (list.isEmpty())
			return null;
		for (Vertex v : list) {
			if (v.getName().equals(name))
				return v;
		}
		return null;
	}
	
	/**
	 * Sets visited tracker of each vertex back to false
	 */
	public void reset() {
		for (Vertex v : list) {
			v.setVisited(false);
		}
	}
	
	/**
	 * ToString override
	 * @return toString of each vertex
	 */
	public String toString() {
		StringBuilder sb = new StringBuilder();
		for (Vertex v : list) {
			sb.append( v.toString() );
			sb.append("\n");
		}
		return sb.toString();
	}
	
}
