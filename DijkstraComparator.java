import java.util.Comparator;

/**
 * 
 */

/**
 * @author Cam
 *
 */
public class DijkstraComparator implements Comparator<Record> {

	@Override
	public int compare(Record r, Record r2) {
		// TODO Auto-generated method stub
		if (r.getPathDist() > r2.getPathDist())
			return 1;
		else if (r.getPathDist() < r2.getPathDist())
			return -1;
		else
			return 0;
	}

}
