package ds.hashcode;

public class WordDictionary {
	private Definition[] defTable = new Definition[Word.WORDS];
	
	public void insert(Word w, Definition d){
		defTable[w.hashCode()] = d;
	}
	
	Definition find(Word w){
		return defTable[w.hashCode()];
	}
}
