package enthuware;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import com.sun.corba.se.spi.activation.InitialNameServicePackage.NameAlreadyBound;

public class Test6 {
	
	private List<String> list;
	
	public List<String> getList(){
		return list;
	}
	
	public void setList(List<String> list) {
		this.list = list;
	}
	
	public void printNames() {
		System.out.println(getList());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> list = Arrays.asList(
				"Bob Hope",
				"Bob Dole",
				"Bob Brown"
				);
		
		
		Test6 test = new Test6();
		test.setList(list.stream().collect(Collectors.toList()));
		//test.getList().forEach(Test6::printNames);
		test.getList().forEach(System.out::println);
		//test.printNames();
		
	}

}
