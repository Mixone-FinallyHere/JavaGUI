# LINUX Path
PAT = ./src/mixone/gui/tutorial/
BPATH = ./bin/mixone/gui/tutorial/

# WINDOWS Path
#PAT = src\mixone\gui\tutorial\
#BPATH = bin\mixone\gui\tutorial\

PACKAGE = mixone.gui.tutorial
JFLAGS = -g -d bin
JC = javac
JVM= java -cp bin


CLASSES = \
    $(PAT)Accumulator.java \
    $(PAT)Counter.java \
    $(PAT)MouseMotion.java \
    $(PAT)TextInput.java
    
ACC = $(PACKAGE).Accumulator

COU = $(PACKAGE).Counter

MOU = $(PACKAGE).MouseMotion

TEX = $(PACKAGE).TextInput

default: all

.SUFFIXES: .java .class

.java.class:
	$(JC) $(JFLAGS) $*.java

all:  $(CLASSES:.java=.class)

runAcc: all
	$(JVM) $(ACC)

runCou: all
	$(JVM) $(COU)
	
runMou: all
	$(JVM) $(MOU)

runTex: all
	$(JVM) $(TEX)

clean:
	$(RM) $(BPATH)*.class