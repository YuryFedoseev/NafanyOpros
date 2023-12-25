import java.util.Scanner;

public class oprosadapter {
    public static void main(String[] args){
        Scanner kbd = new Scanner (System.in);

        String firstChoice = "выбрали 1";
        String secondChoice = "выбрали 2";
        String decision;
        Integer countChoice ;


        //Ввод пароля
        boolean passwordTest = true;
        while (passwordTest){
            System.out.println("Введите пароль");
            String password = kbd.nextLine();
            switch(password){
                case "admin":
                    passwordTest = true;
                    System.out.println("Пароль: Дата рождения Верховной через запятые по магловскому календарю ");
                    break;

                case "26,12,1994":
                    passwordTest = false;
                    break;

                default:
                    System.out.println("Увы, пароль не соответствует требованиям, пытайтесь лучше ");

            }
        }

        System.out.println("Добро пожаловать в систему решения проблем и принятия решений. \n");

        //Выбор варианта
        boolean choiceTest = true;
        while(choiceTest)
        {
            System.out.println(" Это зеркало души. Выбирайте с умом. \n 1 - Использовать древнюю магию против магов отступников и помочь маглам \n 2 - Запечатать древнюю магию на 100 лет и не мешать магам рушить мир");
            String choice = kbd.nextLine();

            System.out.println("Вы уверены, что хотите выбрать " + choice + " ? " );

            System.out.println(" да или нет ");
            decision = kbd.nextLine();


            switch(decision)
            {
                case "нет":
                    choiceTest = true;
                    System.out.println("Таааакс, посмотрим что тут у нас \n");
                    break;

                case "да":
                    choiceTest = false;
                    System.out.println("Вы Верховная, Вам лучше знать");
                    break;

                default:
                    System.out.println("Не смогло понять Ваш выбор ");
                    boolean repeat = true;

                    while (repeat)
                    {
                        System.out.println("Вы уверены, что хотите выбрать " + choice + " ? " );

                        System.out.println(" да или нет ");
                        decision = kbd.nextLine();

                        switch (decision)
                        {
                            case "нет":
                                choiceTest = true;
                                repeat = false;
                                break;

                            case "да":
                                choiceTest = repeat = false;
                                System.out.println("Вы Верховная, Вам лучше знать");
                                break;
                            default:
                                System.out.println("Не смогло понять Ваш выбор ");
                                repeat = true;
                        }
                    }
                    break;
            }
if (choice == "1"){
    System.out.println(firstChoice);
}
else {
    System.out.println(secondChoice);
}
        }
    }
}
