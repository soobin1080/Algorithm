package kakao기출;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class pg_스킬트리 {

	public static void main(String[] args) {

		String s = "CBD";

		int[] skill = new int[26];

		for (int i = 0; i < s.length(); i++) {
			skill[s.charAt(i) - 'A'] = i + 1;
		}

		String[] skill_trees = { "BACDE", "CBADF", "AECB", "BDA" };

		int answer = 0;
		for (int i = 0; i < skill_trees.length; i++) {
			int order = 1;
			boolean possible = true;
			String tree = skill_trees[i];
			for (int j = 0; j < tree.length(); j++) {
				int num = tree.charAt(j) - 'A';
				if (skill[num] == order)
					order++;
				else if (skill[num] == 0)
					continue;
				else {
					possible = false;
					break;
				}
			}

			if (possible) {
				answer++;
			}
		}
		System.out.println(answer);

		/********
		 * 다른 사람 풀이 *********
		 * 
		 * ArrayList<String> skillTrees = new
		 * ArrayList<String>(Arrays.asList(skill_trees)); Iterator<String> it =
		 * skillTrees.iterator();
		 * 
		 * while (it.hasNext()) { if (skill.indexOf(it.next().replaceAll("[^" + skill +
		 * "]", "")) != 0) { it.remove(); } } answer = skillTrees.size();
		 * 
		 ****************************/

	}

}
