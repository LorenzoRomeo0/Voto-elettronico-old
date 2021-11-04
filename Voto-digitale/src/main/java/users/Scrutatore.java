package users;
import votes.Vote;
import votes.Result;

public class Scrutatore extends User{
	
	public Vote makeVote() {
		return null;
	}
	
	public boolean startVote(Vote vote) {
		return false;
	}

	public boolean stopVote(Vote vote) {
		return false;
	}

	public Result getResult(Vote vote) {
		return null;
	}
}
