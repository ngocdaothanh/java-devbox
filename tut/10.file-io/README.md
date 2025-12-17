# File IO in Java

## Text encoding

### Binary file

A binary file is a series of bytes (a series of bits, 0/1).
=> A series of numbers from 0 to 255 (unsigned).

### Text file

A character set (charset, text encoding) is a table of mappings,
from a number to a character in the language,
and vice versa;
that means it's 1:1 mapping.
=> A charset is for mapping a binary file into a text file, and vice versa.

Most 2 popular charsets:
- ASCII
- Unicode; UTF-8 variation (an extension of ASCII)

A text file is a binary file with a certain text encoding.
The most popular text encoding in 2025 is UTF-8 (an extension of ASCII text encoding).

When you save a text file in a text editor (like Visual Studio Code),
by default the text file will be saved in UTF-8 encoding.

## Reading files

### Reading a binary file

Way 1 (good for small files):
- Load all bytes of the file into memory.

Way 2 (good for big files):
- Load the file as a stream of bytes.

### Reading a text file

Way 1 (good for small files):
- Load the whole file as binary bytes.
- Convert the bytes to a string.
- Print the string to console.

Way 2 (good for small files):
- Load the whole file as lines.
- Loop through each line and print the line to console.

Way 3 (good for big files):
- Load the file as a stream of lines; the lines are not actually loaded yet.
- Load each line and print to console; the line is actually loaded at this time.

## Writing files

### Writing a binary file


### Writing a text file
