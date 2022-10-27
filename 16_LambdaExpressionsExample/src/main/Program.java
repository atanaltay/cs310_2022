package main;

public class Program {

	public static void main(String[] args) {
		
		StringAnalysisSystem analysisSystem 
		= new StringAnalysisSystem();
		
		String[] strList = {"tomorrow",
			"toto","to","timbukto",
			"the","hello","heat"};  
		String searchStr = "to";

		ContainsAnalyzer containsAnalyzer = new ContainsAnalyzer();
		
		analysisSystem.searchString(strList, searchStr, containsAnalyzer);
		
		System.out.println("-------------------------");
		System.out.println("Second version");
		
		//with anonymous inner class
		analysisSystem.searchString(strList, searchStr, new StringAnalyzer() {
			
			@Override
			public boolean analyze(String target, String searchStr) {
				if(target.contains(searchStr)){
					return true;
				}else {
					return false;
				}
			}
		});
		
		//with lambda expression
		System.out.println("-------------------------");
		System.out.println("Third version");
		
		analysisSystem.searchString(strList, searchStr, 
			(t,s)-> t.contains(s));
		
	
		System.out.println("------------------");
		System.out.println("Strings ending with a search string:");
	
		analysisSystem.searchString(strList, "o", 
				(t,s)-> t.endsWith(s) );
		
		System.out.println("------------------");
		System.out.println("Strings starting with a search string:");
		
		analysisSystem.searchString(strList, "he", 
				(t,s)-> t.startsWith(s));
		
		
		
	}
	
	
	
	
	
}
