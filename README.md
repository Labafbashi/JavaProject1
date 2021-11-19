# JavaProject1
# Sortering

Syfte
Syftet med den här uppgiften är att lära oss att självständigt skapa program i Java. Vi ska lära oss grundläggande syntax och ta in program argument, samt att skriva tester. Ni ska också få färdighet i att använda Git för att versionshantering av ert projekt.

# Uppgift
I den här uppgiften ska ni skriva en sorteringsmetod "sort" som tar en lista av tal (int) och sorterar dom. Listan ges som argument till programmet vid körning. Sedan ska denna argumentlista konverteras från String[] till int[] i SortMain.main metoden. Därefter ges till den konverterade listan till Sorter.sort metoden som sorterar listan och returnerar den till SortMain.main som i sin tur printar ut den till terminalen.

$ java SortMain 76 11 -55 2 16 -21 7 88

=> -55 -21 2 7 11 16 76 88

# Programmer Note:

Please follow below steps:

1- Create new Java project in Intellij.

2- in the VCS menu click on "Enable Version Control Integration".

	2-1 select git from dropdown list and then press OK.
  
3- Instead of the VCS menu you have the Git menu. click on Git menu and select Clone.

4- add the address "https://github.com/Labafbashi/JavaProject1.git" in the URL textbox.

5- Press clone buttomn.


This application is include three files:

1- Sorter : This file is a class of sort, that you can create an object from this class, and using method toSort() for get a lsit of sorted array.

2- SorterTest : This file using the Junit for test the class Sorter.

3- SortMain : This file is the main class of project, that control arguments, help, version, and user entry control.


for using this application please follow below steps:

1- From "Run" menu, select and click on "Edit Configurations...".

2- At the left side of window, please select "SortMain".

3- press Alt+J or click on "Program Arguments" text box.

4- type your argument, for example for sort the list:

	76 11 -55 2 16 -21 7 88
  
	or for get help:
  
	-h
  
	or for get version of application:
  
	-v
  
5- Press OK buttomn.

6- From "Run" menu, select and click on "Run SortMain" or press Shift+F10 to Debug and execute the application with your arguments.



