# Proxy Design Pattern

Proxy Design pattern bu boshqa object uchun o'rinbosar yoki o'rinbosarni taqdim etish imkoni beruvchi structural design
pattern. Proxy asl objectga kirishni nazorat qiladi, bu sizga request asl objectga o'tishidan oldin yoki keyin biror 
narsani bajarishga imkon beradi. 

Proxy Patternni asl object bilan bir xil interfacega ega yangi proxy classni yaratishini taklif qiladi. Clientdan
so'rovni olgandan so'ng, proxy haqiqiy objectni yaratadi va unga barcha ishlarni topshiradi.

Proxy mo'ljallangan object va tashqi dunyo o'rtasidagi to'g'ridan-to'g'ri aloqani cheklashni istagan vaziyatlar mavjud.
Buning turli sabablari bor. Misol uchun, siz qo'shimcha qimmatli qog'ozlarni ilgari surayotgan bo'lishingiz mumkin,
javob berish vaqtni yaxshilashingiz kerak, sizda ba'zi resurs cheklovlari bo'lishi mumkin yoki yakuniy mahsulot hali
ishlash chiqish bosqichida. 

Proxies har xil turdagi bo'lishi mumkin, lekin asosan ular asl objectning o'rnini bosuvchi (yoki to'ldiruvchi) 
hisoblanadi. Natijada, mijoz proxy objecti bilan o'zaro aloqada bo'lganda, u to'g'ridan-to'g'ri haqiqiy object bilan
gaplashayotgandek ko'rinadi. Qisqa qilib aytganda ushbu patterndan foydalanib, siz asl classga interface sifatida
ishlay oladigan classdan foydalanishingiz mumkin.

## Applicability

* (protection proxy) Kirishni nazorat qilish uchun. Bu faqat ma'lum mijozlar xizmat ko'rsatish objectidan foydalanishi kerak bo'lganda
ishlatishimiz mumkin. 

* (logging proxy) Requestlarni ro'yxatdan o'tkazish. Bu service objectiga requestlar tarixni saqlamoqchi bo'lgan vaqtda
ishlatishimiz mumkin.

* (caching request results) So'rov natijalarni cachelash. Mijoz requestlarni cachelash va ushbu cachning hayot aylanishini
boshqarish kerak bo'lganda, ayniqsa natijalar juda katta bo'lsa.

## Example

