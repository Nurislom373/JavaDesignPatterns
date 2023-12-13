# Factory Method

Factory Method - Creational Design Pattern bo'lib qisqacha qilib aytganda objectlarni yaratish uchun interface yoki
abstract classni ta'minlaydigan design pattern va uning subclassi qaysi classni yaratishni tanlash imkonini beradi.

## Example

Tushinish oson bo'lishi uchun uchun, faraz qilaylik mashina ishlab chiqaruvchi zavod bor biz unga mashina nomini beramiz
va u biz bergan mashina nomiga qarab bizga kerakli mashinani yetkazib beradi. 

## Pattern Diagram

![img1](static/images/img.png)

### Class Diagram

![img](src/main/resources/etc/img.png)

## Step 1

create `Coin` interface

```Java
public interface Coin {
    String getDescription();
}
```

and create two implementations classes `SilverCoin` and `GoldCoin`

```java
public class SilverCoin implements Coin {

    static final String description = "This is Silver coin.";

    @Override
    public String getDescription() {
        return description;
    }
}

public class GoldCoin implements Coin {

    static final String description = "This is Gold coin.";

    @Override
    public String getDescription() {
        return description;
    }
}
```

## Step 2

returns an object instance of the type entered

```java
@RequiredArgsConstructor
@Getter
public enum CoinType {

    SILVER(SilverCoin::new),
    GOLD(GoldCoin::new);

    private final Supplier<Coin> constructor;
}
```

```java
public abstract class CoinFactory {

    public static Coin getCoin(CoinType type) {
        return type.getConstructor().get();
    }
}
```

## Step 3

```java
public class App {
    public static void main(String[] args) {
        Coin coinSilver = CoinFactory.getCoin(CoinType.SILVER);
        Coin coinGold = CoinFactory.getCoin(CoinType.GOLD);
        System.out.println("coinGold = " + coinGold.getDescription());
        System.out.println("coinSilver = " + coinSilver.getDescription());
    }
}
```

# Translate

Zavod dizayni namunasi bizda bir nechta kichik sinflarga ega bo'lgan
va kiritilgan ma'lumotlarga asoslanib, biz quyi sinflardan birini 
qaytarishimiz kerak bo'lgan superklassga ega bo'lganimizda ishlatiladi.
Ushbu naqsh mijoz dasturidan zavod sinfiga sinfni yaratish mas'uliyatini
o'z zimmasiga oladi. Biz zavod sinfida Singleton naqshini qo'llashimiz
yoki zavod usulini statik qilishimiz mumkin. Masalan, dastur va zavod
naqshining afzalliklari uchun Zavod dizayni namunasini tekshiring. 
Bu eng ko'p ishlatiladigan java dizayn naqshlaridan biridir.
