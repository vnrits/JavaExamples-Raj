public class Shape<T> {
private T t;
public void add(T t) {
this.t = t;
}
public T get() {
return t;
}

public static void main(String[] args) {
	
Shape<Integer> intShape = new Shape<Integer>();
Shape<String> strShape = new Shape<String>();
intShape.add((123));
strShape.add(new String("Generic Classes"));
System.out.printf("Integer Value :%d\n\n", intShape.get());
System.out.printf("String Value :%s\n", strShape.get());
}
}
