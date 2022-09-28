public class Main {
    public static void main(String[] args) {
        // задание 1
        int age = 17;
        if(age >= 18) {
            System.out.println("Поздрравляем вас с совершенолетием");
        } if ( age< 18) {
            System.out.println("Нужно еще подождать до совершенолетия");
        }
        // задание 2
        System.out.println("задание 2");
        if(age >= 7 && age < 18){
            System.out.println("Ребенок ходит в школу");
        }
        if (age >= 18 && age <24){
            System.out.println("Человек ходит в университет");
        }
        if ( age >= 24){
            System.out.println("человек ходит на работу");
        }
        // задание 3
         int capacity = 102;
         int seatsCount = 60;
         int otherCount = capacity - seatsCount;

         int seatsUsed = 59;
         int otherUsed = 41;
         if (seatsUsed < seatsCount) {
             System.out.println("Eсть еще " + (seatsCount + seatsUsed) + " сидячих мест");
         }
         if( otherUsed < otherCount) {
             System.out.println("Есть еще " + (otherCount - otherUsed) + " стоячих мест");
         }

    }
}