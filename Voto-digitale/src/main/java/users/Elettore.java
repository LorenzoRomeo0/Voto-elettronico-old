package users;

import java.util.ArrayList;

import votes.Seggio;
import votes.VoteInfo;

public class Elettore extends User{
	private ArrayList<VoteInfo> votes;
	private boolean enabledToVote;
	private boolean enabled;
	
	public Seggio[] getEnabledSeats() {
		return null;
	}
	
	public boolean vote() {
		return false;
	}

}
