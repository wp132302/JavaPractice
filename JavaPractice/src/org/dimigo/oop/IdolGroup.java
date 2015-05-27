package org.dimigo.oop;

public class IdolGroup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
					String[][] members = {
							{"GD", "태양", "탑", "승리", "대성"},
							{"CL", "산다라박", "박봄", "민지"},
							{"유라", "소진", "민아", "혜리", "그 외"}
					};
					
					String[] idolGroup = {"빅뱅", "2NE1", "걸스데이"};
					
					for(int i=0; i<idolGroup.length; i++){
						System.out.println();
						System.out.println("<<"+idolGroup[i]+">>");
						for(int j=0; j<members[i].length; j++){
							System.out.println(members[i][j]); //i줄에 j번째 요소
						
		}	

	}

}
}
