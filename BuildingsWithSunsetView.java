package stack_and_Queues;

import java.util.ArrayList;
import java.util.Stack;

public class BuildingsWithSunsetView {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> heights=new ArrayList<Integer>();
		heights.add(2);
		heights.add(10);
		heights.add(13);
		heights.add(6);
		
		Stack<BuildingWithHeight> sequence=new Stack<BuildingWithHeight>();
		int bindex=0;
		for(Integer i:heights) {
			
			Integer bheight=i;
			while(!sequence.isEmpty() && bheight>=sequence.peek().height) {
				sequence.pop();
			}
			sequence.add(new BuildingWithHeight(bindex++,bheight));
		}
		while(!sequence.isEmpty()) {
			System.out.println(sequence.peek().id+"::"+sequence.pop().height);
		}
		
	}

}

class BuildingWithHeight{
	
	Integer id;
	Integer height;
	
	BuildingWithHeight(Integer id, Integer height){
		this.id=id;
		this.height=height;
	}
}
