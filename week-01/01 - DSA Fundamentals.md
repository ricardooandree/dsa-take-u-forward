### Programming Languages Fundaments
##### User Input/Output
In Java we have two classes for I/O operations, Scanner and BufferedReader (better for complex input scenarios and large volumes of data).
```java
import java.util.Scanner;    // import all java.util.*;

public class Main {
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);

		while (scanner.hasNextLine()){
			String name = scanner.nextLine();
			int height = scanner.nextInt();    // Throws InputMismatchException
			String word = scanner.next();
			String[] parts = line.split(" ");

			int number = Integer.parseInt(parts[0]);
			String word = parts[2];
		}
		scanner.close();
	}
}
```

##### If-Else Statements
##### Switch Statements
##### Arrays and Strings

##### For and While Loops

##### Functions (Reference/Value Arguments)

##### Time Complexity

### Logical Thinking - Patterns
Being able to analyse problems and notice common patterns is very important in DSA. Mastering these patterns allows us to be able to approach other problems easily.

##### 4 Rules for solving patterns
1. For the outer loop, count the number of rows.
2. For the inner loop, focus on the columns and somehow connect them to the rows.
3. Whatever you're printing, print it inside the inner loop.
4. Observe symmetry in some patterns (optional).

##### Exercises - Important Takeaways
<u>Square 1</u> - The number of columns is the same as of rows.
```java
for (int i = 0; i < rows; i++){
	for (int j = 0; j < rows; j++) { System.out.Print("*"); }
}
```

<u>Right-Angled Triangle 2</u> - Per line is printed stars x lines => The number of columns is the same as rows.
```java
for (int i = 0; i < rows; i++){
	for (int j = 0; j <= i; j++) { System.out.Print("*"); }
}
```

<u>Pattern 3</u> - Right-Angled Triangle for each row print the column numbers (j+1).

<u>Pattern 4</u> - Right-Angled Triangle for each row we print the row number (i+1).

<u>Inverted Right-Angled Triangle 5</u> - The number of stars per line is the number of total rows - the current row - 1 (reverse direction of rows => from 4 to 0 instead of 0 to 4).
```java
for (int i = 0; i < rows; i++){
	for (int j = 0; j < rows - i - 1; j++) { System.out.Print("*"); }
}

for (int i = rows; i >= 1; i--){ 
	for (int j = 1; j <= i; j++) { System.out.print("*"); }
}
```

<u>Pattern 6</u> - For each row print the column numbers (j+1).

<u>Pattern 7</u> - Odd rows start with 1 while even rows start with 0, on top of that it alternates the printed value between 0 and 1.
```java
int n;
for (int i = 0; i < rows; i++){
	if ((i + 1) % 2 == 0){ n = 1; }
	else { n = 0; }

	for (int j = 0; j < rows; j++){
		n = n - 1;    // alternates between 0 and 1
		System.out.print(n);
	}
	System.out.println();
}
```


<u>Pattern 8</u> - Right-Angled Triangle with letters.

<u>Pattern 9</u> - Inverted Right-Angled Triangle with letters.

<u>Pattern 10</u> - Right-Angled Triangle with equal letters per row.

<u>Pattern 11</u> - Pyramid with letters (symmetry).
```java
for (int i = 0; i < rows; i++){
	for (int j = 0; j < rows - i - 1; j++){ System.out.print(" "); }
	for (int j = 0; j < i + 1; j++){ System.out.print((char)('A' + j)); }
	for (int j =  i; j > 0; j--){ System.out.print((char)('A' + j - 1)); }
	for (int j = 0; j < rows - i - 1; j++){ System.out.print(" "); }
}
```

<u>Pattern 12</u> - Right-Angled Triangle with letters that get pushed to the right.
```java
for (int i = 0; i < rows; i++){
	for (int j = 0; j < rows - i - 1; j++){ System.out.print((char)('A' - rows - 1 - i + j)); }
}
```

<u>Pyramid 13</u> - For each row we print (spaces, stars, spaces). Relation between columns and rows as rows progress:
- Left spaces: 4, 3, 2, 1, 0 => rows-i-1.
- Stars: 1, 3, 5, 7, 9 => 2xi+1.
- Right spaces: 4, 3, 2, 1, 0 => rows-i-1.
```java
for (int i = 0; i < rows; i++){
	for (int j = 0; j < rows - i - 1; j++){ System.out.Print(" "); }
	for (int j = 0; j < 2 * i + 1; j++){ System.out.Print("*"); }
	for (int j = 0; j < rows - i - 1; j++){ System.out.Print(" "); }
}

for (int i = 0; i < rows; i++){
	for (int j = rows - i; j > 0; j--){ System.out.Print(" "); }
	for (int j = 0; j < 2 * i + 1; j++){ System.out.Print("*"); }
	for (int j = rows - i; j > 0; j--){ System.out.Print(" "); }
}
```

