JAVAC=javac

JCLASSPATH=.
JFLAGS=-classpath $(JCLASSPATH)

sources = $(wildcard *.java)
classes = $(sources:.java=.class)

all: $(classes)

run: $(classes)
	java $(JFLAGS) Main

clean:
	rm -f *.class

%.class : %.java
	$(JAVAC) $(JFLAGS) $<