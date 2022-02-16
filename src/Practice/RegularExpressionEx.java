package Practice;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpressionEx {
	public static void main(String[] args) {
		Pattern pattern = Pattern.compile("W3 schools", Pattern.CASE_INSENSITIVE);
		Matcher matcher = pattern.matcher("Visit W3 schools!");
		boolean matchFound = matcher.find();
		
	if(matchFound) {
		System.out.println("Match Found");
	}
	else {
		System.out.println("Match not Found");
	}
	}
}

