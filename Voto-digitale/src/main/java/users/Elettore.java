package users;

import java.util.ArrayList;

import votes.Vote;
import votes.VoteInfo;

public class Elettore extends User{
	private ArrayList<VoteInfo> votes;
	private boolean enabledToVote;
	
	
	public Vote[] getEnabledSeats() {
		return null;
	}
	
	public boolean vote() {
		return false;
	}


	public boolean isEnabledToVote() {
		return enabledToVote;
	}
	
}
