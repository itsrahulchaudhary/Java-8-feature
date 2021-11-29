package in.rahulit.beans;

import java.util.StringJoiner;

public class StringJoinerDemo {
	public static void main(String[] args) {
		// StringJoiner joiner = new StringJoiner(","); //only delimiter
		StringJoiner joiner = new StringJoiner(",", "{", "}"); // delimiter + prefix + suffix

		joiner.add("Ramu");
		joiner.add("Sita");
		joiner.add("Raja");
		joiner.add("Rani");

		System.out.println(joiner);
	}

}
