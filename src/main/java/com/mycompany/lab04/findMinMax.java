package com.mycompany.lab04;

import java.util.List;

public class findMinMax {

	public static void findMaxMin(List<Double> scoreList) {
		int numberOfScores = 0;
		double maxScore = -2e35;
		double minScore = 2e35;
		double nextScore;
		int i = 0;
		while (i < scoreList.size()) {
			nextScore = scoreList.get(i);
			if (nextScore > maxScore) {
				maxScore = nextScore;
			}
			if (nextScore < minScore) {
				minScore = nextScore;
			}
			numberOfScores++;
			i++;
		}
		if (numberOfScores < 1) {
			System.out.println("No scores found in score list");
		} else {
			System.out.println(numberOfScores + "total scores found in score list");
			System.out.println("The maximum score is" + maxScore);
			System.out.println("The minimum score is" + minScore);
		}
	}

}
