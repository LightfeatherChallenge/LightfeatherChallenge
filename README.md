# LightfeatherChallenge

System Requirements: java 8

# Instructions
1. Download zip using: Clone or download -> Download ZIP
2. Extract zip file contents
3. Using a command prompt, navigate to [LightfeatherChallenge Folder]\src
4. Compile program `javac io\lightfeather\Application.java`
5. Execute program by passing in a list of numbers followed by the desired sort order (desc or asc) 

# Examples
Execution command
`java io.lightfeather.Application 1 4 2 asc`

Execution output
```
***** Simple Sort *****
1 2 4
***** Sorted Frequency *****
1 appears 1 times
2 appears 1 times
4 appears 1 times
***** Number of unique values *****
Total number of unique values: 3

Application complete
```

Execution command
`java io.lightfeather.Application 1 4 2 desc`

Execution output
```
***** Simple Sort *****
4 2 1
***** Sorted Frequency *****
1 appears 1 times
2 appears 1 times
4 appears 1 times
***** Number of unique values *****
Total number of unique values: 3

Application complete
```

Execution command
`java io.lightfeather.Application 34 74 0 9 3 5 3 11 7 asc`

Execution output
```
***** Simple Sort *****
0 3 3 5 7 9 11 34 74
***** Sorted Frequency *****
0 appears 1 times
3 appears 2 times
5 appears 1 times
7 appears 1 times
9 appears 1 times
11 appears 1 times
34 appears 1 times
74 appears 1 times
***** Number of unique values *****
Total number of unique values: 8

Application complete
```
