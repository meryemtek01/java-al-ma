package halukh_taskÇalışma.InterviewQuestions;

public class Q29_SurviveMonkey {
    /* Task->
    There is a lonely monkey in the island
    He needs to eat 4 bananas every day
    there are just 165 bananas in that island
    Create following variables and find how many days
    monkey can survive.
    Use do while loop, increment and decrement and if statements
    int numberOfBananas =165, survivalDays = 1;
    boolean monkeyAlive = true;
    Adada yalnız bir maymun var Her gün 4 muz yemesi gerekiyor o adada sadece 165 muz var
     Aşağıdaki değişkenleri oluşturun ve maymunun kaç gün hayatta kalabileceğini bulun.
     do while döngüsü, artırma ve azaltma ve if ifadelerini kullanın int numberOfBananas = 165, survivalDays = 1; boolean maymunAlive = true;
    */
    public static void main(String[] args) {
        int numberOfBananas =165 ;
        boolean monkeyAlive = true;
        int survivalDays = 1;
        do {
            numberOfBananas-=4;
            survivalDays++;//adada yasadıgı gun sayısı 1 arttı

            if (numberOfBananas<4){
                monkeyAlive=false;
                System.out.println("agam bugün  "+ survivalDays+" .gün muz bitti maymun bizimle degil");
            }else System.out.println("agam bugün  "+ survivalDays+" .gün muz bitmedi maymun bizimle");



        }while (monkeyAlive);


    }

}

