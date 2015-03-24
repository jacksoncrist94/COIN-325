package lab12;

public class ArrayList implements List{
	
	private int dimensions = 0;
	Object[] array1;
	Object[] array2;
	
	@Override
	public Object get(int index) {
		return array1[index - 1];
	}

	@Override
	public void add(Object obj) {
		array1 = new Object[(dimensions + 1)];
		if(dimensions == 0){
			array1[dimensions] = obj;	
		}
		else{
			for(int i = 0; i < array2.length; i++){
				array1[i] = array2[i];
			}
			array1[(array1.length - 1)] = obj;
		}
		dimensions++;
		array2 = new Object[dimensions];
		for(int i = 0; i < array2.length; i++){
			array2[i] = array1[i];
		}
	}

	@Override
	public int size() {
		return dimensions;
	}
	
}