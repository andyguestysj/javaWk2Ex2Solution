1. Make a class called `Point` which contains `x` and `y` coordinates as `double` values.
2. Add a method called set which looks like this:

```java
void set (double x, double y) {
// something
}
```

and fill it in so that calling `set` on an object sets the `x` and `y` values of the object.
3. Test your new method by running the program
4. Modify you `main()` as shown below

```java
    Point a = new Point();
    a.set(4.1 , 5.6);

    Point b = new Point();  
    b.set(9.6 , 10.7);
    
    Point c = new Point();  
    c.set(105.9 , 87.1);

    Point d = b;  
    d.set(5.2 , 10.9);


    System.out.println("a is " + a.x + " " + a.y);  
    System.out.println("b is " + b.x + " " + b.y);  
    System.out.println("c is " + c.x + " " + c.y);
}
```
Predict the output and then run the program to check your prediction.
5. Add a method `distance` that looks like this 

```java
double distance( Point other) {
// something
}
```
this method should calculate the distance between the point it is called on and the one that is passed in as `other`.  
Write the `distance` method and test it by adding the following line to the end of `main`  

```java
System.out.println(a.distance(b));
```
Make sure that it the program outputs approximately 7.500666637039671.  

6. Add a new method `add` like this

```java
void add(Point other) {

}
```
which adds the `point` referred to by `other` to the `point` that the method is called on. The method should add the `x` value of `other` to the `x` value of `this`, and do the same with the `y` value.



