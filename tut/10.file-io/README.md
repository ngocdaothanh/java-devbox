# File IO in Java

## Reading a text file

Way 1 (good for small files):
- Load the whole file as lines.
- Loop through each line and print the line to console.

Way 2 (good for small files):
- Load the whole file as binary bytes.
- Convert the bytes to a string.
- Print the string to console.

Way 3 (good for big files):
- Load the file as a stream of lines; the lines are not actually loaded yet.
- Load each line and print to console; the line is actually loaded at this time.

## Writing a text file


## Reading a binary file

## Writing a binary file
