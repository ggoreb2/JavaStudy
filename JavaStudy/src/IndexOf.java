class IndexOf {
	public static void main(String args[]) {
		//            012345 678  
		String str = "Java ������ �缺�� ���� ����������!!";
		int idx = str.indexOf(" ");
		System.out.println(idx); // 4
		
		idx = str.indexOf(" ", 4 + 1);
		System.out.println(idx); // 8
		
		idx = str.indexOf(" ", 8 + 1);
		System.out.println(idx); // 12
		
		idx = str.indexOf(" ", 12 + 1);
		System.out.println(idx);
		
		idx = str.indexOf(" ", 15 + 1);
		System.out.println(idx); // -1
		
		
	}
}