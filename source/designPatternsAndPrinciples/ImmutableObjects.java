package designPatternsAndPrinciples;

import java.util.ArrayList;
import java.util.List;

public final class ImmutableObjects {

	private final List<String> favoriteFoods;
	
	public ImmutableObjects(List<String> favoriteFoods) {
		if(favoriteFoods == null) {
			throw new RuntimeException("favoriteFood is required");
		}
		this.favoriteFoods = new ArrayList<String>(favoriteFoods);
	}
	
	public List<String> getFavoriteFoods(){ // makes class MUTABLE !!!!
		return favoriteFoods;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
