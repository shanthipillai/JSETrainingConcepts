package jse.training.cocepts.optionalclass;

import java.util.Optional;

public class OptionalClass {
public static void main(String[] args) {
	String name="Nano";

	Optional<String> store=Optional.ofNullable(name);
	Optional<String> empty = Optional.empty();  
//	Optional<String> storefilter=	store.filter(i->i.length()>6);

	//Optional<String> store1=	Optional.of(name);
	if(store.isPresent() )
	{
		System.out.println(store.filter(i->i.length()>5));
		System.out.println(store.filter(i->i.length()>5).orElse("Not found"));
		//System.out.println("Empty"+store.empty().orElse(store.get()));
		
		System.out.println(store.get());
	}
	
	else
	{
		
		System.out.println("No value");
	}
	
//	System.out.println(store.get());
	System.out.println(store.isPresent());
	System.out.println(store.orElse("not presetn"));
	System.out.println(empty.orElse("no present"));
	System.out.println(store.empty());

}
}
