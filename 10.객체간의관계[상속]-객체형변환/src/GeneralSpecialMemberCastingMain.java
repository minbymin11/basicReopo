
public class GeneralSpecialMemberCastingMain {

	public static void main(String[] args) {
		
		GeneralMember gm1 = new GeneralMember(1,"KIM" , "경기도");
		GeneralMember gm2 = new GeneralMember(2, "LIM", "서울시");
		SpecialMember  sm1 = new SpecialMember(3, "BIM", "대구", 32);
		SpecialMember  sm2 = new SpecialMember(4, "QIM", "부산", 12);
		
		/*****************************************************/
		GeneralMember[] members = new GeneralMember[4];
		
		members[0] = gm1;
		members[1] = gm2;
		members[2] = sm1;
		members[3] = sm2;
		
		for (int i = 0; i < members.length; i++) {
			members[i].print();
		}
		/**********************************************************/
		
	}

}