<u>Inverted Pyramid 14</u> - Relation between columns and rows as rows progress:
- Left spaces: 0, 1, 2, 3, 4 => i.
- Stars: 9, 7, 5, 3, 1 => 2x(rows-i)-1 or 2xrows - (2xi+1).
- Right spaces: 0, 1, 2, 3, 4  => i.
```java
for (int i = 0; i < rows; i++){
	for (int j = 0; j < i; j++){ System.out.Print(" "); }
	for (int j = 0; j < 2 * (rows - i) - 1; j++){ System.out.Print("*"); }
	for (int j = 0; j < i; j++){ System.out.Print(" "); }
}

for (int i = rows - 1; i > 0; i--){
	for (int j = rows - i; j > 0; j--){ System.out.Print(" "); }
	for (int j = 0; j < 2 * i + 1; j++){ System.out.Print("*"); }
	for (int j = rows - i; j > 0; j--){ System.out.Print(" "); }
}
```

<u>Pattern 15</u> - Similar to the Pyramid but we have number, space, number.
- Right numbers: 1, 2, 3, 4 => j+1
- Right numbers: 6, 4, 2, 0 => rows x 2 - 2
- Left numbers: 1, 2, 3, 4 (reversed) => start on j=i+1
```java
for (int i = 0; i < rows; i++){
	for (int j = 0; j < i + 1; j++){ System.out.print(j + 1); }
	for (int j = 0; j < 2*(rows - i - 1); j++){ System.out.print(" "); }
	for (int j = i + 1; j > 0; j--){ System.out.print(j + 1); }
}
```

<u>Floyd's Triangle 16</u> - Right-Angled Triangle with increasing numbers.
```java
int n = 1;
for (int i = 0; i < rows; i++){
	for (int j = 0; j < i + 1; j++){ System.out.print(n); n++; }
}
```

<u>Pattern 17</u> - Seems like a combination of Right-Angled Triangle and Inverted Right-Angled Triangle but it is not quite due to the middle road. 
```java
for (int i = 0; i < rows; i++){
	for (int j = 0; j < i; j++){ System.out.Print("*"); }
}

for (int i = 1; i > 0; i++){    // i starts on 1 to skip the first line
	for (int j = 0; j < rows - i; j++){ System.out.Print("*"); }
}
```

<u>Diamond 18</u> - Combination of a Pyramid and an Inverted Pyramid.

<u>Pattern 19</u> - Check for symmetry rows = 5.

![[Algorithm Patterns| 1000 | center]]

### Java Collections
Java supports a wide variety of data structures and the base class for that is **Collection**.
An "extra" common Collection method is <u>toArray()</u> - Converts the collection to an array.
##### Lists
Allows duplicates and preserves insertion order (ArrayList, LinkedList).
```java
List<Integer> arrayList = new ArrayList<>();  // Resizable array, faster for random access

List<String> linkedList = new LinkedList<>();  // Faster insertions and deletions at the beginning or end
```

| Methods                     | Description                                                                                           |
| --------------------------- | ----------------------------------------------------------------------------------------------------- |
| add(element)                | Adds an element at the end of the list.                                                               |
| add(index, element)         | Adds an element at a specific position.                                                               |
| get(index)                  | Returns the element at the specified index.                                                           |
| remove(index)               | Removes the element at the specified index.                                                           |
| indexOf(element)            | Returns the first index of the specified element, or `-1` if not found.                               |
| lastIndexOf(element)        | Returns the last index of the specified element.                                                      |
| subList(fromIndex, toIndex) | Returns a view of the portion of this list between `fromIndex` (inclusive) and `toIndex` (exclusive). |
| set(index, element)         | Replaces the element at the specified index.                                                          |

##### Sets
Does not allow duplicates (HashSet, LinkedHashSet, TreeSeet).
```java
Set<Integer> hashSet = new HashSet<>();    // Does not maintain any order

// LinkedHashSet: Maintains insertion order
// TreeSet: Maintains sorted order
```

