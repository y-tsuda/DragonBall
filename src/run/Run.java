package run;

import base.Character;
import evil.Piccolo;
import justice.Goku;

public class Run {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Character base[] = new Character[2];
		base[0] = new Goku();
		base[1] = new Piccolo();
		
		for(Character chara:base){
			chara.attack();
		}
	}

}
