import java.util.Comparator;

/**
 * 
 */

/**
 * @author Cam
 *
 */
public class PrimComparator implements Comparator<Record> {

	@Override
	public int compare(Record r, Record r2) {
		// TODO Auto-generated method stub
		if (r.getLastWeight() > r2.getLastWeight())
			return 1;
		else if (r.getLastWeight() < r2.getLastWeight())
			return -1;
		else
			return 0;
	}

}
