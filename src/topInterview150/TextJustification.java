package topInterview150;

import java.util.ArrayList;
import java.util.List;

public class TextJustification {

	public static void main(String[] args) {
		System.out.println(fullJustify(new String[] { "short", "life", "here", "dummy" }, 10));
	}

	public static List<String> fullJustify(String[] words, int maxWidth) {
		List<String> ans = new ArrayList<>();
		List<String> cur = new ArrayList<>();
		int size = 0;
		for (String s : words) {
			if (s.length() + cur.size() + size > maxWidth) {
				for (int i = 0; i < maxWidth - size; i++) {
					cur.set(i % (cur.size() - 1 > 0 ? cur.size() - 1 : 1),
							cur.get(i % (cur.size() - 1 > 0 ? cur.size() - 1 : 1)) + " ");
				}
				StringBuilder sb = new StringBuilder();
				for (String str : cur)
					sb.append(str);
				ans.add(sb.toString());
				cur.clear();
				size = 0;
			}
			cur.add(s);
			size += s.length();
		}

		StringBuilder lastLine = new StringBuilder();
		for (int i = 0; i < cur.size(); i++) {
			lastLine.append(cur.get(i));
			if (i != cur.size() - 1) {
				lastLine.append(" ");
			}
		}
		while (lastLine.length() < maxWidth)
			lastLine.append(" ");
		ans.add(lastLine.toString());
		return ans;
	}

}
