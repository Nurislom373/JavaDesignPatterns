# Flyweight

Flyweight Design Pattern xotirani kamaytirish uchun ishlatiladi. U object yaratish qiyin bolgan ilovalarda ish
faoliyatni yaxshilashi mumkin.

Flyweight Design Pattern ko'p sonlin objectlarni samarali qo'llab quvvatlash uchun almashishdan foydalaning.

Flyweight Patterni asosiy tushunchasi intrinsic(ichki) va extrinsic(tashqi) holat o'rtasidagi farq. Ichki holat
Flyweightda saqlanadi. Tashqi holat Flyweight contextga bog'liq va o'zgarib turadi, shuning uchun uni share(baham)
ko'rish mumkin emas.

## Example

- Java dagi Wrapper classlarni valueOf() static methodi har doim ham yani object yaratmaydi. Ushbu method cacheda
object mavjudligini tekshiradi. Agar u cacheda topilsa, u qaytariladi.

- JVM dagi String Pool - Flyweight patternga yana bir misoldir. intern() methodini chaqirganingizda, cachelangan 
objectni ham qaytarishi mumkin. 
