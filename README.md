# Java GUI Tests and Tutorials
---
## Contents

### GUI Tutorial
Contains various classes with simple GUI implementations for this like:
- Text entry
- Event Listening
- Event handling
- Mouse catching

---
## Building

### GUI Tutorial

#### IDE
Implemented through Eclipse platform but can be easily imported in other IDEs like Netbeans.
In that case build and run can be done through the IDE itself.

#### Console
The `Makefile` can be found in `JavaGUI/GUI-Tutorial/`. Source files will be under the `src` directory, and binaries under the `bin` directory.
The default `make` command will build all the `.class` files.
The other available commands are:
- `make runAcc` which will run the Accumulator GUI.
- `make runCou` which will run the Counter GUI.
- `make runMou` which will run the MouseMotion GUI.
- `make runTex` which will run the TextInput GUI.
- `make clean` which will clean the build files.