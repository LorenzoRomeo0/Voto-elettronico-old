package users;

public abstract class User {
	private long UID;
	private Anagrafica anagrafica;
	private boolean enabled;
	
	public long getUID() {
		return UID;
	}	
	
	public Anagrafica getAnagrafica() {
		return anagrafica;
	}
	
	public boolean isEnabled() {
		return enabled;
	}

	private void enabled(boolean enabled) {
		this.enabled=enabled;
	}
}
