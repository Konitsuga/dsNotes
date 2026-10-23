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
- cat version [prints the linux version]
- df -h [better than cat version]
- uname -a [linux kernel version and architecture]
- lsb_release -a [linux version and codename] 
- ln file1 file3 [hardlink from file1 to file3]
- ln -s file2 file4 [softlink from file2 to file4]
- /sys/bus/usb/devices [usb devices connected to the system]
- free [memory usage/availability]
   
---
- command1; command2; [Each command will be executed one after other]
- command1 && command2 [command2 executes after command1 is successful]
- command1 || command2 [command2 will be executed iff command1 fails]
- command1 > file1 [overwrites(or creates) file1 by command1.]
- cat > file1 [overwrites( or creates) file1. Come out using [ctrl + D].]
- cat >> file1 [appends (or creates) file1]
- cat file1 [prints file1 in the terminal]
- date blah > file1 
- hwinfo [info of the hardware]
- ls -1 directory1 [print the names of the file/directory line by line]
- diff file1 file2 [difference bw file1 and file2 line by  line]
- apt-cache search word1 [searches word1 in all the packages' title and description]
- apt-cache pkgnames [lists all the packages that system knows about]
- apt-cache pkgnames | sort [displays packages in sorted order]
- apt-cache pkgnames nm [displays packages starting with "nm"]
- apt-cache show nmap [details of the nmap package]
- md5sum file1 [128bit code that is unique for the file, to ensure that file content in unchanged.]
- sha1sum file1 [>128bit code]
- sha256sum file1 [256bit code]

# File Types
- -- = Regular File # only single hyphen(-)
- d = Regular Directory
- l = Symbolic Link
- c = Character File (the terminal)
- b = Block file (the Hardisk)
- s = Socket File (for two way communication bw two devices on a network)
- p = Named Pipe [read only data, unsendable data]

# File Descriptors
|code| name| feature|
|--|--|--|
|0| stdin|standard input (from keyboard)|
|1| stdout| standard output (inside system)|
|2|stderr| standard error (on the screen)|
---
- cat > file1 [write in file1 using input from keyboard]
- cat blah 2> file1 [write the error directly in file1]
- date blah > file1 2> file2 [write the date in file1, write the error in file2.]
- ls ./ blah > file1 2>&1 [list the content names inside the current directory into file1 and also write the error becuase of the "blah" in the same file1. "2>>" instead of "2>&" does not work.]
- command1 | command2 [command1 as an input of command2]
- ls directory1 | less [read the contentnames of directory1]
- command1 | tee -a file1 [append in file 1 and also print on the screen]
- command > file1 >2 /dev/null [send the error to the blackhole]

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
    - 3 - (-wx)
    - 2 - (-w-)
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

# Line Editor - ed
- `Buffer` means all the lines that are already in the file and the lines that are appended in the editor but not written in the file yet.
$$$$
| Feature | Command|
| :--- | :--- |
| Show the Prompt | P |
| Command Format | `[addr[,addr]]cmd[params]` |
| commands for location | `2 . $ % + - , ; /RE/` |
| name of the file| `f`
| exit the input prompt | `.` |
| current line| `.`|
| previous line| `-`|
| next line| `+`|
| last line| `$`|
| print the buffer | `%p`|
| current line to end line of buffer | `;p` |
| commands for editing | `f p a c d i j s m u` |
| *exectute a shell command* | `!command` |
| print date|  `!date`
| temporarily save date line in terminal(buffer)| `r !date` |
| write the buffer into file| `w` |
| edit a file | `e filename` |
| read file contents into buffer | `r filename` |
| read *command* output into buffer | `r !command` |
| write buffer to filename | `w filename` |
| mover the current line to 0th line | `m0`|
| undo the changes| `u`|
| delete the current line | `d`|
| quit | `q` |

# Editor - Vim 
- vimtutor [vim manual]
- u [undo changes]
- dd [delete/cut current line]
- nx [delete n characters including under the cursor]
- x [delete character under the cursor]
- dw [delete the word under the cursor if cursor is under the first char, otherwise delete the remaining character. ]
- yy [copy the current line]
- nyy [copy the next n lines including the current line]
- r [char] [replace char under the cursor with new char]
- :se nu [shows line numbering]
- :1,5s/line/LINE/ [substitute the first word "line" in each of the lines from 1 to 5]
- :1,5s/line/LINE/g [all the words "line" from 1 to 5]
- :%s/line/LINE/g [Replace everywhere]
- :%s/word1//g [delete all the word1 from the file]
- p [paste the copied/cut line]
- ctrl + f [scroll forward one screen]
- ctrl + b [scroll backward one screen]
- 0 [start of the current line]
- $ [end of the current line]
- nw [nth after word after the current word]
- w [beggining of next word]
- b [beggining of preceding word]
- :0 [first line in the file]
- :$ [last line in the file]
- :x [save the file and exit]
- :! command1 [run shell command1]
- :q! [exit without saving]

# Some important ports 
| Port | Service | Description | 
|---|---|---| 
| 21 | ftp | File transfer |
| 22 | ssh | Secure Shell | 
| 25 | smtp | Simple Mail Transfer Protocol | 
| 80 | http |Hypertext Tranfer Protocol | 
| 443 | https | Secure Hypertext Tranfer Protocol | 
| 631 | cups |Common Unix Printing System | 
| 3306 | mysql | MySQL database |

|Tool| Feature|
|--|--|
|ping|	Connectivity & Latency check|	Network Layer (ICMP)|	Host reachability and round-trip time (RTT)|
|traceroute|Each router hop along the path to a destination.
|nslookup|Simple Domain-to-IP or IP-to-Domain mapping.
|dig|Detailed DNS record data (A, MX, TXT, TTL, DNSSEC).
|whois|Domain ownership, registrar, creation, and expiration dates.
|ifconfig|Assigned IP addresses, MAC addresses, network interfaces, and status.
|netstat|Active network connections, listening ports, and routing tables.
|wireshark|Live raw network traffic and individual packet contents.
|wget|Download a file/website from the internet
**----------**
# What?
## What the hell is Symbolic Link and Hard Link?
    Something

## What is /dev/null file in the system?
    /dev/null is a file that acts as a black hole for the device. 
    Any input given inside this file is lost.

## What does this `bash -c "echo \$-"` do?
    Something

-------------------------
For Packages
-   Filename: package_version-revision_architecture.deb
-   Filename: pool/universe/n/nmap/nmap_7.91+dfsg1+really7.80+dfsg1-2ubuntu0.1_amd64.deb

Package priorities   
- required : essential to proper functioning of the system  
- important : provides functionality that enables the system to run well   
- standard : included in a standard system installation   
- optional : can omit if you do not have enough storage   
- extra : could conflict with packages with higher priority, has specialized requirements, install only if needed   

- sudo cat /etc/sudoers [seeing who has administrative privileges, can only be seen by superusers]
- /etc/apt [advance package tool directory- manages packages]
- authentication success/failure are logged in /var/log/auth.log file
- /etc/apt/sources.list contains locations from which debian packages are installed into system
- /etc/apt/sources.list.d 
- sudo apt-get install package1 [installs package1]
- sudo apt-get update [print the lists of packages that need to be updated]
- sudo apt-get upgrade [installs(updates) the packages from the above list]
- sudo apt autoremove [removes the packages that were came with the older version of packages but are no longer needed in the newer version ]
- sudo apt-get remove fortune [removes the package "fortune"]
- sudo apt-get reinstall package1 [reinstalls package1, used when package1 has some problem, or to install the newer version of package1]
- tail -n 100 auth.log [prints last 100 logs]
- /var/lib/dpkg manages deb packages installed from internet
- dpkg -l pattern1 [List all packages whose names match pattern1]
- dpkg -L package1 [List installed files that came from package1]
- dpkg -s package1 [Report the status and description about what package1 does; same as `apt-cache show`]
- dpkg -S pattern1 [which package brought a particular file]
- man dpkg -query
- dpkg-query -W -f='${Section} ${binary:Package}\n' | less [list packages in the format: sectionName packageName]

- ps --forest [prints running processes in parent-child form]
- sleep 30 [pause the terminal for 30 seconds]
- help coproc [To learn more about any shell feature, here coproc]
- coproc sleep 30 [`sleep 30` runs in the background]
- sleep 30& [similar to `coproc sleep 30`]
- fg [makes the background process onto foreground ]
- kill -9 49 [kill the process having PID=49]
- ctrl+c [kills the foreground process]
- ctrl+z [suspend(not kill) or background the current process. Can be put again using `fg`]
- type command1 [prints if it is /user/bin/command1 or a shell builtin]
- echo $$ [tells the PID of the current shell]
- history [commands used in the last few days with its serial_number]
- !serial_number1 [executes the command associated with the serial_number]
- echo $? [returns "0" if the last command was executed successfully otherwise 1-255. Returns exit/status code]
- ps [processes owned by the current user running inside the current shell/terminal]
- ps --forest [sames as `ps` but in parent-child format]
- ps -e [system-wide processes]
- exit integer1 [sets exit/status code to (integer1%256)]
- bc [bench calculator: terminal's calculator]
