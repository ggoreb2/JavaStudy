class IndexOf2 {
	public static void main(String args[]) {
		//            012345 678  
		String str = "Java ������ �缺�� ���� ����������!!";
		
		int idx = -1;
		while(true) {
			idx = str.indexOf(" ", idx + 1);
			
			System.out.println(idx);
			
			if(idx == -1) {
				break;
			}
		}
	}
}