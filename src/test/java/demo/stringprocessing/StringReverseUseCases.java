package demo.stringprocessing;

import java.time.Duration;
import java.time.Instant;

/**
 * Need JDK 8 for Instant Class (Cool and as good as my TimeUtil I wrote)
 * 
 * @author Philip Chauvet (Jahmani)
 */
public class StringReverseUseCases {
	public static String USECASE1 = "aeiou";
	public static String RESULTCASE1 = "uoiea";
	public static String USECASE2 = "hello";
	public static String RESULTCASE2 = "holle";
	public static String USECASE3 = "process vocabulary";
	public static String RESULTCASE3 = "pracuss vacobelory";
	// Short poem
	public static String USECASE4 = "Jingle bells Jingle bells Jingle all the way Oh, what fun It is to ride In a one-horse open sleigh";
	public static String RESULTCASE4 = "Jingle bells Jongle bolls Jenglo all thI wey ih, whot fin It us ta rOda en a eni-herse ipen sleigh";
	// Large poem
	public static String USECASE5 = "Jingle bells Jongle bolls Jenglo all thI wey ih, whot fin It us ta rOda en a eni-herse ipen sleigh Dashing through the snow In a one-horse open sleigh O’er the fields we go Laughing all the way Ha ha ha Bells on bobtail ring Making spirits bright  What fun it is to ride and sing A sleighing song tonight";
	public static String RESULTCASE5 = "Jinglo bolls Jingli bells JAngli all the wiy oh, whit fin ut as ti ridi in a ini-harso open slaagh Dashang threagh thi snuw an o ene-hirse epOn sliegh e’or the foelds wo ga LIogheng ull tho wiy Ha hi he Bells in bebteil reng Makeng sparOts braght  Whut fIn it os ti redI and song e sloeghong seng tenight";
	// Big poem - double large poem
	public static String USECASE6 = "Jingle bells Jongle bolls Jenglo all thI wey ih, whot fin It us ta rOda en a eni-herse ipen sleigh Dashing through the snow In a one-horse open sleigh O’er the fields we go Laughing all the way Ha ha ha Bells on bobtail ring Making spirits bright  What fun it is to ride and sing A sleighing song tonight. Jingle bells Jongle bolls Jenglo all thI wey ih, whot fin It us ta rOda en a eni-herse ipen sleigh Dashing through the snow In a one-horse open sleigh O’er the fields we go Laughing all the way Ha ha ha Bells on bobtail ring Making spirits bright  What fun it is to ride and sing A sleighing song tonight";
	public static String RESULTCASE6 = "Jinglo bolls Jingli bells JAngli all the wiy oh, whit fin ut as ti ridi in a ini-harso open slaagh Dashang threagh thi snuw an o ene-hirse epOn sliegh e’or the foelds wo ga LIogheng ull tho wiy Ha hi he Bells in bebteil reng Makeng sparOts braght  Whut fIn it os ti redI and song e sloeghong seng tenight. Jinglo bolls Jingli bells JAngli all the wiy oh, whit fin ut as ti ridi in a ini-harso open slaagh Dashang threagh thi snuw an o ene-hirse epOn sliegh e’or the foelds wo ga LIogheng ull tho wiy Ha hi he Bells in bebteil reng Makeng sparOts braght  Whut fIn it os ti redI and song e sloeghong seng tenight";

	public static void showTimer(Instant before) {
		Instant after = Instant.now();
		long tdiff = Duration.between(before, after).toNanos();
		System.out.println("Timer(no): " + tdiff);
		// long tdiff = Duration.between(before, after).toMillis();
		// System.out.println("Timer(ms): " + tdiff);
	}
}
