package Data;

public class Weapon {
	private final short weaponID;
	private String name;
	private int atk;

	public Weapon(short weaponID, String name, int atk) {
		this.weaponID = weaponID;
		this.name = name;
		this.atk = atk;
	}

	public short getWeaponID() {
		return weaponID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAtk() {
		return atk;
	}

	public void setAtk(int atk) {
		this.atk = atk;
	}

	@Override
	public String toString() {
		return "Weapon{" +
				"weaponID=" + weaponID +
				", name='" + name + '\'' +
				", atk=" + atk +
				'}';
	}
}