| Methods                            | Description                                                                           |
| ---------------------------------- | ------------------------------------------------------------------------------------- |
| add(element)                       | Adds an element if it is not already present.                                         |
| remove(index)                      | Removes the specified element from the set.                                           |
| contains(element)                  | Returns `true` if the set contains the specified element.                             |
| addAll(Collection< ? extends E> c) | Adds all of the elements from the specified collection to this set.                   |
| retainAll(Collection< ? > c)       | Retains only the elements in this set that are contained in the specified collection. |
| removeAll(Collection < ? > c)      | Removes all elements in this set that are also in the specified collection.           |
| clear()                            | Removes all elements from the set.                                                    |

##### Maps
Stores key-value pairs and does not extend Collection (HashMap, TreeMap, LinkedHashMap).
```java
Map<String, Integer> hashMap = new HashMap<>();  // Stores elements in a hash table, does not maintain order

// TreeMap: Sorted map based on keys
// LinkedHashMap: Maintains insertion order
```

| Methods                          | Description                                                                             |
| -------------------------------- | --------------------------------------------------------------------------------------- |
| put(key, value)                  | Associates the specified value with the specified key.                                  |
| putIfAbsent(key, value)          | Associates the specified value with the specified key if it’s not already mapped.       |
| get(key)                         | Returns the value associated with the specified key, or `null` if not found.            |
| remove(key)                      | Removes the mapping for the specified key.                                              |
| containsKey(key)                 | Returns `true` if the map contains the specified key.                                   |
| containsValue(value)             | Returns `true` if the map maps one or more keys to the specified value.                 |
| keySet()                         | Returns a `Set` view of the keys contained in this map.                                 |
| values()                         | Returns a `Collection` view of the values contained in this map.                        |
| entrySet()                       | Returns a `Set` view of the mappings contained in this map.                             |
| replace(key, oldValue, newValue) | Replaces the entry for the specified key only if currently mapped to a specified value. |
##### Queues
Follows FIFO (First-In-First-Out) (LinkedList, PriorityQueue).
```java
Queue<Integer> queue = new LinkedList<>();  // LinkedList implements Queue and Dequeue

// PriorityQueue: Elements are ordered based on priority
```

| Methods                     | Description                                                                                               |
| --------------------------- | --------------------------------------------------------------------------------------------------------- |
| add(element)                | Adds an element at the end of the queue; throws an exception if the queue is full.                        |
| offer(element)              | Adds an element at the end of the queue; returns `false` if the queue is full (useful in bounded queues). |
| poll()                      | Retrieves and removes the head of the queue; returns `null` if the queue is empty.                        |
| remove()                    | Retrieves and removes the head of the queue; throws an exception if the queue is empty.                   |
| peek()                      | Retrieves but does not remove the head of the queue; returns `null` if the queue is empty.                |
| element()                   | Retrieves but does not remove the head of the queue; throws an exception if the queue is empty.           |
### Mathematics Basics
##### Digits Counting and Extraction
In many algorithms we need to manage each digit of a number individually.

![[Maths Digit Extracting| 1000 | center]]
By applying the modulus operator on a division by 10 we get the last digit of that particular number. Then we divide by 10 on a normal division operation to decrease the original number, which is a count of digits.

<u>NOTE</u>: Another way of counting digits is applying a log10 to the number and adding one, (digits count = (int)log10(n) + 1).

##### Number Reversing
```java
int digit;
int reverse = 0;

while (n > 0){
	digit = 10 % n;
	reverse = (reverse * 10) + digit;
	n = n / 10;
}
```

##### Greatest Common Divisor (GCD) / Highest Common Factor (HCF)
The concept of GDC/HCF between two numbers is very used in algorithms.
![[GCD-HCF| 1000 | center]]
###### Common Divisors - Optimal Implementation O(sqrt(n))
```java
for (int i = 1; i * i <= n; i++){
	if (n % i == 0){ 
		System.out.print(i);
		if ((n / i) != i){
			System.out.print(n / i);
		}
	}
}
```

##### Euclidean Algorithm
Allows for a better efficiency algorithm to discover the GCD/HCF between two numbers. We run the algorithm until a-b is zero or the next a-b becomes negative, this way we've truncated the GCD range to a smaller size.
![[Euclidean Algorithm| 1000 | center]]
But this may not give us a better time complexity but we can learn from this algorithm and create this:
```java
while(a > 0 && b > 0){
	if (a > b){ a = a % b; }
	else { b = b % a; }
}

if (a == 0) { gcd = b; }
else { gcd = a; }
```
This algorithm has time complexity of O( log_phy(min(a, b)) ).

