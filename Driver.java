import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author Cam
 *
 */
public class Driver {

	public static void main(String[] arg) throws IOException {
		Scanner scan = new Scanner(System.in);
		boolean repeat = true;

		while (repeat) {
			//get filename and print adj list
			System.out.print("Please input graph filepath : ");
			String fn = scan.nextLine();
			AdjacencyList list = new AdjacencyList(fn);
			System.out.println(list.toString() + "\n");
			
			//graph algorithm
			System.out.println("1) BFS \n2) DFS \n3) Dijkstra's \n4) Prim's");
			System.out.print("Enter number for desired graph algorithm : ");
			
			//choose ds based on input
			DataStructure<Record> ds = null;
			int dsNum = scan.nextInt();
			scan.nextLine();
			if (dsNum == 1)
				ds = new MyQ<Record>();
			else if (dsNum == 2)
				ds = new MyStack<Record>();
			else if (dsNum == 3)
				ds = new MyPQ<Record>(new DijkstraComparator());
			else if (dsNum == 4)
				ds = new MyPQ<Record>(new PrimComparator());
			
			//starting vertex
			System.out.print("Enter name of starting vertex : ");
			String start = scan.nextLine();
			
			//output type
			System.out.println("1) Path List \n2) Edge List");
			System.out.print("Enter number for desired output type : ");
			int output = scan.nextInt();

			//perform traversal
			GraphTraverser g = new GraphTraverser();
			ArrayList<Record> finalList = g.traverse(ds, list, start);
			
			//give appropriate output
			if (output == 2) {
				new GraphTraverse().printEdges(finalList);
			} else
				g.printPaths();

			//ask for repeat
			System.out.println("If you would like to perform a traversal on another graph or use another algorithm, press 1. \nOtherwise press 2.");
			int i = scan.nextInt();
			scan.nextLine();
			if (i != 1)
				repeat = false;
		}
	}

}
