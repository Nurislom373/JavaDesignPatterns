# Memento

Memento - (Snapshot) bu objectni amalga oshirish tafsilotlarini oshkor qilmasdan saqlash va avvalgi holatini tiklash imkonini 
beruvchi behavioral pattern. Qisqa qilib aytganda object eski holatini saqlab uni yana qayta tiklash imkonini beruvchi pattern.
Agar siz bekor qilish va orqaga qaytarish funksiyasiga ega bo'lgan ilovani ishlab chiqmoqchi bo'lsangiz, Memento
Design Pattern-dan foydalaning.

Memento Patternni kontseptsiyasini tushinish uchun oddiy misol Ctrl + Z. Text yozganimi asosan hato qilsa eski holatiga
qaytamiz shu joyida yana qayta davom etishimiz mumkin.

Memento Design Pattern 3ta componentdan iborat ular Originator, Carataker va Memento.

![img](etc/images/W3sDesign_Memento_Design_Pattern_UML.jpg)

 - `Originator` - holati saqlab qolishimiz kerak bo'lgan object. Asosan Originator objecti ichki holatini saqlash uchun
`Memento` objectini yaratadi.
 - `Caretaker` - Originator haqida kuzatuv olib boruvchi object. Asosan Caretaker Originator nima uchun va qachon o'zini
saqlashi va tiklashi kerakligini biladi.
 - `Memento` - Asosiy holatini va qidirish imkoniyatlarini o'z ichiga olgan object. Odatda, Mementor objecti o'zgarmasdir
va u ma'lumotlarni constructor orqali faqat bir marta uzatadi.

# Java Example

```java
import java.util.List;
import java.util.ArrayList;
class Originator {
    private String state;
    // The class could also contain additional data that is not part of the
    // state saved in the memento..
 
    public void set(String state) {
        this.state = state;
        System.out.println("Originator: Setting state to " + state);
    }
 
    public Memento saveToMemento() {
        System.out.println("Originator: Saving to Memento.");
        return new Memento(this.state);
    }
 
    public void restoreFromMemento(Memento memento) {
        this.state = memento.getSavedState();
        System.out.println("Originator: State after restoring from Memento: " + state);
    }
 
    public static class Memento {
        private final String state;

        public Memento(String stateToSave) {
            state = stateToSave;
        }
 
        // accessible by outer class only
        private String getSavedState() {
            return state;
        }
    }
}
 
class Caretaker {
    public static void main(String[] args) {
        List<Originator.Memento> savedStates = new ArrayList<Originator.Memento>();
 
        Originator originator = new Originator();
        originator.set("State1");
        originator.set("State2");
        savedStates.add(originator.saveToMemento());
        originator.set("State3");
        // We can request multiple mementos, and choose which one to roll back to.
        savedStates.add(originator.saveToMemento());
        originator.set("State4");
 
        originator.restoreFromMemento(savedStates.get(1));   
    }
}
```