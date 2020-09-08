package functionalProgramming2.supplier;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.function.Supplier;

public class SupplierFactory {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Developer obj = factory(Developer::new);
		System.out.println(obj);
		
		Developer obj2 = factory(() -> new Developer("Victor"));
		System.out.println(obj2);

	}
	
	public static Developer factory(Supplier<? extends Developer> s) {
		Developer developer = s.get();
		
		if(developer.getName() == null || "".equals(developer.getName())) {
			developer.setName("default");
		}
		
		developer.setSalary(BigDecimal.ONE);
		developer.setStart(LocalDate.of(2020, 8, 11));
		
		return developer;
	}

}


class Developer {
	String name;
	BigDecimal salary;
	LocalDate start;
	
	public Developer() {
		// TODO Auto-generated constructor stub
	}

	public Developer(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public BigDecimal getSalary() {
		return salary;
	}

	public void setSalary(BigDecimal salary) {
		this.salary = salary;
	}

	public LocalDate getStart() {
		return start;
	}

	public void setStart(LocalDate start) {
		this.start = start;
	}

	@Override
	public String toString() {
		return "Developer [name=" + name + ", salary=" + salary + ", start=" + start + "]";
	}
	
	
	
}
