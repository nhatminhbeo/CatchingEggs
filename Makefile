.SUFFIXES: .java .class

Default: Main.class

.java.class:

	javac $<

Main.class: Eggs.class GoldenEggs.class Lucky.class MainComponent.class MainFrame.class

	javac Main.java
	echo 'java Main &&*' > Main
	chmod ug+rx Main

clean:

	rm -rf *.class Main
