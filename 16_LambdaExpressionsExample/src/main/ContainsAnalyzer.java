package main;

public class ContainsAnalyzer implements StringAnalyzer{

	@Override
	public boolean analyze(String target, String searchStr) {
		if(target.contains(searchStr)) {
			return true;
		}
		return false;
	}
	
}
