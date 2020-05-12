#!/bin/sh

rm ./.classes/app/sort/*.class
rmdir ./.classes/app/sort
rm ./.classes/app/*.class
rmdir ./.classes/app

javac  -d ./.classes ./app/Main.java

input() {
	echo Sort type...
	echo Shaker    : 0
	echo Bubble    : 1
	echo Quick     : 2
	echo Insertion : 3

	read sort

	echo UP -\> 0 or DOWN -\> 1 :
	read upORdown

	echo Max Range :
	read range

	echo Array Size :
	read size
}

execute() {

	input

	cd ./.classes
	java app.Main $sort $upORdown $range $size
	cd ..
}

execute

#rm ./.classes/app/*.class
#rmdir ./.classes/app
#rm ./.classes/app/sort/*.class
#rmdir ./.classes/app/sort
