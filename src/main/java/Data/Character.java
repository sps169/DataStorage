package Data;

public class Character {
	private final short characterID;
	private String name;
	private Weapon weapon;

	public Character(short characterID, String name, Weapon weapon) {
		this.characterID = characterID;
		this.name = name;
		this.weapon = weapon;
	}

	public short getCharacterID() {
		return characterID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Weapon getWeapon() {
		return weapon;
	}

	public void setWeapon(Weapon weapon) {
		this.weapon = weapon;
	}

	@Override
	public String toString() {
		return "Character{" +
				"characterID=" + characterID +
				", name='" + name + '\'' +
				", weapon=" + weapon +
				'}';
	}
}
