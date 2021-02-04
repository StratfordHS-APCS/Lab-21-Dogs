# Lab 18 - Sum Around

**Lab Goal:**   
This lab was designed to give you practice using a 2D Array.

**Lab Description:**   
Load in the provided matrix and then sum up all of the cells around the provided cell locations. Include the value of the provided location as well as all of the cells within 1 cell of the provided cell.
```
1, 2, 3, 4, 5
6, 7, 8, 9, 0
6, 7, 1, 2, 5
6, 7, 8, 9, 0
5, 4, 3, 2, 1
```

**Examples:**  
The sum of 0,0 is 16.  
The sum of 1,1 is 41.

**Note:**  
An approach to handling the edges and corners is to make a new array that consists of this array with zeros all around it. Let's *not* do that. In the interest of learning the things AP could be testing I want you to learn how to handle boundary conditions like the edges and corners.

**Testing**

For manually running the tests:

1. Ctrl-Shift-S
2. `mvn test`
