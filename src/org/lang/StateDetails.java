package org.lang;

public class StateDetails {
public void southIndia() {
System.out.println("southern india");
}
public void northIndia() {
System.out.println("northern india");
}
public static void main(String[] args) {
	LanguageInfo a = new LanguageInfo();
			a.egnlishLanguage();
	a.hindiLanguage();
	a.tamilLanguage();
	StateDetails b = new StateDetails();
	b.southIndia();
	b.northIndia();
}
}
