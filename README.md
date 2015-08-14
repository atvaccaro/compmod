# compmod
A compilation of the work done by students at the UTD Minecraft Mod development camps. This repo will serve as a space to show off your mods, collaborate on code and resources (such as textures), and learn more advanced modding collaboratively. Feel free to add your name and GitHub username to the bottom of this README (follow the Markdown syntax for lists).

## Setup instructions
1. Download Forge Src 1.7.10, build 10.13.4.1448 if possible
1. Extract the .zip to somewhere convenient (eg. Desktop)
1. Run 'gradlew setupDecompWorkspace --refresh-dependencies' and 'gradlew idea' from the command line
1. DELETE THE 'src' FOLDER!
1. Right-click on desktop and choose 'Open Git bash here'
1. Run 'git clone https://github.com/atvaccaro/compmod.git'
1. Copy the remaining files/folders from the forge folder into the new 'compmod' folder (you can delete the now-empty forge folder)
1. Open IntelliJ, run the game, and it should work

## General rules and guidelines
1. Static variable declarations and registrations go into CompMod.java
1. Put your own code into a package named after you (eg. my code would go in utd.cso.compmod.atvaccaro)
1. Don't make a commit until you are sure that your additions are stable (eg. no crashes)
1. Do not add anything that is balance-breaking (eg. no ridiculously high damage values)
1. Do not remove others' contributions unless you can demonstrate that those contributions are not stable/cause crashes
1. Feel free to add suggestions as Issues, but they must be descriptive
1. Follow standard naming conventions (see below)

## Naming conventions
1. The type of class should go at the beginning of the name (eg. ItemMySword rather than just MySword)
2. Class names should be reasonably short and descriptive
3. Keep names appropriate and tasteful or your code will be removed and your push permissions revoked

## Contributors
* Andrew Vaccaro (atvaccaro) - Instructor
