package javaRefresher;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		ArrayList<String> arryList = new ArrayList<String>();
		arryList.add( "Prep1" );
		arryList.add( "Prep2" );
		arryList.add( "Prep3" );
		arryList.add( "Prep4" );
		arryList.add( "Prep5" );
		arryList.add( "Prep6" );
		arryList.remove(0);
		getCapacity( arryList );
		
		for (String prep:arryList) {
			System.out.println(prep);
		}
		

	}
	public static void getCapacity( ArrayList<?> l )
	        throws Exception
	    {
//	        java.lang.reflect.Field dataField = ArrayList.class.getDeclaredField( "elementData" );
//	        dataField.setAccessible( true );
//		( (Object[]) dataField.get( l ) ).length
	        System.out.println( "Size: "+ l.size() );
	}

}
