import Data.Character;
import Data.Weapon;

import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

public class Main {

	public static List fillCharacterCollection(Collection weaponCollection, int n)
	{
		List<Character> list = new LinkedList<>();
		for (short i = 0; i < n; i++)
		{
			list.add(new Character(i, "Personaje " + (i + 1), (Weapon)weaponCollection.toArray()[(int)(Math.random()*weaponCollection.size())]));
		}
		return list;
	}

	public static List fillWeaponCollection(int n)
	{
		List<Weapon> list = new LinkedList<>();
		for (short i = 0; i < n; i++)
		{
			list.add(new Weapon(i, "Arma " + (i + 1), (int)(Math.random()*10)));
		}
		return list;
	}

	public static void main(String[] args) {
		List<Weapon> weapons = fillWeaponCollection(40);
		List<Character> characters = fillCharacterCollection(weapons, 200);
		characters.stream().filter(c -> {return c.getWeapon().getAtk() <= 3;}).forEach(c-> System.out.println(c));
	}
}
