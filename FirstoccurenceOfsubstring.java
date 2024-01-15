package StringQuest;

public class FirstoccurenceOfsubstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="My name is Shreya";
		String val="Nipu";
		
		int index=str.indexOf(val);
		if(index==-1)
			System.out.println("Not found");
		else
			System.out.println("Found");
	}

}
