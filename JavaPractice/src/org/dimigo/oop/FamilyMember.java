package org.dimigo.oop;

public class FamilyMember {
 
		private static int memberCnt;
		private String memberName;
		
		FamilyMember(String memberName) {
			this.memberName = memberName;
			memberCnt++;
		}
		
		public String getMemberName() {
			return memberName;
		}
		
		public void printMemberCnt(){
			System.out.println("가족 총 인원 수 : " + memberCnt + "명" );
		}
	
}
