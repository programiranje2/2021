package test;

import java.util.Scanner;

import music.Musician;
import music.Song;
import util.Nationality;

public class Test {
	
	public static final Scanner IN = new Scanner(System.in);
	
	public void testPrintln() {
		System.out.println("Imagine there's no heaven" + '\n' + "It's easy if you try");
	}
	
	public void testScanner() {
		System.out.print("Read a line: ");
		String s = IN.nextLine();
		System.out.println("You just read: " + s);
	}
	
	public void testMusician() {
//		Musician johnLennon = new Musician("John", false, -1);
		Musician johnLennon = new Musician("John", Nationality.UK, false, -1);
		System.out.println(johnLennon);
		johnLennon.setName("John Lennon");
		System.out.println(johnLennon);
		if (johnLennon.isAlive()) {
//			System.out.println(johnLennon.age);			// No! age is private
			System.out.println(johnLennon.getAge());
		} else {
			System.out.print(johnLennon + "; RIP");
		}
	}
	
	public void testSong() {
//		Musician johnLennon = new Musician("John Lennon", false, -1);
		Musician johnLennon = new Musician("John Lennon", Nationality.UK, false, -1);
		Song imagine = new Song("Imagine", johnLennon, 1971);
		System.out.println(imagine);
		System.out.println();
		imagine.play();
	}

}
