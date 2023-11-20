# Readme
Bei diesem Repository handelt es sich, um ein Spielzeugprojekt, das zum Beispiel für eine Bewerberaufgabe genutzt 
werden kann. Nachfolgend ist eine kurze fachliche, fiktive Aufgabenstellung.

## Christmas Coupons Aufgabe
Um unseren treuen Kunden, in der Vorweihnachtszeit Boni zu bieten wollen wir einen Service schreiben, der 
weihnachtliche Coupons ausliefert. Ein Coupon bietet einen festen Rabatt (ganzzahlig, in Euros), der einmalig 
aktiviert werden. Jeder Coupon hat zusätzlich ein Datum, ab dem er gültig ist (damit man einen 
Adventskalender umsetzen kann).

Unser Service soll über eine REST Schnittstelle die Möglichkeit bieten alle aktivierbaren und gültigen Coupons 
auszuliefern, sowie einen gegebenen Coupon (einmalig) zu aktivieren. Damit der Kunde sehen kann wie viel Guthaben er 
für seinen nächsten Einkauf aktiviert hat, soll der Service außerdem die Rabattsumme aller aktivierten Coupons 
ausspielen.

### Falls noch Zeit ist
- Coupons sollen nach Weihnachten nicht mehr aktivierbar sein
- Die Anwendung soll als Docker Image gebaut werden

### Technische Hinweise
- Eine H2 Datenbank ist bereits vorhanden, JPA ist einsatzbereit
- JUnit ist vorhanden - ein Beispiel für einen Integrationstest findest im test Ordner (natürlich kannst du auch ein anderes Testsetup benutzen)
- Googeln ist erlaubt und gewünscht, Copilot und ChatGPT nicht