### Recursion Basics
Recursion is when a function calls itself until a specified condition is met. 
A problem we can easily face is a segmentation fault (stack overflow) if we loop a recursive function without a proper break condition.
![[99 RESOURCES/EXCALIDRAW/Recursion| 1000 | center]]
##### Using Parameters
One way of doing recursion is through a control parameter.
```java
public static void sumN(int n, int sum){  // main -> sumN(3, 0)
	if (n < 1){
		System.out.print(sum);
		return;
	}

	sumN(n - 1, sum + n);
}
```
![[Parameterized Recursion | center]]

##### Using Functions
Another way of doing recursion is allowing the function itself to act as a controlling mechanism.
```java
public static void sumN(int n){  // main -> sumN(3)
	if (n == 0){
		return 0;
	}

	return n + sumN(n - 1);
}
```
![[Functional Recursion | center]]

##### Example - Reversing Array (Double pointer method)
We can use recursion to solve double pointer exercises rather than running for loops.
```java
public static void reverse(int[] array, int left, int right){
	if (left >= right){
		return;
	}
	
	int tmp = array[right];
	array[right] = array[left];
	array[left] = tmp;

	return reverse(array, left + 1, right - 1);
}
```

##### Multiple Recursion Calls
A good example to explain multiple recursion calls is implementing a recursion function that calculates the Fibonacci-s n-th number.
```java
public static int fibonacci(int n){
	if (n <= 1){
		return n;
	}

	return fibonacci(n - 1) + fibonacci(n - 2);  // fibonacci(n-1) is called first
}
```
![[Fibonacci Recursion Tree| 1000 | center]]
<u>TIME COMPLEXITY</u>: Fibonacci is O(~2^n) - exponential nature.

### Hashing Basics
##### Hashing
Hashing is a technique used to efficiently map data to fixed-size values, often called hash codes. It's often preferred over linear search due to it having a time complexity of O(1) of search.

In the context of counting or tracking frequencies, we use hashing to efficiently store and retrieve counts of items. Instead of repeatedly scanning an array or data structure with a loop, we can use a hash function to map each element to a unique position in an array, where the value at that position will store the count or frequency of the element.

For example, instead of iterating through an array every time you need to count how many times a number appears, you can use hashing to store the counts directly, making the process much faster.

##### Array Hashing
Array hashing is a simple form of hashing where we use an array to keep track of frequencies or counts of numbers or characters. The idea is to map each element of the original array to an index in the hash array and store the frequency of that element in the corresponding index.

<u>TIME COMPLEXITY</u>: O(1) on fetching and O(N) on pre-storing.

<u>NOTE</u>: The hash array must be of length of the maximum number that shows up in the original array + 1.
![[Array Hashing | center]]
```java
public static int[] intArrayHashing(int[] array, int maxNumber){
	int[] hash = new int[maxNUmber + 1];

	// Hashing for integers
	for (int i = 0; i < array.length; i++){
		hash[array[i]] += 1;
	}

	// Hashing for lowercase characters
	for (int i = 0; i < array.length; i++){
		hash[array[i] - 'a'] += 1;
	}
	return hash;
}
```
Basically, we take the number of the original array in the i-th position to match that number as a position of the hash array and then increment that position's value by one.

##### Maps Hashing
(insert very summary description of using maps/HashMaps for hashing instead of arrays)
Unlike the arrays it doesn't need to initialize space for numbers that won't exist.

<u>TIME COMPLEXITY</u>: Ordered maps are O(log(N)) for all scenarios (best, average, worst). While unordered maps have time complexity of O(1) for best and average scenario and O(N) for worst scenario (collisions).

![[Map Hashing | center]]
```java
public static int[] intMapHashing(int[] array){
	HashMap<Integer, Integer> map = new HashMap<>();

	// Hashing for integers
	for (int num : array){
		map.put(num, map.getOrDefault(num, 0) + 1); // Increments the value
	}

	or 

	for (int i = 0; i < array.length; i++){
		if (map.containsKey(array[i])){
			map.put(array[i], map.get(array[i]) + 1);
		}
		else {
			map.put(array[i], 1);	
		}
	}
	return hash;
}
```

##### Collisions in Hash Maps
A collision occurs when multiple keys hash to the same index. If many values land in the same "bucket", the map needs to traverse those values, leading to worst-case time complexity of O(N), which happens if the hash map is poorly distributed or overloaded.

##### Division Rule of Hashing
The division method is a common technique for hashing, where the key is divided by a number (usually a prime) and the remainder is used as the index in the hash table. This helps in distributing keys uniformly across the hash table, minimizing collisions.
![[Hash Map Division and Chaining Method | center]]