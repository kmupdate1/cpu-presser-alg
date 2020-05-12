#!/bin/sh

mkdir ./.classes

javac  -d ./.classes ./app/Main.java >> compiled.txt

IS_ERROR="abc"

input() {
	echo Sort type...
	echo Shaker : 0
#	echo Bubble : 1
#	echo Quick  : 2
#	echo Insert : 3

	read sort

	echo UP or DOWN :
	read upORdown

	echo Max Range :
	read range

	echo Array Size :
	read size
}

execute() {

	input

	java ./.classes/app.Main $sort $range $size >> Result.txt

	RESULT = $(cat Result.txt)

	if [[ $RESULT == "数値ではありません。" ]]; then
		input
	fi
}

if [[ -n "$IS_ERROR" ]]; then
	#compile error
	cat compiled.txt
else
	execute
fi

rm ./.classes/app/*.class
rm ./.classes/app
rm ./.classes/app/sort/*.class
rm ./.classes/app/sort
