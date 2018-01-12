package voorbeelden;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Opdracht7 {

	public static void main(String[] args) {
		ZonedDateTime nowBrussels = ZonedDateTime.now();

		ZoneId LondonZone = ZoneId.of("Europe/London");
		ZonedDateTime nowLondon = ZonedDateTime.now(LondonZone);
		ZoneId SydneyZone = ZoneId.of("Australia/Sydney");
		ZonedDateTime nowSydney = ZonedDateTime.now(SydneyZone);
		ZoneId AngelesZone = ZoneId.of("America/Los_Angeles");
		ZonedDateTime nowAngeles = ZonedDateTime.now(AngelesZone);
		
		System.out.println(nowLondon);
		System.out.println(nowSydney);
		System.out.println(nowAngeles);
	}

}
