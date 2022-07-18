package Practice;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class PracticeWithSet {

	public static void main(String[] args) {
	Set<Character> alphabetsL = new LinkedHashSet<Character>();
	Set<Character> alphabetsT = new TreeSet<Character>();
	Set<Character> alphabetsH = new HashSet<Character>();

	alphabetsL.add('A');
	alphabetsL.add('B');
	alphabetsL.add('Z');
	alphabetsL.add('R');
	alphabetsL.add('S');
	alphabetsL.add('B');
	alphabetsL.add('S');
	System.out.println("Linked Hash set: Insertion order");
	System.out.println(alphabetsL);
	alphabetsT.add('A');
	alphabetsT.add('B');
	alphabetsT.add('Z');
	alphabetsT.add('R');
	alphabetsT.add('S');
	alphabetsT.add('B');
	alphabetsT.add('S');
	System.out.println("Tree Set: Sorting order");
	System.out.println(alphabetsT);
	alphabetsH.add('A');
	alphabetsH.add('B');
	alphabetsH.add('Z');
	alphabetsH.add('R');
	alphabetsH.add('S');
	alphabetsH.add('B');
	alphabetsH.add('S');
	alphabetsH.add('Q');
	alphabetsH.add('V');
	System.out.println("Hash set : Random order");
	System.out.println(alphabetsH);
	}
}
