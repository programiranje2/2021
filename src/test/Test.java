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
	
	public void testStatic() {
		Musician johnLennon = new Musician("John Lennon", Nationality.UK, false, -1);
		Musician georgeHarrison = new Musician("George Harrison", Nationality.UK, false, -1);
		
		Song imagine = new Song("Imagine", johnLennon, 1971);

		System.out.println(imagine.getDefinition());	// OK, but not typical
		System.out.println(Song.getDefinition());		// typical
		System.out.println();
		
		Song something = new Song("Something", georgeHarrison, 1969);
		
		System.out.println(something.getDefinition());	// OK, but not typical
		System.out.println(Song.getDefinition());		// typical
		System.out.println();
		
		something.setDefinition("A beautiful piece of music performed by George Harrison.");
		System.out.println(something.getTitle() + ": " + something.getDefinition());
		System.out.println(imagine.getTitle() + ": " + imagine.getDefinition());
		System.out.println(Song.getDefinition());
		System.out.println();
		
		System.out.println(Math.PI);
		
	}
	
	public void testArrays() {
		int a[] = new int[5];
		for (int i = 0; i < a.length; i++) {
			a[i] = i + 1;
			System.out.println("a[" + i + "]: " + a[i]);
		}
	}
	
	public void testLoops() {
		int a[] = new int[5];
		for (int i = 0; i < a.length; i++) {
			a[i] = i + 1;
			System.out.println("a[" + i + "]: " + a[i]);
		}
		System.out.println();

		int i = 0;
		while (i < a.length) {
			a[i] = i + 10;
			System.out.println("a[" + i + "]: " + a[i]);
			i++;
		}
		System.out.println();
		
		i = 0;
		do {
			a[i] = i + 20;
			System.out.println("a[" + i + "]: " + a[i]);
			i++;
		} while (i < a.length);
		System.out.println();
		
		for (int j : a) {
			System.out.println("j: " + j);			
		}
	}
	
	public void testBreakAndContinue () {
		int a[] = new int[5];
		for (int i = 0; i < a.length; i++) {
			a[i] = i + 1;
			if (i == 3) {
				continue;
//				break;
			}
			System.out.println("a[" + i + "]: " + a[i]);
		}
		System.out.println("Done.");
	}
	
	public void testArraysOfObjects() {
		Musician johnLennon = new Musician("John Lennon", Nationality.UK, false, -1);
		Musician paulMcCartney = new Musician("Paul PcCartney", Nationality.UK, true, 79);
		Musician georgeHarrison = new Musician("George Harrison", Nationality.UK, false, -1);
		Musician ringoStarr = new Musician("Ringo Starr", Nationality.UK, true, 81);
		
//		Musician[] theBeatles = new Musician[4];
//		theBeatles[0] = johnLennon;
//		theBeatles[1] = paulMcCartney;
//		theBeatles[2] = georgeHarrison;
//		theBeatles[3] = ringoStarr;
		
		Musician[] theBeatles = {johnLennon, paulMcCartney, georgeHarrison, ringoStarr};
		
		for (Musician m : theBeatles) {
			System.out.println(m);
		}
		System.out.println();
	}
	
	public void testSwitch() {
		System.out.print("Enter an int between 1 and 4: ");
		int i = IN.nextInt();
		switch (i) {
			case 1: System.out.println("John"); break;
			case 2: System.out.println("Paul"); break;
			case 3: System.out.println("George"); break;
			case 4: System.out.println("Ringo"); break;
			default: System.out.println("Yhe number must be between 1 and 4.");
		}
	}
	
	public void testIntegerAndDouble() {
		Integer i = new Integer(-2);
		Double d = new Double(2.3);
		
		System.out.println("i.doubleValue(): " + i.doubleValue());
		System.out.println("d.intValue(): " + d.intValue());
		System.out.println("d rounded: " + Math.round(d));
	}

}
