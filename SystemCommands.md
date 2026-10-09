# Commands
1. home directory = [cd ~], [cd]
2. parent directory = [cd ..]
3. present working directory = [pwd]
4) previous directory = [cd -]
5) list = [ls]
- list all = [ls -a]
- list long form = [ls -l]
- current time stamp = [date]
- specific calendar month = [cal Aug 1947]
- calendar in different orientation = [ncal]
- memory = [free]
- memory in human readable = [free -h]
- cp file1 file2 = creates file2(or overwrites) and copies file1 into it
- mv file2 file2a = rename(or overwrite) file2 into file2a
- mv file2 "file two" = rename(or overwrite) file2 into 'file two'
- rm file1 = removes file1
- rm -i file1 [prompt for remov  al of file1]
- alias rm="rm -i" [change the command rm to (rm -i)]
- alias [list of all aliases]
- unalias command1 [removes command mapped to command1]
- whoami [the name of the current user]
- file file1 [type of the file]
- touch file1 [updates the file to the latest  timestamp]
- less file1 [read file1 page by page]
- cat file1 [print the content of file1 in terminal screen]
- head -n 5 file1 [print the first 5 lines of file1]
- tail file1 [print the last 10  lines of file1]
- ls -ld directory1 [list long form of directory1]
- wc file1 [no.of lines, words, bytes in file1]
- which command1 [locates the command1 in the system]
- whatis command1 [describes command1 in a line, i.e. the first line of man page of that command]
- apropos who [searches for word who across the man page]
- man command1 [concise manual page for command1]
- info [index of  different commands]
- info command1 [indepth info about command1]
- stat file1 [information about file1 including filesize]
- du -h file1 [size of file1 in human readable]
- cat meminfo [prints info about the memory in terminal when in /proc directory]
- cat partitions [prints the partitions? in hardisk when in /proc directory]
- cat version [prints the linux version when in /proc directory]
- df -h [better than cat version]
- uname -a [similar to cat version]
- ln file1 file3 [hardlink from file1 to file3]
- ln -s file2 file4 [softlink from file2 to file4]
- /sys/bus/usb/devices [usb devices connected to the system]
- free [memory usage/availability]
# File Types
- -- = Regular File # only single hyphen(-)
- d = Regular Directory
- l = Symbolic Link
- c = Character File (the terminal)
- b = Block file (the Hardisk)
- s = Socket File (for two way communication bw two devices on a network)
- p = Named Pipe [read only data, unsendable data]
# Permission String
-
    - read r
    - write w
    - executable x
$$$$
-
    - First three characters = Owner Permissions
    - The next three characters = Group Permissions
    - The last three characters = Other Permissions
$$$$
-
    - 7 - (rwx)
    - 6 - (rw-)
    - 5 - (r-x)
    - 4 - (r--)
    - 1 - (--x)
$$$$
-
    - chmod u-x filename [remove executable permission from user]
    - chmod u+x filename [give executable permission to user]
    - chmod g+r filename [give reading permission to group]
    - chmod o-w filename [remove writing permission from others]
$$$$
-
    - chmod 700 filename [give permission 7 to user and 0 to group and 0 to other]
# What?
    What the hell is Symbolic Link and Hard Link?