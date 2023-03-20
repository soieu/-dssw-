package ch07.exam02;

public class GreatWizard extends Wizard{
	GreatWizard(String name, int hp, int ap) {
		super(name, hp + 30, ap + 50);
	}
	
	@Override
	void attack(Character c) {
		System.out.println("대마법사 "+this.name+"가 ");
		c.hp =  c.hp - this.ap < 0 ? 0 : c.hp - this.
	}
}
