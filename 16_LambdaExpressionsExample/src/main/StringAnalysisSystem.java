package main;

public class StringAnalysisSystem {

	public void searchString(String[] targets, String searchStr
			, StringAnalyzer analyzer) {
		
		for (String target : targets) {
			
			if(analyzer.analyze(target, searchStr)) {
				System.out.println("Found : " + target);
			}
			
		}
		
		
	}
	
	
}
