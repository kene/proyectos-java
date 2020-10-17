package mx.com.kene.myinterfaceImpl;

import java.util.Collections;
import java.util.List;

import mx.com.kene.myinterface.MyInterface;

public class MyClass implements MyInterface {

	@Override
	public Integer getMaxNum(List<Integer> intList) {
		Integer max = Collections.max(intList);
		return max;
	}

}
