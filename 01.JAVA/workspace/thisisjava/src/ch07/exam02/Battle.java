package ch07.exam02;

public class Battle {
	public static void main(String[] args) {
		Warrior warrior = new Warrior("전사", 100, 100);
		Wizard wizard = new GreatWizard("마법사", 80, 100);
		
		// 전사의 체력
		System.out.println("전사체력: "+warrior.hp);
		// 마법사의 체력
		System.out.println("마법사체력: "+wizard.hp);
	}

}
