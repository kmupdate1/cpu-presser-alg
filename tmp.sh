#!/bin/sh

if test -e .classes; then
	rm ./.classes/app/sort/*.class
	rmdir ./.classes/app/sort
	rm ./.classes/app/*.class
	rmdir ./.classes/app
fi

if test -e Result.txt; then
	rm Result.txt
fi

javac  -d ./.classes ./app/Main.java

input() {
	echo Sort type...
	echo Shaker    : 0
	echo Bubble    : 1 \(Unavailable\)
	echo Quick     : 2 \(Unavailable\)
	echo Insertion : 3 \(Unavailable\)

	read sort

	echo UP -\> 0
	echo DOWN -\> 1 :
	read upORdown

	echo Max Range :
	read range

	echo Array Size :
	read size
}

execute() {

	input

	cd ./.classes
	
	echo "***** ソートを開始します. *****"
	java app.Main $sort $upORdown $range $size >> ../Result.txt
	
	echo 実行結果を'Result.txt'に保存しました．
}

execute
