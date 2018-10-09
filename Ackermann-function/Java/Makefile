
all: Ackermann.class TestAckermann.class Main.class

Ackermann.class: 
	javac Ackermann.java
	
TestAckermann.class: Ackermann.class
	javac TestAckermann.java
	
Main.class: TestAckermann.class
	javac Main.java
