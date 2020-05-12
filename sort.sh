#!/bin/sh

javac  -d ./classes ./app/Main.java >> compiled.txt

IS_ERROR = $(cat compiled.txt | grep error)

if [[ -n "$IS_ERROR" ]]; then
	cat compiled.txt
else
	execute
fi

function execute() {

	input

	RESULT = $(java ./classes/Main $range $size)

	if [[ $RESULT == "数値ではありません。" ]]; then
		input
	fi
}

function input() {
	echo Range :
	read range

	echo Size :
	read size
}

# rm ./classes/*.class
