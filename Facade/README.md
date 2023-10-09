# Facade

## GoF Definition

Quyi tizimdagi interfacelar to'plamiga yagona interfaceni taqdim etadi. Facade namunasi quyi tizimdan foydalanishni 
osonlashtiradigan yuqori darajadagi interfaceni belgilaydi.

---

It provides a unified interface to a set of interfaces in a subsystem. The Facade pattern
defines a higher-level interface that makes the subsystem easier to use.

## Concept

Tizimning quyi tizimlarga tuzilishi murakkablikni kamaytirishga yordam beradi. Dizaynning umumiy maqsadi quyi tizimlar
orasidagi aloqa va bog'liqlikni minimallashtirishdir. Ushbu maqsadga erishish yo'llaridan bir quyi tizimning umumiy
imkoniyatlariga yagona, soddalashtirilgan interfaceni ta'minlaydigan facade objectni e'lon qilishdir.

Facadega oddiy misol. Aytaylik, ilova bir nechta classlarga ega va ularning har biri bir nechta methodlardan iborat.
Mijoz ushbu classlardagi methodlarning kombinatsiyasidan foydalangan holda mahsulotni yaratishi mumkin, ammo ular qaysi
classlarni tanlashni va ushbu konstruksiyaning chaqiruv ketma-ketligini bilan qanday methodlardan foydalanishni eslab
qolishlari kerak. Bu ishlab chiquvchilar uchun yaxshi bo'lishi mumkin, ammo mijozlarning hayotini qiyinlashtiradi.

Facade Design Pattern qisa qilib aytganda, facade oddiy interface orqasida murakkab quyi tizimni qamrab oladi. Bu
murakkablikning katta qismini yashiradi va quyi tizimdan foydalanishni osonlashtiradi.

Facade Design Pattern qisa qilib aytganda, facade oddiy interface orqasida murakkab quyi tizimni qamrab oladi. Bu
murakkablikning katta qismini yashiradi va quyi tizimdan foydalanishni osonlashtiradi.

---

Provide a unified interface to a set of interfaces in a subsystem. Facade defines a
higher-level interface that makes the subsystem easier to use.

Structuring a system into subsystems helps reduce complexity.A common design
goal is to minimize the communication and dependencies between subsystems.
One way to achieve this goal is to introduce a facade object that provides a single,
simplified interface to the more general facilities of a subsystem.

Consider a simple case. Let’s say an application has multiple classes and each consists of multiple methods. A client
can make a product using a combination of methods from these classes, but they need to remember which classes to pick
and which methods to use with the calling sequence of these constructs. It can be ok for a developer, but it makes a
client's life difficult. It is also challenging if there are lots of variations among these products.

![img](static/img.png)

## Structure

![img2](static/img_1.png)

1. Facade quyi tizim funksiyalarining ma'lum bir qismiga qulay kirishni ta'minlaydi. U mijozning so'rovini qayerga
   yo'naltirishni va barcha harakatlanuvchi qismlarni qanday ishlashni biladi.



