package Array;

import java.util.*;
import java.util.Arrays;

public class multilpy_two_arbitaryprecisionIntegers {

	public static void main(String[] args) {
		List<Integer> list1 =new ArrayList<Integer>(Arrays.asList(1,9,3,7,0,7,7,2,1));
		List<Integer> list2=new ArrayList<Integer>(Arrays.asList(-7,6,1,8,3,8,2,5,7,2,8,7));
		
		
		final int sign=list1.get(0)<0 ^ list2.get(0)<0?-1:1;
		System.out.println(sign);
		list1.set(0, Math.abs(list1.get(0)));
		list2.set(0, Math.abs(list2.get(0)));
		List<Integer> result=new ArrayList<Integer>(Collections.nCopies(list1.size()+list2.size(), 0));
		
		for(int i=list1.size()-1;i>=0;i--) {
			for(int j=list2.size()-1;j>=0;j--) {
				result.set(i+j+1, result.get(i+j+1)+list1.get(i)*list2.get(j));
				result.set(i+j,result.get(i+j)+result.get(i+j+1)/10);
				result.set(i+j+1,result.get(i+j+1)%10);
				
			}
		}
		
		int first_not_zero=0;
		while(first_not_zero<result.size() && result.get(first_not_zero)==0) {
			++first_not_zero;
		}
		
		result=result.subList(first_not_zero, result.size());
		
		result.set(0, sign*result.get(0));
		
		for(Integer l:result) {
			System.out.print(l);
		}
	}
}

