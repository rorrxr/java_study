package ez0221.java.exam15;

import java.util.ArrayList;
import java.util.List;

public class ExLanguage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Language> arrayList = new ArrayList<Language>();
		List<Language> list = new ArrayList<Language>();
		
		List<String> listStrings = new ArrayList<String>();
		
		//listString.set(0, null);
		//listString.set(1, 1);
		//listString.set(2, "Tony");
		//listString.set("Tony");

		listStrings.add("Stark");
		listStrings.add("Tony");


		for(int i = 0; i < listStrings.size(); i++) {
			System.out.println(listStrings.get(i));
		}
		
		System.out.println("====");
		
		List<Language> languages = new ArrayList<Language>();
		
		Language language1 = new Language();
		Language language2 = new Language("KO", 1);
		
		languages.add(language1);
		languages.add(language2);
		languages.add(new Language("EN", 2));

		for(Language language:languages) {
			System.out.println(language.getName() + " | " + language.getVersion());
		}

	}
}
