package Practice;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpression {

	public static void main(String[] args) {
		Pattern pattern = Pattern.compile("Search directory");
				Matcher match = pattern.matcher("search");
				boolean matchfound = match.find();
				if (matchfound)
				{
					System.out.println("Match found");
				}
				else
					System.out.println("Match not found");
	}

}
