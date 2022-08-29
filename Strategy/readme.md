# Strategy Pattern

In Strategy pattern, a class behavior or its algorithm can be changed at run time. This type of design pattern comes under behavior pattern.

In Strategy pattern, we create objects which represent various strategies and a context object whose behavior varies as per its strategy object. The strategy object changes the executing algorithm of the context object.

## Implementation

We are going to create a Strategy interface defining an action and concrete strategy classes implementing the Strategy interface. Context is a class which uses a Strategy.

StrategyPatternDemo, our demo class, will use Context and strategy objects to demonstrate change in Context behaviour based on strategy it deploys or uses.

![img](src/main/resources/img/strategy_pattern_uml_diagram.jpg)

### Step 1

Create an interface.

Strategy.java
```java
public interface Strategy {
   public int doOperation(int var1, int var2);
}
```

### Step 2

Create concrete classes implementing the same interface.

OperationAdd.java

```java
public class OperationAdd implements Strategy{
   @Override
   public int doOperation(int var1, int var2) {
      return var1 + var2;
   }
}
```

OperationSubstract.java

```java
public class OperationSubstract implements Strategy{
   @Override
   public int doOperation(int var1, int var2) {
      return var1 - var2;
   }
}
```

OperationMultiply.java

```java
public class OperationMultiply implements Strategy{
   @Override
   public int doOperation(int var1, int var2) {
      return var1 * var2;
   }
}
```

### Step 3

Create Context Class.

Context.java

```java
public class Context {
   private Strategy strategy;

   public Context(Strategy strategy){
      this.strategy = strategy;
   }

   public int executeStrategy(int num1, int num2){
      return strategy.doOperation(num1, num2);
   }
}
```

### Step 4

Use the Context to see change in behaviour when it changes its Strategy.

StrategyPatternDemo.java

```java
public class App {
    public static void main(String[] args) {
        Context contextAdd = new Context(new OperationAdd());
        System.out.println(contextAdd.executeStrategy(10, 5));

        Context contextSubstract = new Context(new OperationSubstract());
        System.out.println(contextSubstract.executeStrategy(10, 5));

        Context contextMultiply = new Context(new OperationMultiply());
        System.out.println(contextMultiply.executeStrategy(10, 5));
    }
}
```

### Step 5

output

```java
10 + 5 = 15
10 - 5 = 5
10 * 5 = 50
```

# Translate

Strategy dizayn pattern behavirol design patterniga kiradi.
Strategiya namunasi bizda ma'lum bir vazifa uchun bir nechta 
algoritmga ega bo'lganda foydalaniladi va mijoz ish vaqtida 
foydalanish uchun haqiqiy dasturni hal qiladi.