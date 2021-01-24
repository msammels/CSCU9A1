### CSCU9A1

The code within this repository is designed and developed in line with the
practicals for the first year course at the University of Stirling.

## Prerequisites
You need to have the following installed:

- The Java SDK
  - This can be either Oracle or OpenJDK of at least version 8.0
- A suitable IDE
  - The files in this repository where created using
  [IntelliJ IDEA Ultimate](https://www.jetbrains.com/idea/), but any suitable
  editor will work.

## Compiling
As stated earlier, the code was created using my favourite editor, but I have
removed all of the files that the editor generated, leaving just the base
files.

The code here does not use any external libraries such as JUnit, nor does it
require Maven or Gradle to run, so you can use your favourite editor without
issue to run the code.

## Folder Layout
You will notice that this does not use the standard folder structure, as
normally found:

    /src/com/msammels/project/main/src/File.Java
    /src/com/msammels/project/test/src/File.java

But instead uses the following folder structure:

    /project/File.Java

The reason for this is because during the first year at University, we were
not expected to known the complete understanding of how a project was laid
out, but more exactly how the code functioned and to make things work
properly.

You should be able to move things into whatever folder structure you feel
most appropriate and things should still work OK. If you are using the same
editor as myself you will need to make sure that each folder is located
within it's own module (so to avoid conflicts) or make each one a separate
project. I cannot comment on other editors.

```
Michael Sammels
```
