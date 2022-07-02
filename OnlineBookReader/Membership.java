package OnlineBookReader;

import java.time.LocalDate;
import java.util.List;

public class Membership {
	
	int membershipId;
	MembershipType mType;
	LocalDate startDate;
	LocalDate endDate;
	
	List<User> userList;
	
}
