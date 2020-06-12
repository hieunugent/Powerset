import java.util.*;

class Program {
  public static List<List<Integer>> powerset(List<Integer> array) {
    // Write your code here.
		
		List<List<Integer>> results = new ArrayList<List<Integer>>();
		results.add(new ArrayList<Integer>());
		for (Integer ite : array){
			int len = results.size();
			for( int i = 0 ; i < len ; i++){
				List<Integer> result = new ArrayList<Integer> (results.get(i));
				result.add(ite);
				results.add(result);
			}
		}
    return results;
  }
	

	}
		
	
